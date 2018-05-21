package com.company.w5.Wine;

import java.util.GregorianCalendar;

public class WineCatalog {
    public static void main(String[] args) {
        Wine bottle1 = new Wine("Vinedos", "Spain", "dry", new GregorianCalendar(2000,5,17), 0.75);
        long date = -1;
        try {
            date = bottle1.periodOfWineHolding();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Выдержка вина " + bottle1.getName() + " " + date + " лет");
    }
}
