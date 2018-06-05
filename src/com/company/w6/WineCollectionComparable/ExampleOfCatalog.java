package com.company.w6.WineCollectionComparable;

import com.company.w5.Wine.WineCatalog;

import java.util.Collections;
import java.util.GregorianCalendar;

public class ExampleOfCatalog extends WineCatalog {
    public static void main(String[] args) {
        CatalogOfWine winesSet = new CatalogOfWine();

        winesSet.add(new Wine("Vinedos", "Spain", "dry", new GregorianCalendar(2017, 5, 10), 0.75));
        winesSet.add(new Wine("Donnafugata", "Italy", "dry", new GregorianCalendar(2011, 9, 11), 0.75));
        winesSet.add(new Wine("Nexus One", "France", "dry", new GregorianCalendar(2015, 2, 1), 0.75));
        winesSet.add(new Wine("TareniNero", "Sicily", "semi-dry", new GregorianCalendar(2017, 7, 21), 0.75));
        winesSet.add(new Wine("MaisonBouey", "France", "semi-dry", new GregorianCalendar(2017, 7, 21), 0.75));
        Wine youngestWine = Collections.min(winesSet);

        try {
            for (Wine wine : winesSet) {
                if (youngestWine.compareTo(wine) == 0) {
                    System.out.println(wine.toString());
                }
            }
        }
        catch (ClassCastException e){
            e.printStackTrace();
        }
    }
}
