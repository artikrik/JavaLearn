package com.company.w9;

import java.util.Comparator;

public class ComparatorByPlaneFirm implements Comparator<Flight> {
    @Override
    public int compare(Flight o1, Flight o2) {
        if (o1.getPlaneProducer() == o2.getPlaneProducer())
            return 0;
        else if ((o1.getPlaneProducer().ordinal()>o2.getPlaneProducer().ordinal())) return 1;
        else return -1;
    }
}
