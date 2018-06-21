package com.company.W8.Shopping;

public class Main {

    public static void main (String[] args){


        ShopTechnics shop1 = new ShopTechnics();
        ShopProducts shop2 = new ShopProducts();
        shop1.addInListGood("Sony", 100);
        shop2.addInListGood("Shark",70);

Husband husband = new Husband();
husband.moveInfoAboutShopProductsToHusband(shop2);
husband.moveInfoAboutShopTechnicsToHusband(shop1);

        Wife wife = new Wife(husband);
        wife.addGoodInListWife("Sony");

     wife.getListAllGoodsInHusband();

    //    System.out.println(husband.getlistAllGoods(shop1,shop2));
    }
}
