package com.company.w8.Shopping;

import java.util.ArrayList;

public class Shop {
    ArrayList <Item> listItems = new ArrayList<>();

    public Shop(Item item) {
        addItem(item);
    }

    public void addItem(Item item){
        listItems.add(item);
    }

    public void printItemsOfShop() {
        for (Item tmp: listItems) {
            System.out.println(tmp.toString());
        }
    }
//    public  void getName(){
//        for (Item tmp: listItems) {
//            tmp.getName();
//        }
//    }
}
