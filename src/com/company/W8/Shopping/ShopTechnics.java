package com.company.W8.Shopping;

import java.util.ArrayList;

public class ShopTechnics implements Shop  {

    ArrayList<Good> shopTechnicsList = new ArrayList<>();

    @Override
    public void addInListGood(String name, int price) {
        shopTechnicsList.add(new Good (name, price));
    }


    @Override
    public ArrayList<Good> getListGoods() {
        return shopTechnicsList;
    }

    public void toPrint() {
        for (Good tmp : shopTechnicsList) {
            System.out.print(tmp.toString());
        }

    }




}