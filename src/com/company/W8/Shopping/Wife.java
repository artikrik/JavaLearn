package com.company.W8.Shopping;

import java.util.ArrayList;

public class Wife {

    ArrayList<Good> listWife = new ArrayList<>();
    Husband husband;
    
    public Wife(Husband husband){
        this.husband = husband;
    }

    public void addGoodInListWife(String name, int price){
        listWife.add(new Good(name, price));
    }

    public void clearListWife(){
        listWife.clear();
    }

    public ArrayList<Good> getListWife() {
        return listWife;
    }

    public void getListAllGoodsInHusband(){
        System.out.println("Total list: " + husband.getlistAllGoodsinAllShops());
    }

    public void getListGoodsThatIsInSelling(){
        System.out.println("Goods are available to buy : " + husband.getlistGoodsthatispresent(listWife));
    }

    public void getPriceAllGoods(){
        System.out.println("Bought: " +husband.getPriceofAvaiableGoods());
    }

}