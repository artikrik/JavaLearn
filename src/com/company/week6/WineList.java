package com.company.week6;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;

import com.company.week5.Wine;

public class WineList {
    public static void main(String[] args) {
        ArrayList<Wine> wine = getWineList();
        printWineList(getAllWinesOfSomeYear(wine, getMinimumAgeingOfWineInList(wine)));
    }

    public static ArrayList<Wine> getWineList () {
        ArrayList<Wine> wines = new ArrayList<>();
        wines.add(new Wine("Muskat", "Ukraine", LocalDate.of(2017, Month.NOVEMBER, 17)));
        wines.add(new Wine("Fragollino", "Italy", LocalDate.of(2015, Month.DECEMBER, 31)));
        wines.add(new Wine("Yellow Tail", "Australia", LocalDate.of(2013, Month.APRIL, 13)));
        wines.add(new Wine("Muskat", "Moldova", LocalDate.of(2017, Month.DECEMBER, 17)));
        wines.add(new Wine("Riesling", "Germany", LocalDate.of(2017, Month.NOVEMBER, 13)));
        return wines;
    }

    public static void printWineList (ArrayList<Wine> wines) {
        for (Wine w : wines) {
            System.out.println(w.toString());
        }
    }

    public static void sortArrayList (ArrayList<Wine> wines) {
        Collections.sort(wines,Wine.WineDateProdComparator);
    }

    public static int getMinimumAgeingOfWineInList (ArrayList<Wine> wines) {
        sortArrayList(wines);
        return wines.get(0).calculateAgeingOfWine();
    }

    public static ArrayList<Wine> getAllWinesOfSomeYear (ArrayList<Wine> wines, int age) {
        ArrayList<Wine> tmp = new ArrayList<>();
        for (Wine w : wines) {
            if (w.calculateAgeingOfWine() == age)
                tmp.add(w);
        }
        return tmp;
    }
}
