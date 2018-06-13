package com.company.w8.Shopping;

import java.util.ArrayList;

public class Husband extends Person {
    Wife wife;

    public Husband(String name){
        super(name);
    }

    public void showAllShopItems(ArrayList <Shop> listOfShops){
        for (Shop tmp: listOfShops) {
            tmp.printItemsOfShop();
        }
    }

    public void showWhatNeedToBuy(ArrayList <Shop> listOfShops, Wife wife){
        for (Shop tmp: listOfShops) {

        }

    }

}
