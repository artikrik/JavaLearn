package com.company.flight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightsInfo {
    Set<Flight> flights = new HashSet<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public List<Flight> sort(SORT_BY sortBy){
        List list = new ArrayList<Flight>();
        list.addAll(flights);
        switch (sortBy){
            case PRICE:
                Collections.sort(list, Comparator.comparing(Flight::getPrice));
                break;
            case DISTANCE:
                Collections.sort(list, Comparator.comparing(Flight::getDistance));
                break;
            case COMPANY_AND_PRICE:
                Collections.sort(list, Comparator.comparing(Flight::getCompany).thenComparing(Flight::getPrice));
                break;
            case DISTANCE_AND_PLANE:
                Collections.sort(list, Comparator.comparing(Flight::getDistance).thenComparing(Flight::getPlaneName));
                break;
        }
        return list;
    }

    public enum SORT_BY{
        PRICE, DISTANCE, COMPANY_AND_PRICE, DISTANCE_AND_PLANE
    }

    public List<Flight> findFlightByNumber(String flightNumber) {
        return flights.stream()
               .filter(o->o.getFlightNumber().equals(flightNumber))
               .collect(Collectors.toList());
    }

    public List<Flight> findFlightByCompany(String company) {
        return flights.stream()
                      .filter(o->o.getCompany().equals(company))
                      .collect(Collectors.toList());
    }

    public List<Flight> findFlightByPrice(Double price) {
        return flights.stream()
                      .filter(o->o.getPrice().equals(price))
                      .collect(Collectors.toList());
    }

    public void deleteFlightByNumber(String flightNumber) {
        Iterator<Flight> iter = flights.iterator();
        while (iter.hasNext()) {
            Flight flight = iter.next();
            if (flight.getFlightNumber().equals(flightNumber))
                iter.remove();
        }
    }

    public void deleteFlightByPlane(String word) {
        Iterator<Flight> iter = flights.iterator();
        while (iter.hasNext()) {
            Flight flight = iter.next();
            if (flight.getPlaneName().contains(word))
                iter.remove();
        }
    }

    @Override
    public String toString() {
        return "FlightsInfo{" +
                "flights=" + flights +
                '}';
    }

    public void print() {
        flights.stream().forEach(System.out::println);
    }
}
