package com.company.w6.marathon;

import java.util.Comparator;

public class MarathonComparator implements Comparator<Marathon> {
    @Override
    public int compare(Marathon o1, Marathon o2) {
        if (o1.getName().compareTo(o2.getName()) != 0)
            return o1.getName().compareTo(o2.getName());
        else return o1.getRunTime().compareTo(o2.getRunTime());
    }
}
