package com.company.w8.Shopping;

import java.util.ArrayList;

public class Wife extends Person {
    public Husband husband;
    private ArrayList<Item> listWhatToBuy = new ArrayList<>();

    public Wife(String name) {
        super(name);
    }

    public Wife(String name, Husband husband) {
        super(name);
        this.husband = husband;
    }

    public void addItemToTheList(Item itemToBuy) {
        listWhatToBuy.add(itemToBuy);
    }

    public ArrayList<Item> getListWhatToBuy(){
        return listWhatToBuy;
    }

    public ArrayList<Item> giveHusbandListToBuy() {
        return listWhatToBuy;
    }

    public void wifePrintAllItemsInMarkerts() {
        husband.showAllShopItems();
    }

    public void getPriceOfPresentItems() {
        System.out.println("\n"+"Bought:");
        for (Item itemPrint : husband.getManBoughtGoods()) {
            System.out.println(itemPrint.toString());
        }
    }

    public void getPriceOfShopping() {
        System.out.println("Total price = " + husband.getTotalPriceOfShopping());
    }
}
