package com.company.W8.Shopping;

import java.util.ArrayList;

public class Husband {

    ArrayList<Good> listAllGoods = new ArrayList<>();
    ArrayList<Good> listNeedGoodsThatArePresent = new ArrayList<>();

    public void addGoodsThisShopInListAllGoodsOfHusband(Shop shop) {
        listAllGoods.addAll(shop.getListGoods());
    }

    public ArrayList<Good> getlistAllGoodsinAllShops() {
        return listAllGoods;
    }

    public ArrayList<Good> getlistGoodsThatIsPresent(ArrayList<Good> list) {
        for (Good good : listAllGoods) {
            for (Good wifeGood : list) {
                if (good.getName().equals(wifeGood.getName()))
                    listNeedGoodsThatArePresent.add(good);
            }
        }
        return listNeedGoodsThatArePresent;
    }

    public int getPriceofAvaiableGoods() {
        int price = 0;
        for (Good good : listNeedGoodsThatArePresent) {
            price += good.getPrice();
        }
        return price;
    }
}