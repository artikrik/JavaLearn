package com.company.w8.Shopping;

import java.util.ArrayList;

public class Husband extends Person {
    public Wife wife;
    ArrayList<Item> listWhatToBuy;

    public Husband(String name) {
        super(name);
    }

    public void showAllShopItems(ArrayList<IShop> listOfShops) {
        System.out.println("Total list:");
        for (IShop itemInEveryShop : listOfShops) {
            itemInEveryShop.printItemsOfShop();
        }
    }

    public void takeListToBuy() {
        listWhatToBuy = wife.giveHusbandListToBuy();
//        for (Item tmp : listWhatToBuy) {
//            System.out.println(tmp.getName());
//        }
    }
}
