package com.company.Shopping;

import java.util.ArrayList;
import java.util.List;

public class Husband {

    ArrayList<PurchasingCharacteristics> allItemsInAllShops = new ArrayList<>();
    ArrayList<PurchasingCharacteristics> allowableProducts = new ArrayList<>();
    Silpo silpo = new Silpo();
    Comfy comfy = new Comfy();

    public void silpoInfo(Silpo products) {
        silpo = products;
    }

    public void comfyInfo(Comfy gadgets) {
        comfy = gadgets;
    }

    public List<PurchasingCharacteristics> getAllItemsInAllShops(){
        allItemsInAllShops.addAll(silpo.getListPurchasingCharacteristics());
        allItemsInAllShops.addAll(comfy.getListPurchasingCharacteristics());
        return allItemsInAllShops;
    }

    public List<PurchasingCharacteristics> getAllowableProducts(ArrayList<PurchasingCharacteristics> list){
        for (PurchasingCharacteristics purchasingCharacteristics : allItemsInAllShops){
            for (PurchasingCharacteristics wifePurchasing : list){
                if (purchasingCharacteristics.getPurchaseName().equals(wifePurchasing.getPurchaseName()))
                    allowableProducts.add(purchasingCharacteristics);
            }
        }
        return allowableProducts;
    }

    public int getTotalCostBougthItems(){
        int startPrice = 0;
        for (PurchasingCharacteristics purchasingCharacteristics : allowableProducts){
            startPrice += purchasingCharacteristics.getPurchasePrise();
        }
        return startPrice;
    }

}
