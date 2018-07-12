package com.company.shopping;

import java.util.ArrayList;

public class Husband extends Human {

    private ArrayList<Item> foundGoods = new ArrayList<>();

    private ArrayList<Item> totalListOfGoods = new ArrayList<>();

    public void goShopping(ArrayList<Shop> shops) {
        for (Shop shop: shops) {
            goToShop(shop);
        }
    }

    public void goToShop(Shop shop) {
            addGoodsFromShopToTotalListOfGoods(shop);
            findNeededGoods(shop.getItems());
    }

    public void printTotalListOfGoodsInStores() {
        for (Item item: getGoodsFromAllShops()) {
            System.out.println("Total list: \n" + item.toString());
        }
    }

    public void findNeededGoods(ArrayList<Item> list) {
        for(String item: purchaseList) {
            for (Item good: list) {
                if (item.equals(good.getName())) {
                    foundGoods.add(good);
                    break;
                }
            }
        }
    }

    public void printItems(ArrayList<Item> list) {
        for(Item item: list) {
            System.out.println(item.toString());
        }
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for(Item item: foundGoods) {
            totalPrice += item.getPrice();
        }
    return totalPrice;
    }

    private void addGoodsFromShopToTotalListOfGoods(Shop shop) {
        totalListOfGoods.addAll(shop.getItems());
    }

    public ArrayList<Item> getGoodsFromAllShops() {
        return totalListOfGoods;
    }

    public ArrayList<Item> getFoundGoods() {
        return foundGoods;
    }
}
