package com.company.W8.Shopping;

import java.util.ArrayList;

public class Husband {

    ArrayList<Good> listAllGoods = new ArrayList<>();
    ShopTechnics shop1 = new ShopTechnics();
    ShopProducts shop2 = new ShopProducts();



    public void moveInfoAboutShopTechnicsToHusband(ShopTechnics shop){
        shop1=shop;
    }

    public void moveInfoAboutShopProductsToHusband(ShopProducts shop){
        shop2=shop;
    }

    public ArrayList<Good> getlistAllGoods(Shop sh1, Shop sh2){
        listAllGoods.addAll(sh1.getListGoods());
        listAllGoods.addAll(sh2.getListGoods());
        return listAllGoods;
    }
    public ArrayList<Good> getlistAllGoodsinAllShops(){
        listAllGoods.addAll(shop1.getListGoods());
        listAllGoods.addAll(shop2.getListGoods());
        return listAllGoods;
    }


}
