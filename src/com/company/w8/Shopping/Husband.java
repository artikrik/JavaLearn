package com.company.w8.Shopping;

import java.util.ArrayList;
import java.util.List;

public class Husband extends Person {

    List<Item> listAllItems = new ArrayList<>();
    List<Item> manBoughtIt = new ArrayList<>();

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

    public List<Item> getManBoughtGoods(List<Item> wifeList) {
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

    public List<Item> compareWhatYouCanBuyFromShopsList(List<Item> wifeList) {
        List<Item> presentInCurrentShop = new ArrayList<>();
        for (Item manItemToBuy : wifeList) {
            for (Item item : listAllItems) {
                if (item.compareTo(manItemToBuy) == 0)
                    presentInCurrentShop.add(item);
            }
        }
        return presentInCurrentShop;
    }
}
