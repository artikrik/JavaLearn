package com.company.shopping;

import java.util.Collections;

public class Wife extends Human {

    public Husband husband;

    public Wife(Husband husband){
        this.husband = husband;
    }

    public void giveListOfProductsToHusband() {
        husband.setPurchaseList(getPurchaseList());
    }

    public void addProduct(String name){
        purchaseList.add(name);
    }

    public void addListOfProducts(String [] values) {
        Collections.addAll(getPurchaseList(), values);
    }

    public void printInfoAboutPurchaseReceivedFromHusband() {
        System.out.println("Purchase list received from wife: " + husband.getPurchaseList());
        System.out.println("\nList of products available for purchase: ");
        husband.printItems(husband.getGoodsFromAllShops());
        System.out.println("\nFound goods from list: ");
        husband.printItems(husband.getFoundGoods());
        System.out.println("\nTotal price of found goods: ");
        System.out.println(husband.getTotalPrice());
    }
}
