package com.company.w9;

import java.util.Comparator;

public class ComparatorByPlaneModel implements Comparator<Flight> {
    @Override
    public int compare(Flight o1, Flight o2) {
        if (o1.getModelOfPlane() == o2.getModelOfPlane())
            return 0;
        else return 1;
    }
}
