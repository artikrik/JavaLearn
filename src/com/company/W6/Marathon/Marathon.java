package com.company.W6.Marathon;

import java.util.ArrayList;
import java.util.Comparator;

public class Marathon {
    public static void main(String[] args) {


        Sportsmen sportsmen1 = new Sportsmen("Vitya", 300);
        Sportsmen sportsmen2 = new Sportsmen("Kolya", 322);
        Sportsmen sportsmen3 = new Sportsmen("Tolya", 222);
        Sportsmen sportsmen4 = new Sportsmen("Kostya", 111);

        ArrayList<Sportsmen> sportsmenList= new ArrayList<>();

        sportsmenList.add(sportsmen1);
        sportsmenList.add(sportsmen2);
        sportsmenList.add(sportsmen3);
        sportsmenList.add(sportsmen4);

        sportsmenList.sort(Comparator.comparing(Sportsmen::getSeconds));

        System.out.println("1 place - "+sportsmenList.get(0)+"2 place - "+sportsmenList.get(1)+ "3 place - "+sportsmenList.get(2));

    }
}
