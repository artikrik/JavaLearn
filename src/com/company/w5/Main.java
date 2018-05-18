package com.company.w5;

public class Main {
    public static void main(String[] args) {
        BottleOfWine bottle1 = new BottleOfWine("Vinedos", "Spain", "dry", 2016, 0.75);
        System.out.println("Выдержка вина " + bottle1.getName() + " " + bottle1.dateOfEndurance() + " года");
    }
}
