package com.company.shopping;

import java.util.ArrayList;

public class Shop {

    public enum ShopKind {
        FOOD, TECHNICS
    }

    public ShopKind shopKind;
    private ArrayList<Item> listOfItems = new ArrayList<>();

    public Shop(ShopKind kind) {
        this.shopKind = kind;
    }

    public void addItem(String name, double price) {
        listOfItems.add(new Item(name, price));
    }

    public ArrayList<Item> getItems() {
        return listOfItems;
    }

    public void printItems() {
        for(Item item: listOfItems) {
            System.out.println(item.toString());
        }
    }
}
