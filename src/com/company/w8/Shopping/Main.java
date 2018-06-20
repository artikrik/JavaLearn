package com.company.w8.Shopping;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Item sony = new Item("Sony", 100);
        Item samsung = new Item("Samsung", 80);
        Item apple = new Item("Apple", 300);
        Item aser = new Item("Acer", 40);
        Item sausege = new Item("Sausage", 80);
        Item bread = new Item("Bread", 110);
        Item butter = new Item("Butter", 70);
        Item milk = new Item("Milk", 300);
        Item potato = new Item("Potato", 40);
        Item sharp = new Item("Sharp", 70);

        Comfy comfy = new Comfy(aser);
        comfy.addItem(apple);
        comfy.addItem(samsung);
        comfy.addItem(sony);
        GroceryStore ekoMarket = new GroceryStore(sausege);
        ekoMarket.addItem(bread);
        ekoMarket.addItem(butter);
        ekoMarket.addItem(milk);
        ekoMarket.addItem(potato);
        ekoMarket.addItem(sharp);

        Husband smartMan = new Husband("Pedro");
        Wife wifeNice = new Wife("Francesca");
        smartMan.wife = wifeNice;
        wifeNice.husband = smartMan;
        wifeNice.addItemToTheList(aser);
        wifeNice.addItemToTheList(bread);

        ArrayList<IShop> myShops = new ArrayList<>();
        myShops.add(comfy);
        myShops.add(ekoMarket);

        smartMan.takeListToBuy();
        smartMan.showAllShopItems(myShops);

        ArrayList<Item> manBoughtIt = new ArrayList<>();

        for (IShop currentShop: myShops) {
            manBoughtIt.addAll(currentShop.whatYouCanBuyInShops(smartMan.listWhatToBuy));
        }

        System.out.println("Bought:");

        for (Item itemToPrint : manBoughtIt) {
            System.out.println(itemToPrint.toString());
        }
    }
}
