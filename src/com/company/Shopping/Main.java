package com.company.Shopping;

import com.company.WineCollection.Wine;

public class Main {
    public static void main(String[] args) {

        Silpo silpo = new Silpo();
        Comfy comfy = new Comfy();

        silpo.addInListPurchasingCharacteristics("Bread", 110);
        silpo.addInListPurchasingCharacteristics("Sausage", 80);
        silpo.addInListPurchasingCharacteristics("Butter", 70);
        silpo.addInListPurchasingCharacteristics("Milk", 300);
        silpo.addInListPurchasingCharacteristics("Potato", 40);

        comfy.addInListPurchasingCharacteristics("Sony", 100);
        comfy.addInListPurchasingCharacteristics("Samsung", 80);
        comfy.addInListPurchasingCharacteristics("Sharp", 70);
        comfy.addInListPurchasingCharacteristics("Apple", 300);
        comfy.addInListPurchasingCharacteristics("Aser", 40);

        Husband husband = new Husband();
        husband.silpoInfo(silpo);
        husband.comfyInfo(comfy);

        Wife wife = new Wife(husband);
        wife.productsInWifeList("Sony", 0);
        wife.productsInWifeList("Bread", 0);
        wife.productsInWifeList("Lenovo", 0);
        wife.productsInWifeList("Onion", 0);




        int wifeCase = 1;
        switch (wifeCase) {
            case 1:
                wife.getAllItemsListFromHusband();
            case 2:
                wife.getNeedToBuyItems();
            case 3:
                wife.getTotalCost();
        }
    }
}
