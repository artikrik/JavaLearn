package com.company.week6;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;

import com.company.week5.Wine;

public class WineCollectionComparable {
    public static void main(String[] args) {
        ArrayList<Wine> winesSet = new ArrayList<>();
        winesSet.add(new Wine("Merlo", "France", LocalDate.of(2010, Month.DECEMBER, 11)));
        winesSet.add(new Wine("Bordo", "France", LocalDate.of(2013, Month.APRIL, 22)));
        winesSet.add(new Wine("Chardonnay", "France", LocalDate.of(2015, Month.MAY, 3)));
        Wine youngestWine = Collections.min(winesSet);

        for (Wine wine : winesSet) {
            if (youngestWine.compareTo(wine) == 0) {
                System.out.println(wine.toString());
            }
        }
    }
}
