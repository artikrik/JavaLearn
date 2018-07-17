package w9;

import java.util.*;


public class FlightList {

    public static final Comparator<Flight> PRICE_COMPARATOR = (o1, o2) -> o1.getPrice() - o2.getPrice();
    public static final Comparator<Flight> DISTANCE_COMPARATOR = (o1, o2) -> o1.getDistance() - o2.getDistance();
    public static final Comparator<Flight> AIRLINE_COMPARATOR = (o1, o2) -> o1.getAirline().compareTo(o2.getAirline());
    public static final Comparator<Flight> PLANETYPE_COMPARATOR = (o1, o2) -> o1.getPlaneType().compareTo(o2.getPlaneType());

    private List<Flight> flights = new ArrayList<>();

    public void printByPrice() {
        Collections.sort(flights, PRICE_COMPARATOR);
        print(flights);
    }

    public void printByDistance() {
        Collections.sort(flights, DISTANCE_COMPARATOR);
        print(flights);
    }

    public void printByAirlineAndByPrice() {
        Collections.sort(flights, AIRLINE_COMPARATOR.thenComparing(PRICE_COMPARATOR));
        print(flights);
    }

    public void printByDistanceAndPlaneType() {
        Collections.sort(flights, DISTANCE_COMPARATOR.thenComparing(PLANETYPE_COMPARATOR));
        print(flights);
    }


    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public List getList() {
        return flights;
    }

    public void print(List<Flight> flights) {
        Iterator<Flight> iterator = flights.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

    public List<Flight> findByAirline(String airline) {
        List<Flight> tmp = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getAirline().equals(airline)) {
                tmp.add(flight);
            }
        }
        return tmp;
    }

    public List<Flight> findByFlightNumber(String flightNumber) {
        List<Flight> tmp = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                tmp.add(flight);
            }
        }
        return tmp;
    }

    public List<Flight> findByTiсketPrice(int tiсketPrice) {
        List<Flight> tmp = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getPrice() == (tiсketPrice)) {
                tmp.add(flight);
            }
        }
        return tmp;
    }

    public void removeFlightByFlightNumber(String flightNumber) {
        int counter = 0;
        Iterator<Flight> iterator = flights.iterator();
        while (iterator.hasNext()) {
            Flight flight = iterator.next();
            if (flight.getFlightNumber().equals(flightNumber)) {
                iterator.remove();
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Номер " + flightNumber + " не найден.");
        } else {
            System.out.println(counter + " элементов удалено.");
        }
    }

    public void removeFlightByPlaneType(PlaneType planeType) {
        int counter = 0;
        Iterator<Flight> iterator = flights.iterator();
        while (iterator.hasNext()) {
            Flight flight = iterator.next();
            if (flight.getPlaneType().equals(planeType)) {
                iterator.remove();
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Модель " + planeType + " не найдена.");
        } else {
            System.out.println(counter + " элементов удалено.");
        }
    }


    public boolean contains(FlightList flightList2) {
        Set<Flight> flightSet = new HashSet<>(this.flights);
        flightSet.retainAll(flightList2.flights);

        return flights.containsAll(flightList2.flights);
    }
}
