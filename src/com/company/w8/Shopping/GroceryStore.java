package com.company.w8.Shopping;

import java.util.ArrayList;
import java.util.List;

public class GroceryStore implements IShop {
    List<Item> listItemsGrocery = new ArrayList<>();

    public GroceryStore(Item item) {
        addItem(item);
    }

    @Override
    public void addItem(Item item) {
        listItemsGrocery.add(item);
    }

    @Override
    public void printItemsOfShop() {
        for (Item itemsOfShop : listItemsGrocery) {
            System.out.println(itemsOfShop.toString());
        }
    }

    @Override
    public void removeItem(int indexOfItem) {
        listItemsGrocery.remove(indexOfItem);
    }

    @Override
    public List<Item> getAllItems() {
        return listItemsGrocery;
    }
}
