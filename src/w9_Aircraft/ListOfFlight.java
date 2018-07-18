package w9_Aircraft;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListOfFlight {
    private List<Flight> flightsArrayList = new ArrayList<>();


    public List<Flight> getFlightsArrayList() {
        return flightsArrayList;
    }

    public void addFlight(Flight flight) {
        flightsArrayList.add(flight);
    }

    public void sortByPrice() {
        getFlightsArrayList().sort(Comparator.comparing(Flight::getPrice));
        System.out.println(flightsArrayList);
    }

    public void sortByAirkraftName(){
        getFlightsArrayList().sort(Comparator.comparing(Flight::getAircraft));
        System.out.println(flightsArrayList);
    }

    public void sortByAircraftSerialNumber(){
        Aircraft air = Aircraft.Airbus;
        for (Aircraft element:Aircraft.values()){
            System.out.println(element+" : "+element.ordinal());
        }
    }

    public void sortByDistance() {
        getFlightsArrayList().sort(Comparator.comparing(Flight::getDistance));
        System.out.println(flightsArrayList);
    }

    public void sortByAviaCompanyAndPrice() {
        getFlightsArrayList().sort(Comparator.comparing(Flight::getAviaCompany).thenComparing(Flight::getPrice));
        System.out.println(flightsArrayList);
    }

    public void sortByAircraftAndModel() {
        getFlightsArrayList().sort(Comparator.comparing(Flight::getAircraft).thenComparing(Flight::getModel));
        System.out.println(flightsArrayList);
    }

    public void addNewFlight(Flight newNumberOfFlight) {
        flightsArrayList.add(newNumberOfFlight);
    }

    public void searchByNumberOfFlight(String numberOfFlight) {
        boolean availableFlight = false;
        for (Flight searchFlight : flightsArrayList) {
            if (searchFlight.getNumberOfFlight().compareTo(numberOfFlight) == 0) {
                availableFlight = true;
                System.out.println(searchFlight.toString());
            }
        }
        if (!availableFlight) {
            System.out.println("Data not find");
        }
    }

    public void searchByPrice(double price) {
        boolean availablePrice = false;
        for (Flight searchPrice : flightsArrayList) {
            if (Double.compare(searchPrice.getPrice(), price) == 0) {
                availablePrice = true;
                System.out.println(searchPrice.toString());
            }
        }
        if (!availablePrice) {
            System.out.println("Data not find");
        }
    }

    public void removeFlightByNumber(String numberOfFlight) {
        boolean flightIsPresent = false;
        Iterator<Flight> iter = flightsArrayList.listIterator();
        while (iter.hasNext()){
            if (iter.next().getNumberOfFlight().equals(numberOfFlight)) {
                iter.remove();
                flightIsPresent = true;
                System.out.println("Flight is remover");
            }
        }
        if (!flightIsPresent) {
            System.out.println("Data not find");
        }
    }

}