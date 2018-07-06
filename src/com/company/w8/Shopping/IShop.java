package com.company.w8.Shopping;

import java.util.ArrayList;

public interface IShop {

    void addItem(Item item);

    void printItemsOfShop();

    void removeItem(int indexOfItem);

    ArrayList<Item> getAllItems();
}
