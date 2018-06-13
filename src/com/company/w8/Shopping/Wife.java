package com.company.w8.Shopping;

import java.util.ArrayList;

public class Wife extends  Person {
    private ArrayList<Item> listWhatToBuy = new ArrayList<>();

    public Wife(String name){
        super(name);
    }

    public void addItemToTheList(Item itemToBuy){
        listWhatToBuy.add(itemToBuy);
    }

//    public ArrayList<String> getNameOfItem(){
//
//    }
}
