package com.company.w5;

import java.time.LocalDate;
import java.util.ArrayList;

public class WineCatalog {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2002, 6, 18);
        Wine wine1 = new Wine("Cabernet", "France", date);
        ArrayList<Integer> wineAges = new ArrayList<>();
        ArrayList<Wine> wines = new ArrayList<>();

        //заполняем каталог
        wines.add(wine1);
        wines.add(new Wine("Kagor", "Moldova", LocalDate.of(2008, 3, 12)));
        wines.add(new Wine("Izabella", "Moldova", LocalDate.of(2011, 11, 12)));

        //Добавим возраст вина в новый лист для сравнения
        for (Wine wine : wines) {
            wineAges.add(wine.getAgeOfWine());
            System.out.println(wine.toString() + "\nAge of wine: " + wine.getAgeOfWine() + " years.");
        }

//самое молодое вино
        System.out.println("\nСамое молодое вино: " + wines.get(getYoungestWine(wineAges)).toString() + "\nВозраст вина: " + wines.get(getYoungestWine(wineAges)).getAgeOfWine() + " years.");
    }

    //метод сравнения возрастов всех вин
    private static int getYoungestWine(ArrayList<Integer> arrayList){
        int min = arrayList.get(0);
        int minIndex = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (min >= arrayList.get(i)) {
                min = arrayList.get(i);
                minIndex = i;
            }
        }
        return minIndex;
    }
}
