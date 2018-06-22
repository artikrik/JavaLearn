package com.company.W8.Shopping;

import java.util.ArrayList;
import java.util.List;

public class Husband {

    ArrayList<Good> listAllGoods = new ArrayList<>();
    ArrayList<Good> listNeedGoodsThatArePresent = new ArrayList<>();
    ShopTechnics shop1 = new ShopTechnics();
    ShopProducts shop2 = new ShopProducts();


    public void moveInfoAboutShopTechnicsToHusband(ShopTechnics shop) {
        shop1 = shop;
    }

    public void moveInfoAboutShopProductsToHusband(ShopProducts shop) {
        shop2 = shop;
    }


    public List<Good> getlistAllGoodsinAllShops() {
        listAllGoods.addAll(shop1.getListGoods());
        listAllGoods.addAll(shop2.getListGoods());
        return listAllGoods;
    }

    public ArrayList<Good> getlistGoodsthatispresent(ArrayList<Good> list) {
        for (Good good:listAllGoods) {
            for (Good wifeGood: list){
               if (good.getName().equals(wifeGood.getName()))
                   listNeedGoodsThatArePresent.add(good);
            }
        }
        return listNeedGoodsThatArePresent;
    }

    public int getPriceofAvaiableGoods(){
        int price=0;
        for (Good good:listNeedGoodsThatArePresent) {
            price += good.getPrice();
        }
        return price;
    }
}
//  listAllGoods.retainAll(list) -?- очищало повністю, хоча лісти коректні