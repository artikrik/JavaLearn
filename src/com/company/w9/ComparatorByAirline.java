package com.company.w9;

import java.util.Comparator;

public class ComparatorByAirline implements Comparator<Flight> {
    @Override
    public int compare(Flight o1, Flight o2) {
        return o1.getAirline().compareTo(o2.getAirline());
    }
}
