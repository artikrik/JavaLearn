package com.company.Wine;

import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        WineCatalog wines = new WineCatalog("Old Gruzia",
                                            "Gruzia",
                                            new GregorianCalendar(1973, 05,10));
        System.out.println("Вино " + wines.getWineName() +
                            " производства " + wines.getWineCountry() +
                            " с выдержкой " + wines.getBottlingYear() + " лет.");
    }
}
