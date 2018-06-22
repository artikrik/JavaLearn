package com.company.W8.Shopping;

import java.util.ArrayList;
import java.util.List;

public class Husband {

    ArrayList<Good> listAllGoods = new ArrayList<>();
    //List<Good> listAllGoodsss = new ArrayList<>();
    ShopTechnics shop1 = new ShopTechnics();
    ShopProducts shop2 = new ShopProducts();



    public void moveInfoAboutShopTechnicsToHusband(ShopTechnics shop){
        shop1=shop;
    }

    public void moveInfoAboutShopProductsToHusband(ShopProducts shop){
        shop2=shop;
    }


    public List<Good> getlistAllGoodsinAllShops(){
        listAllGoods.addAll(shop1.getListGoods());
        listAllGoods.addAll(shop2.getListGoods());
        return listAllGoods;
    }

    public ArrayList<Good> getlistGoodsthatispresent (ArrayList<Good> list){
       listAllGoods.retainAll(list);

        return  listAllGoods;
    }
}
