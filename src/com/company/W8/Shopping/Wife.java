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
        System.out.println(husband.getlistAllGoodsinAllShops());
    }

    public void getListGoodsThatIsInSelling(){
        System.out.println(husband.getlistGoodsthatispresent(listWife));
    }

}