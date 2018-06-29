package com.company.w9;

import java.util.Comparator;

public class ComparatorByAirlineByPrice implements Comparator<Flight> {
    @Override
    public int compare(Flight o1, Flight o2) {
        if(o1.getAirline().compareTo(o2.getAirline())!=0)
        return o1.getAirline().compareTo(o2.getAirline());
        else return  Double.compare(o1.getPrice(), o2.getPrice());
    }
}
