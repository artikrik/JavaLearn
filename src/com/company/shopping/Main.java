package com.company.shopping;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final String purchaseList[] = {"Sony", "Lenovo", "Bread", "Onion"};

        Husband husband = new Husband();
        Wife wife = new Wife(husband);
        wife.addListOfProducts(purchaseList);
        wife.giveListOfProductsToHusband();

        husband.goShopping(getListOfShopsToGo());
        wife.printInfoAboutPurchaseReceivedFromHusband();
    }

    public static ArrayList<Shop> getListOfShopsToGo() {
        ArrayList<Shop> shops = new ArrayList<>();
        Shop Comfy = new Shop(Shop.ShopKind.TECHNICS);
        shops.add(Comfy);
        Shop Silpo = new Shop(Shop.ShopKind.FOOD);
        shops.add(Silpo);
        addItemsToStore(Comfy);
        addItemsToStore(Silpo);
        return shops;
    }

    public static void addItemsToStore(Shop shop) {
        switch (shop.shopKind) {

            case FOOD:
                shop.addItem("Bread", 110.0);
                shop.addItem("Sausage", 80.0);
                shop.addItem("Butter", 70.0);
                shop.addItem("Milk", 300.0);
                shop.addItem("Potato", 40.0);
                break;

            case TECHNICS:
                shop.addItem("Sony", 100.0);
                shop.addItem("Samsung", 80.0);
                shop.addItem("Sharp", 70.0);
                shop.addItem("Apple", 300.0);
                shop.addItem("Acer", 40.0);
                break;
        }
    }
}