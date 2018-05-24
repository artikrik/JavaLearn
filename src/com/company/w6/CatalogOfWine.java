package com.company.w6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;

public class CatalogOfWine {

    public static void main(String[] args) {
        Wine bottleVinedos = new Wine("Vinedos", "Spain", "dry", new GregorianCalendar(2016, 5, 10), 0.75);
        Wine donnafugata = new Wine("Donnafugata", "Italy", "dry", new GregorianCalendar(2017, 9, 11), 0.75);
        Wine nexusOne = new Wine("Nexus One", "France", "dry", new GregorianCalendar(2017, 2, 1), 0.75);
        Wine tareniNero = new Wine("TareniNero", "Sicily", "semi-dry", new GregorianCalendar(2017, 7, 21), 0.75);
        Wine maisonBouey = new Wine("MaisonBouey", "France", "semi-dry", new GregorianCalendar(2017, 7, 21), 0.75);

        ArrayList<Wine> wineCatalog = new ArrayList(Arrays.asList(bottleVinedos, donnafugata, nexusOne, tareniNero,maisonBouey));
        printWine(wineCatalog, howManyTimesMinValueRepeated(wineCatalog, youngestWine(wineCatalog)));
    }


    public static long youngestWine(ArrayList<Wine> catalog) {
        long minValue = catalog.get(0).periodOfWineHolding();
        for (int i = 0; i < catalog.size(); i++) {
            if (catalog.get(i).periodOfWineHolding() < minValue) {
                minValue = catalog.get(i).periodOfWineHolding();
            }
        }
        return minValue;
    }

    public static int[] howManyTimesMinValueRepeated(ArrayList<Wine> catalog, long minValue) {
        int[] mass = new int[catalog.size()];
        int counter = 0;

        for (int j = 0; j < catalog.size(); j++) {
            if (minValue == catalog.get(j).periodOfWineHolding()) {
                mass[counter] = catalog.indexOf(catalog.get(j));
                ++counter;
            }
        }
        return mass;
    }

    public static void printWine(ArrayList<Wine> catalog, int[] mass) {
        for (int k = 0; k < mass.length; k++) {
            if (mass[k] != 0) {
                System.out.println(catalog.get(mass[k]).toString());
            }
        }
    }
}

