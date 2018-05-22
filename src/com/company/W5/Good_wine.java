package com.company.W5;

import java.util.GregorianCalendar;

public class Good_wine {
    public static void main(String[] args) {

        Wine wine1 = new Wine("Red flower", "France", new GregorianCalendar(2010, 11, 12));
        Wine wine2 = new Wine("Red", "France", new GregorianCalendar(2002, 1, 12));

        System.out.println("Витримка wine1 " + wine1.endurance() + " років");
        System.out.println("Витримка wine2 " + wine2.endurance() + " років");

        //   wine1.setDateRozlivu(new GregorianCalendar(2006, 12, 12));
       // System.out.println(wine1.getYearBottling());
        // System.out.println("Витримка wine1 " + wine1.endurance() + " років");
    }
}
