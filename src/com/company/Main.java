package com.company;

import java.time.LocalDate;
import java.time.Month;

import com.company.week5.Car;
import com.company.week5.Wine;

public class Main {

    public static void main(String[] args) {
        Wine wine1 = new Wine("Fragollino", "Italy", LocalDate.of(2015, Month.DECEMBER, 31));
        Wine wine2 = new Wine("Yellow Tail", "Australia", LocalDate.of(2013, Month.APRIL, 13));
        System.out.println(wine1.toString() + "\n" + wine2.toString());
        System.out.println("Ageing of wine1 = " + wine1.calculateAgeingOfWine() + " years");

        Car car1 = new Car(2010, "Mazda");
        Car car2 = new Car(2015, "Audi");

        car1.showResultOfChangeSpeedFewTimes(5, "+");
        car1.showResultOfChangeSpeedFewTimes(5, "-");
    }
}
