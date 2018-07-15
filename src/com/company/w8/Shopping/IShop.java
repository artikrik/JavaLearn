package com.company.w8.Shopping;

import java.util.List;

public interface IShop {

    void addItem(Item item);

    void printItemsOfShop();

    void removeItem(int indexOfItem);

    List<Item> getAllItems();
}
