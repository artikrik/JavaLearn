package com.company.MarathonComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main extends RunnersList {
    public static void main(String[] args) {
        ArrayList<Marathon> m = fillListWithMarathonResults();
        Collections.sort(m, Comparator.comparing(Marathon::getName).thenComparing(Marathon::getTimeInMins));
       /* Collections.sort(m, new Comparator<Marathon>() {
            @Override
            public int compare(Marathon o1, Marathon o2) {
                if (o1.getName().compareTo(o2.getName()) != 0)
                    return o1.getName().compareTo(o2.getName());
                else
                    return (int)(o1.getTimeInMins() - o2.getTimeInMins());
            }
        });*/
        printList(m);
        sortList(m);
        System.out.println("3 Marathon winners with the results: ");
        printList(findWinners(m));
    }
}
