package com.company.W8.Shopping;

import java.util.ArrayList;
import java.util.List;

public class ShopTechnics implements Shop {

    ArrayList<Good> shopTechnicsList = new ArrayList<>();

    @Override
    public void addInListGood(String name, int price) {
        shopTechnicsList.add(new Good(name, price));
    }


    @Override
    public ArrayList<Good> getListGoods() {
        return shopTechnicsList;
    }

    @Override
    public void getName() {
        for (Good good : shopTechnicsList) {
            good.getName();
        }
    }

    @Override
    public void getPrice() {
        for (Good good : shopTechnicsList) {
            good.getPrice();
        }
    }

    public void toPrint() {
        for (Good tmp : shopTechnicsList) {
            System.out.print(tmp.toString());
        }
    }
}