package com.company.WineCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        ArrayList<WineCollection> wineList = new ArrayList<>();

        wineList.add(new WineCollection("Old Gruzia", "Грузия",
                                        new GregorianCalendar(1973, 05, 10)));
        wineList.add(new WineCollection("Purcari Papa", "Молдова",
                                        new GregorianCalendar(1963, 07, 23)));
        wineList.add(new WineCollection("Каберне", "Молдова",
                                        new GregorianCalendar(1980, 01, 10)));
        wineList.add(new WineCollection("Antinori Tignanello", "Италия",
                                        new GregorianCalendar(1920, 10, 28)));
        wineList.add(new WineCollection("Grand Sud", "Франция",
                                        new GregorianCalendar(2000, 04, 04)));
        wineList.add(new WineCollection("Коблево", "Украина",
                                        new GregorianCalendar(2000, 04, 04)));

        int arrayListLength = wineList.size();
        int[] arrayList = new int[arrayListLength];
        for (int i = 0; i < wineList.size(); i++) {
            arrayList[i] = wineList.get(i).wineAge();
        }

        Arrays.sort(arrayList);
        int tmp = arrayList[arrayListLength - 1];
        for (WineCollection wineCollection : wineList)
            if (wineCollection.wineAge() == tmp)
                System.out.println(wineCollection.toString());
    }
}
