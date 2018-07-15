package com.company.w9;

import java.util.*;

public class FlightList {
   private List<Flight> flightArrayList = new ArrayList<>();

    public void addFlight(Flight exampleOfFlight) {
        flightArrayList.add(exampleOfFlight);
    }

    public void addAll(FlightList listFly){
        flightArrayList.addAll(listFly.getFlightArrayList());
    }

    public void removeFligtByName(Enum name) {
        flightArrayList.remove(name);
    }

    public void removeFligtById(String id) {
        flightArrayList.remove(id);
    }

    public List<Flight> getFlightArrayList() {
        return new ArrayList( flightArrayList);
    }

    public void printFlightList() {
        ListIterator<Flight> iterator = flightArrayList.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

    public void searchByAirline(String airLine) {
        boolean flightIsPresentInList = false;
        for (Flight flight : flightArrayList) {
            if (flight.getAirline().compareTo(airLine) == 0) {
                flightIsPresentInList = true;
                System.out.println(flight.toString());
            }
        }
        if (!flightIsPresentInList) System.out.println("Авіакомпанія " + airLine + " не існує в даному наборі");
    }

    public void searchByPrice(double price) {
        boolean flightIsPresentInList = false;
        for (Flight flight : flightArrayList) {
            if (Double.compare(flight.getPrice(), price) == 0) {
                flightIsPresentInList = true;
                System.out.println(flight.toString());
            }
        }
        if (!flightIsPresentInList) System.out.println("Виліт з вказаною ціною " + price + " не існує в даному наборі");
    }

    public void remove(String idFlight) {
        boolean flightIsPresentInList = false;
        Iterator<Flight> iterator = flightArrayList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId().equals(idFlight)) {
                iterator.remove();
                flightIsPresentInList = true;
                System.out.print("Виліт був видалений");
            }
        }
        if (!flightIsPresentInList) System.out.println("Рейс з номером " + idFlight + " не існує в даному наборі");
    }

    public void remove(AircraftType planeModel) {
        boolean flightIsPresentInList = false;
        Iterator<Flight> iterator = flightArrayList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getModel().equals(planeModel.getModel()) ) {
                iterator.remove();
                flightIsPresentInList = true;
                System.out.print("Виліт був видалений");
            }
        }
        if (!flightIsPresentInList) System.out.println("Рейс з номером " + planeModel + " не існує в даному наборі");
    }


}

