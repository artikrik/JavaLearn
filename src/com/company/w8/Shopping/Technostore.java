package com.company.w8.Shopping;

import java.util.ArrayList;

public class Technostore implements IShop {
    ArrayList<Item> listItemsTechnostore = new ArrayList<>();

    public Technostore(Item item) {
        addItem(item);
    }

    @Override
    public void addItem(Item item) {
        listItemsTechnostore.add(item);
    }

    @Override
    public void printItemsOfShop() {
        for (Item itemsOfShop : listItemsTechnostore) {
            System.out.println(itemsOfShop.toString());
        }
    }

    @Override
    public void removeItem(int indexOfItem) {
        listItemsTechnostore.remove(indexOfItem);
    }

    @Override
    public ArrayList<Item> getAllItems() {
        return listItemsTechnostore;
    }

}
