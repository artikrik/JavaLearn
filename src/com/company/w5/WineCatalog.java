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
            System.out.println(wine.toString() + "\nAge of wine: " + wine.getAgeOfWine() + " years.");
        }

//самое молодое вино
        int min = wines.get(0).getAgeOfWine();  // calculateAgeOfWineInYears выглядит как статический метод. Чтобы узнать возраст
        // своего вина, ему нужно дать свой возрасти текущую дату
        int minIndex = 0;
        for (int i = 0; i < wines.size(); i++) {
            if (min >= wines.get(i).getAgeOfWine()) {
                min = wines.get(i).getAgeOfWine();
                minIndex = i;
            }
        }
        System.out.println("\nСамое молодое вино: " + wines.get(minIndex).toString() + "\nВозраст вина: " + wines.get(minIndex).getAgeOfWine() + " years.");
    }
}
