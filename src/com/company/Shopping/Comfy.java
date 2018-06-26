package com.company.Shopping;

import java.util.ArrayList;

public class Comfy implements Megamoll {

    ArrayList<PurchasingCharacteristics> productsComfy = new ArrayList<>();

    @Override
    public ArrayList<PurchasingCharacteristics> getListPurchasingCharacteristics() {
        return productsComfy;
    }

    @Override
    public void addInListPurchasingCharacteristics(String purchaseName, int purchasePrise) {
        productsComfy.add(new PurchasingCharacteristics(purchaseName, purchasePrise));
    }


    @Override
    public void getPurchaseName() {
        for (PurchasingCharacteristics purchasingCharacteristics : productsComfy){
            purchasingCharacteristics.getPurchaseName();
        }
    }

    @Override
    public void getPurchasePrise() {
        for (PurchasingCharacteristics purchasingCharacteristics : productsComfy){
            purchasingCharacteristics.getPurchasePrise();
        }
    }

    public void toPrint(){
        for (PurchasingCharacteristics tmp : productsComfy){
            System.out.println(tmp.toString());
        }
    }
}
