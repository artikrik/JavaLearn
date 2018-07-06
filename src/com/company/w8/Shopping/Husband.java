package com.company.w8.Shopping;

import java.util.ArrayList;

public class Husband extends Person {

    ArrayList<Item> listAllItems = new ArrayList<>();
    ArrayList<Item> manBoughtIt = new ArrayList<>();

    public Husband(String name) {
        super(name);
    }

    public void addAllItemsHusbandList(IShop shop) {
        listAllItems.addAll(shop.getAllItems());
    }

    public void printAllItems() {
        System.out.println("Total list:");
        for (Item itemInEveryShop : listAllItems) {
            System.out.println(itemInEveryShop.toString());
        }
    }

    public ArrayList<Item> getManBoughtGoods(ArrayList<Item> wifeList) {
        manBoughtIt.addAll(compareWhatYouCanBuyFromShopsList(wifeList));
        return manBoughtIt;
    }

    public double getTotalPriceOfShopping() {
        double price = 0.0;
        for (Item itemPrice : manBoughtIt) {
            price += itemPrice.getPrice();
        }
        return price;
    }

    public ArrayList<Item> compareWhatYouCanBuyFromShopsList(ArrayList<Item> wifeList) {
        ArrayList<Item> presentInCurrentShop = new ArrayList<>();
        for (Item manItemToBuy : wifeList) {
            for (Item item : listAllItems) {
                if (item.compareTo(manItemToBuy) == 0)
                    presentInCurrentShop.add(item);
            }
        }
        return presentInCurrentShop;
    }
}
