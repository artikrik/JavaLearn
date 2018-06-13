package com.company.w8.Shopping;

import java.util.ArrayList;

public class Shop {
    ArrayList <Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public void printItemsOfShop() {
        for (Item tmp: items) {
            System.out.println(tmp.toString());
        }
    }
    public  void getName(){
        for (Item tmp: items) {
            tmp.getName();
        }
    }
}
