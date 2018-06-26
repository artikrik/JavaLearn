package com.company.Shopping;

import java.util.ArrayList;

public class Silpo implements Megamoll {

    ArrayList<PurchasingCharacteristics> productsSilpo = new ArrayList<>();

    @Override
    public ArrayList<PurchasingCharacteristics> getListPurchasingCharacteristics() {
        return productsSilpo;
    }

    @Override
    public void addInListPurchasingCharacteristics(String purchaseName, int purchasePrise) {
        productsSilpo.add(new PurchasingCharacteristics(purchaseName, purchasePrise));
    }


    @Override
    public void getPurchaseName() {
        for (PurchasingCharacteristics purchasingCharacteristics : productsSilpo) {
            purchasingCharacteristics.getPurchaseName();
        }
    }

    @Override
    public void getPurchasePrise() {
        for (PurchasingCharacteristics purchasingCharacteristics : productsSilpo) {
            purchasingCharacteristics.getPurchasePrise();
        }
    }

    public void toPrint() {
        for (PurchasingCharacteristics tmp : productsSilpo) {
            System.out.println(tmp.toString());
        }
    }
}
