package com.company.w6.WineCatalog;

import java.util.GregorianCalendar;
import static com.company.w6.WineCatalog.CatalogOfWine.youngestWine;
import static com.company.w6.WineCatalog.CatalogOfWine.youngestWineCatalog;

public class ExampleOfCatalog {
    public static void main(String[] args) {
        CatalogOfWine catalog1 = new CatalogOfWine();
        Wine bottleVinedos = new Wine("Vinedos", "Spain", "dry", new GregorianCalendar(2017, 5, 10), 0.75);
        Wine donnafugata = new Wine("Donnafugata", "Italy", "dry", new GregorianCalendar(2011, 9, 11), 0.75);
        Wine nexusOne = new Wine("Nexus One", "France", "dry", new GregorianCalendar(2015, 2, 1), 0.75);
        Wine tareniNero = new Wine("TareniNero", "Sicily", "semi-dry", new GregorianCalendar(2017, 7, 21), 0.75);
        Wine maisonBouey = new Wine("MaisonBouey", "France", "semi-dry", new GregorianCalendar(2017, 7, 21), 0.75);

        catalog1.add(bottleVinedos);
        catalog1.add(donnafugata);
        catalog1.add(nexusOne);
        catalog1.add(tareniNero);
        catalog1.add(maisonBouey);

        System.out.println(youngestWineCatalog(catalog1, youngestWine(catalog1)).toString());
    }
}
