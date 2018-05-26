package com.company.w5;

import java.time.LocalDate;
import java.util.ArrayList;

public class WineCatalog {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2002, 6, 18);
        Wine wine1 = new Wine("Cabernet", "France", date);

        ArrayList<Wine> wines = new ArrayList<>();
        wines.add(wine1);
        wines.add(new Wine("Kagor", "Moldova", LocalDate.of(2008, 3, 12)));
        wines.add(new Wine("Izabella", "Moldova", LocalDate.of(2011, 11, 12)));

        for (Wine wine : wines) {
            System.out.println(wine.toString() + "\nAge of wine: " + wine.calculateAgeInYears(wine.getBirthOfWine(), wine.getCurrentDate()) + " years.");
        }

//самое молодое вино
        int min = wines.get(0).calculateAgeInYears(wines.get(0).getBirthOfWine(), wines.get(0).getCurrentDate());
        int minIndex = 0;
        for (int i = 0; i < wines.size(); i++) {
            if (min >= wines.get(i).calculateAgeInYears(wines.get(i).getBirthOfWine(), wines.get(i).getCurrentDate())) {
                min = wines.get(i).calculateAgeInYears(wines.get(i).getBirthOfWine(), wines.get(i).getCurrentDate());
                minIndex = i;
            }
        }
        System.out.println("\nСамое молодое вино: " + wines.get(minIndex).toString() + "\nВозраст вина: " + wines.get(minIndex).calculateAgeInYears(wines.get(minIndex).getBirthOfWine(), wines.get(minIndex).getCurrentDate()) + " years.");
    }
}
