package com.company.Shopping;

import java.util.ArrayList;

public class Wife {

    ArrayList<PurchasingCharacteristics> wifeList = new ArrayList<>();
    Husband husband = new Husband();

    public void productsInWifeList(String purchaseName, double purchasePrise){
        wifeList.add(new PurchasingCharacteristics(
                purchaseName, purchasePrise));
    }

    public void deleteWifelist(){
        wifeList.clear();
    }

    public ArrayList<PurchasingCharacteristics> getWifeList(){
        return wifeList;
    }

    public void getAllItemsListFromHusband(){
        System.out.println("Список всех продуктов: " + husband.getAllItemsInAllShops());
    }

    public void getNeedToBuyItems(){
        System.out.println("Допустимые к покупке продукты: " + husband.getAllowableProducts(wifeList));
    }

    public void getTotalCost() {
        System.out.println("Всего потречено: " + husband.getTotalCostBougthItems());
    }
}
