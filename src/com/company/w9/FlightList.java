package com.company.w9;

import java.util.*;

public class FlightList {
    ArrayList<Flight> flightArrayList = new ArrayList<>();

    public void addFlight(Flight exampleOfFlight) {
        flightArrayList.add(exampleOfFlight);
    }

    public void removeFligtByName(Enum name) {
        flightArrayList.remove(name);
    }

    public void removeFligtById(String id) {
        flightArrayList.remove(id);
    }


    public void sortByDistance() {
        Collections.sort(flightArrayList, new ComparatorByDistance().thenComparing(new ComparatorByPlaneFirm()));
    }

    public void  sortByPrice(){
        Collections.sort(flightArrayList, new ComparatorByPrice());
    }

    public void sortByAirLineNameThenByPrice() {
        Collections.sort(flightArrayList, new ComparatorByAirline().thenComparing(new ComparatorByPrice()));
    }

    public void sortByDistanceByPlaneFirmByPlaneModel(){
        Collections.sort(flightArrayList, Comparator.comparing(Flight::getDistance).thenComparing(new ComparatorByPlaneFirm()).thenComparing(new ComparatorByPlaneModel()));
    }

    public void printFlightList() {
        ListIterator<Flight> iterator = flightArrayList.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

}

