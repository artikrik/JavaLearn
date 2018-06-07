package com.company.w5;

import java.util.Comparator;

public class MarathonComparator implements Comparator<Sprinter> {
    @Override
    public int compare(Sprinter o1, Sprinter o2) {
        if (o1.getName().compareTo(o2.getName()) != 0)
            return o1.getName().compareTo(o2.getName());
        else
            return o1.getTime() - o2.getTime();
    }
}
