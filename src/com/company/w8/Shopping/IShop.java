package com.company.w8.Shopping;

import java.util.ArrayList;

public interface IShop {
    ArrayList<Item> listToBought = new ArrayList<>();

    void addItem(Item item);

    void printItemsOfShop();

    void getName();

    void removeItem(int indexOfItem);

    boolean checkIfItemInStore(Item checkItemToBuy);

    ArrayList<Item> whatYouCanBuyInShops(ArrayList<Item> listWhatToBuy);


}
