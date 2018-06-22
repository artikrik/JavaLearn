package com.company.w8.Shopping;

import java.util.ArrayList;

public interface IShop {
    ArrayList<Item> presentInCurrentShop = new ArrayList<>();

    void addItem(Item item);

    void printItemsOfShop();

    void getName();

    void removeItem(int indexOfItem);

    ArrayList<Item> compareWhatYouCanBuyFromShopsList(ArrayList<Item> listWhatToBuy);

}
