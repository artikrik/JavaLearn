package com.company.W6.WineCollectionComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;

public class WineCollectionComparable {
    public static void main(String[] args) {

        ArrayList<NewYoungWine> winesSet  = new ArrayList<>();

        winesSet.add(new NewYoungWine("Red flower", "France", new GregorianCalendar(2011, 11, 12)));
        winesSet.add(new NewYoungWine("Red", "France", new GregorianCalendar(2013, 1, 12)));
        winesSet.add(new NewYoungWine("White", "France", new GregorianCalendar(2010, 1, 12)));

        NewYoungWine youngestWine = Collections.min(winesSet);

        for (NewYoungWine wine : winesSet) {
            if (youngestWine.compareTo(wine) == 0) {
                System.out.println(wine.toString());
            }
        }
    }
}
