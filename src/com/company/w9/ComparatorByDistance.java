package com.company.w9;

import java.util.Comparator;

public class ComparatorByDistance implements Comparator<Flight> {

    @Override
    public int compare(Flight o1, Flight o2) {
        return Double.compare(o1.getDistance(), o2.getDistance());
    }
}
