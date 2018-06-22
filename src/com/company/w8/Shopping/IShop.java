package com.company.w8.Shopping;

import java.util.ArrayList;

public interface IShop {
    ArrayList<Item> presentInCurrentShop = new ArrayList<>(); // Проблема  в этом Листе , нужен его отсюда удалить и делать в своем магизине сообственный
    // ЛИСТ !!!

    void addItem(Item item);

    void printItemsOfShop();

    void getName();

    void removeItem(int indexOfItem);

    ArrayList<Item> compareWhatYouCanBuyFromShopsList(ArrayList<Item> listWhatToBuy);

}
