package com.company.w6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class NewWineCatalog {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2002, 6, 18);
        NewWine newWine1 = new NewWine("Cabernet", "France", date);
        ArrayList<NewWine> newWines = new ArrayList<>();

        //заполняем каталог
        newWines.add(newWine1);
        newWines.add(new NewWine("Kagor", "Moldova", LocalDate.of(2008, 3, 12)));
        newWines.add(new NewWine("Izabella", "Moldova", LocalDate.of(2011, 11, 12)));
        newWines.add(new NewWine("Tamyanka", "Moldova", LocalDate.of(2011, 10, 12)));

        for (NewWine newWine : newWines) {
            System.out.println(newWine.toString() + "\nAge of newWine: " + newWine.getAgeOfWine() + " years.");
        }

        //сортируем по возрастанию (тогда самое молодое вино будет в начале)
        Collections.sort(newWines);
        //выводим на экран
        for (NewWine newWine : newWines) {
            if (newWines.get(0).getAgeOfWine() == newWine.getAgeOfWine()) {
                System.out.println("\nСамое молодое вино: " + newWine.toString() + "\nВозраст вина: " + newWine.getAgeOfWine() + " лет.");
            } else break;
        }
    }
}
