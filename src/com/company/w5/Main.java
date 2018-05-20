package com.company.w5;

public class Main {
    public static void main(String[] args) {
        BottleOfWine bottle1 = new BottleOfWine("Vinedos", "Spain", "dry", "19.05.2000", 0.75);
        long date = -1;
        try {
            date = bottle1.dateOfEndurance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Выдержка вина " + bottle1.getName() + " " + date + " лет");
    }
}
