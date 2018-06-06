package com.company.W6.MarathonComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MarathonComparableAndComparator {
    public static void main(String[] args) {

        Sportsmen sportsmen1 = new Sportsmen("Vitya", 300);
        Sportsmen sportsmen2 = new Sportsmen("Anya", 322);
        Sportsmen sportsmen3 = new Sportsmen("Anya", 222);
        Sportsmen sportsmen4 = new Sportsmen("Kostya", 111);

        ArrayList<Sportsmen> sportsmenList = new ArrayList<>();
        sportsmenList.add(sportsmen1);
        sportsmenList.add(sportsmen2);
        sportsmenList.add(sportsmen3);
        sportsmenList.add(sportsmen4);

        Collections.sort(sportsmenList);
        for (Sportsmen sportsmen: sportsmenList) {
            System.out.print(sportsmen.toString());
        }

        Collections.sort(sportsmenList,Comparator.comparing(Sportsmen::getSeconds)); // Очень хорошо!!! А через new Comparator сможите?
        System.out.println("1 place -  " + sportsmenList.get(0) + "2 place -  " + sportsmenList.get(1) + "3 place -  " + sportsmenList.get(2));

    }
}
