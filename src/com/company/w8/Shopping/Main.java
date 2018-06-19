package com.company.w8.Shopping;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shop> shops = new ArrayList<>();
        Shop tech = new Shop();
        shops.add(tech);
        Shop meals = new Shop();
        shops.add(meals);
        tech.addProduct(new Product("Sony", 100));
        tech.addProduct(new Product("Samsung", 80));
        tech.addProduct(new Product("Sharp", 70));
        meals.addProduct(new Product("Bread", 110));
        meals.addProduct(new Product("Sausage", 80));
        meals.addProduct(new Product("Butter", 70));
        System.out.print(tech.toString());
        System.out.print(meals.toString());

    }

}
