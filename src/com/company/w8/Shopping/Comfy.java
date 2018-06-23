package com.company.w8.Shopping;

import java.util.ArrayList;

public class Comfy implements IShop {
    ArrayList<Item> listItemsComfy = new ArrayList<>();

    public Comfy(Item item) {
        addItem(item);
    }

    @Override
    public void addItem(Item item) {
        listItemsComfy.add(item);
    }

    @Override
    public void printItemsOfShop() {
        for (Item itemsOfShop : listItemsComfy) {
            System.out.println(itemsOfShop.toString());
        }
    }

    @Override
    public void removeItem(int indexOfItem) {
        listItemsComfy.remove(indexOfItem);
    }

    @Override
    public ArrayList<Item> compareWhatYouCanBuyFromShopsList(ArrayList<Item> listWhatToBuy) {
        ArrayList<Item> presentInCurrentShop = new ArrayList<>();
        for (Item manItemToBuy : listWhatToBuy) {
            for (Item itemFromShop : listItemsComfy) {
                if (itemFromShop.compareTo(manItemToBuy) == 0)
                    presentInCurrentShop.add(itemFromShop);
            }
        }
        return presentInCurrentShop;}
}
