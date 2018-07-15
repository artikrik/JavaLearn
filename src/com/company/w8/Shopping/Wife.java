package com.company.w8.Shopping;

import java.util.ArrayList;
import java.util.List;

public class Wife extends Person {
    public Husband husband;
    private List<Item> wifeList = new ArrayList<>();

    public Wife(String name, Husband husband) {
        super(name);
        this.husband = husband;
    }

    public void addItemToTheList(Item itemToBuy) {
        wifeList.add(itemToBuy);
    }

    public List<Item> getWifeList() {
        return wifeList;
    }

    public void wifePrintAllItemsInShops() {
        husband.printAllItems();
    }

    public void getPriceOfPresentItems() {
        System.out.println("\n" + "Bought:");
        for (Item itemPrint : husband.getManBoughtGoods(wifeList)) {
            System.out.println(itemPrint.toString());
        }
    }

    public void getPriceOfShopping() {
        System.out.println("Total price = " + husband.getTotalPriceOfShopping());
    }
}
