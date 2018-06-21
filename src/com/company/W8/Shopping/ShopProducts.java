package com.company.W8.Shopping;

import java.util.ArrayList;

public class ShopProducts implements Shop {

    ArrayList<Good> shopProductsList = new ArrayList<>();

    @Override
    public void addInListGood(String name, int price) {
        shopProductsList.add(new Good (name, price));
    }


    @Override
    public ArrayList<Good> getListGoods() {
        return shopProductsList;
    }



    public void toPrint() {
        for (Good tmp : shopProductsList) {
            System.out.println(tmp.toString());
        }

    }
}
