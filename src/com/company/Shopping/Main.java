package com.company.Shopping;

import com.company.WineCollection.Wine;

public class Main {
    public static void main(String[] args) {

        PurchasingCharacteristics purchasingCharacteristics = new PurchasingCharacteristics();
        Silpo silpo = new Silpo();
        Comfy comfy = new Comfy();



        Husband husband = new Husband();
        husband.silpoInfo(silpo);
        husband.comfyInfo(comfy);

        Wife wife = new Wife();
        wife.getAllItemsListFromHusband();
        wife.getNeedToBuyItems();
        wife.getTotalCost();


    }
}
