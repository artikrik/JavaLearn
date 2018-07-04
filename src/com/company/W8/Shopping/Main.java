package com.company.W8.Shopping;

public class Main {

    public static void main (String[] args){


        ShopTechnics shop1 = new ShopTechnics();
        ShopProducts shop2 = new ShopProducts();
        shop1.addInListGood("Sony", 100);
        shop2.addInListGood("Shark",70);
        shop2.addInListGood("Milk",30);

        Husband husband = new Husband();

        husband.addGoodsThisShopInListAllGoodsOfHusband(shop1);
        husband.addGoodsThisShopInListAllGoodsOfHusband(shop2);

        Wife wife = new Wife(husband);
        wife.addGoodInListWife("Potato",22);
        wife.addGoodInListWife("Shark",11);

        wife.getListAllGoodsInHusband();

        wife.getListGoodsThatIsInSelling();

        wife.getPriceAllGoods();

    }
}
