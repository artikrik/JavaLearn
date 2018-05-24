package com.company.W6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class WineCollection {
    public static void main(String[] args) {

        ArrayList<YoungWine> wineList = new ArrayList<>();
        YoungWine wine1 = new YoungWine("Red flower", "France", new GregorianCalendar(2010, 11, 12));
        YoungWine wine2 = new YoungWine("Red", "France", new GregorianCalendar(2004, 1, 12));
        YoungWine wine3 = new YoungWine("White", "France", new GregorianCalendar(2010, 1, 12));

        wineList.add(wine1);
        wineList.add(wine2);
        wineList.add(wine3);

        YoungWine minimalAgeOfWine = wineList.get(0);
        int youngWine = minimalAgeOfWine.endurance();
        ArrayList<YoungWine> wineListYoungWine=new ArrayList<>();

        for (YoungWine wine : wineList) {
            int enduranceNextWine = wine.endurance();
            if (youngWine > enduranceNextWine) {
                wineListYoungWine.clear();
                wineListYoungWine.add(wine);
            }
            else if (youngWine == enduranceNextWine){
                wineListYoungWine.add(wine);
            }


        }
        System.out.println("Список самих молодих вин:");
        System.out.println(wineListYoungWine.toString());

    }
}
