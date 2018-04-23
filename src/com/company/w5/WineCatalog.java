package com.company.w5;

import java.time.LocalDate;
import java.util.ArrayList;

public class WineCatalog {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2002, 6, 18);
        LocalDate currentDate = LocalDate.now();
        Wine wine1 = new Wine("Cabernet", "France",date);


        ArrayList<Wine> wines = new ArrayList<Wine>();
        wines.add(wine1);
        wines.add(new Wine("Kagor","Moldova",LocalDate.of(2008,3,12)));
        wines.add(new Wine("Izabella","Moldova",LocalDate.of(2011,11,12)));

        for (Wine wine : wines) {
            System.out.println(wine.toString() + "\nAge of wine: " + wine1.calculateAge(wine.getBirthOfWine(),currentDate) + " years.");
        }
    }
}
