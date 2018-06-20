package com.company.w8.Shopping;

import java.util.ArrayList;

public class Comfy implements IShop {
    ArrayList<Item> listItems = new ArrayList<>();

    public Comfy(Item item) {
        listItems.add(item);
    }

    @Override
    public void addItem(Item item) {
        listItems.add(item);
    }

    @Override
    public void printItemsOfShop() {
        for (Item itemsOfShop : listItems) {
            System.out.println(itemsOfShop.toString());
        }
    }

    @Override
    public void getName() {
        for (Item nameOfItem : listItems) {
            nameOfItem.getName();
        }
    }

    @Override
    public void removeItem(int indexOfItem) {
        listItems.remove(indexOfItem);
    }

    @Override
    public ArrayList<Item> whatYouCanBuyInShops(ArrayList<Item> listWhatToBuy) {
        for (Item checkItemToBuy : listWhatToBuy) {
            for (Item itemFromShop : listItems) {
                if (itemFromShop.compareTo(checkItemToBuy) == 1)
                    presentInCurrentShop.add(itemFromShop);
            }
        }
        return presentInCurrentShop;}

}
