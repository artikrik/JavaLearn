package com.company.w6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;

public class CatalogOfWine {

    public static void main(String[] args) {
        Wine bottleVinedos = new Wine("Vinedos", "Spain", "dry", new GregorianCalendar(2018, 5, 10), 0.75);
        Wine donnafugata = new Wine("Donnafugata", "Italy", "dry", new GregorianCalendar(2017, 9, 11), 0.75);
        Wine nexusOne = new Wine("Nexus One", "France", "dry", new GregorianCalendar(2015, 2, 1), 0.75);
        Wine tareniNero = new Wine("TareniNero", "Sicily", "semi-dry", new GregorianCalendar(2018, 7, 21), 0.75);
        Wine maisonBouey = new Wine("MaisonBouey", "France", "semi-dry", new GregorianCalendar(2017, 7, 21), 0.75);

        ArrayList<Wine> wineCatalog = new ArrayList(Arrays.asList(bottleVinedos, donnafugata, nexusOne, tareniNero, maisonBouey));
        System.out.println(youngestWineCatalog(wineCatalog, youngestWine(wineCatalog)).toString());
    }

    public static long youngestWine(ArrayList<Wine> catalog) {
        long minValue = catalog.get(0).periodOfWineHolding();
        for (Wine tmp : catalog) {
            if (tmp.periodOfWineHolding() < minValue) minValue = tmp.periodOfWineHolding();
        }
        return minValue;
    }

    public static ArrayList<Wine> youngestWineCatalog(ArrayList<Wine> catalog, long minValue) {
        ArrayList <Wine> youngestWineCatalog = new ArrayList();
        for (Wine tmp : catalog) {
            if (minValue == tmp.periodOfWineHolding()) {
                youngestWineCatalog.add(tmp);
            }
        }
        return youngestWineCatalog;
    }
}

