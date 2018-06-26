package com.company.Shopping;

import java.util.ArrayList;

public class Wife {

    ArrayList<PurchasingCharacteristics> wifeList = new ArrayList<>();
    Husband husband;

    public Wife(Husband husband) {
        this.husband = husband;
    }


    public void productsInWifeList(String purchaseName, int purchasePrise) {
        wifeList.add(new PurchasingCharacteristics(purchaseName, purchasePrise));
    }

    public void deleteWifelist() {
        wifeList.clear();
    }

    public ArrayList<PurchasingCharacteristics> getWifeList() {
        return wifeList;
    }

    public void getAllItemsListFromHusband() {
        System.out.println("Список всех продуктов: " + husband.getAllItemsInAllShops());
    }

    public void getNeedToBuyItems() {
        System.out.println("Дорогая, я нам купил: " + husband.getAllowableProducts(wifeList));
    }

    public void getTotalCost() {
        System.out.println("Всего потречено: " + husband.getTotalCostBougthItems());
    }
}
