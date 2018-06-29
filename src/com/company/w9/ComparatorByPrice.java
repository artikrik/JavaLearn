package com.company.w9;

import java.util.Comparator;

public class ComparatorByPrice implements Comparator<Flight> {
    @Override
    public int compare(Flight o1, Flight o2) {
        return  Double.compare(o1.getPrice(), o2.getPrice());
    }
}
