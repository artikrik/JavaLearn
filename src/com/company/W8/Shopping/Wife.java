package com.company.W8.Shopping;

import java.util.ArrayList;

public class Wife {

    ArrayList<String> listWife = new ArrayList<>();
    Husband husband;// = new Husband();
    
    public Wife(Husband husband){
        this.husband = husband;
    }

    public void addGoodInListWife(String name){
       listWife.add(name);
    }

    public void clearListWife(){
        listWife.clear();
    }

    public ArrayList<String> getListWife() {
        return listWife;
    }

    public void getListAllGoodsInHusband(){
        System.out.println(husband.getlistAllGoodsinAllShops());
    }


}
