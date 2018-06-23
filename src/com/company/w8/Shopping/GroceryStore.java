package com.company.w8.Shopping;

import java.util.ArrayList;

public class GroceryStore implements IShop {
    ArrayList<Item> listItemsGrocery = new ArrayList<>();

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
    public ArrayList<Item> compareWhatYouCanBuyFromShopsList(ArrayList<Item> listWhatToBuy) {
        ArrayList<Item> presentInCurrentShop = new ArrayList<>();
        for (Item checkItemToBuy : listWhatToBuy) {
            for (Item itemFromShop : listItemsGrocery) {
                if (itemFromShop.compareTo(checkItemToBuy) == 0)
                    presentInCurrentShop.add(itemFromShop);
            }
        }
        return presentInCurrentShop;
    }
}
