package com.company.w8.Shopping;

import java.util.ArrayList;

public class Husband extends Person {
    public Wife wife;

    ArrayList<IShop> shopsInTown = new ArrayList<>();
    ArrayList<Item> manBoughtIt = new ArrayList<>();

    public Husband(String name) {
        super(name);
    }


    public void addShopInHusbendList(IShop shop) {
        shopsInTown.add(shop);
    }

    public void showAllShopItems() {
        System.out.println("Total list:");
        for (IShop itemInEveryShop : shopsInTown) {
            itemInEveryShop.printItemsOfShop();
        }
    }

    public ArrayList<Item> getManBoughtGoods() {
        for (IShop currentShop : shopsInTown) {
            manBoughtIt.addAll(currentShop.compareWhatYouCanBuyFromShopsList(wife.getListWhatToBuy()));
        }
        return manBoughtIt;
    }

    public double getTotalPriceOfShopping() {
        double price = 0.0;
        for (Item itemPrice : manBoughtIt) {
            price += itemPrice.getPrice();
        }
        return price;
    }

}
