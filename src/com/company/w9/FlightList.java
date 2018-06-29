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

    public void sortByAirLineByNameOrByDistance() {
        Collections.sort(flightArrayList, new ComparatorByAirlineByPrice());
    }

    public void sortByDistance() {
        Collections.sort(flightArrayList, new Comparator<Flight>() {
            @Override
            public int compare(Flight o1, Flight o2) {
                return Double.compare(o1.getDistance(), o2.getDistance());
            }
        });
    }

    public void  sortByPrice(){
        Collections.sort(flightArrayList, new ComparatorByPrice());
    }

    public void sortByDistanceByPlaneFirmByPlaneModel(){
        //Collections.sort(flightArrayList, new ComparatorByPrice()); переделать для расстояния
    }

    public void printFlightList() {
        ListIterator<Flight> iterator = flightArrayList.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

}

