package com.company.w8.Shopping;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        Item sony = new Item("Sony", 100);
        Item samsung = new Item("Samsung", 80);
//        Item apple = new Item("Apple", 300);
        Item acer = new Item("Acer", 40);
        Item sausege = new Item("Sausage", 80);
//        Item bread = new Item("Bread", 110);
//        Item butter = new Item("Butter", 70);
//        Item milk = new Item("Milk", 300);
//        Item potato = new Item("Potato", 35);
//        Item sharp = new Item("Sharp", 70);

        Comfy comfy = new Comfy(acer);
//       comfy.addItem(apple);
        comfy.addItem(samsung);
//        comfy.addItem(sony);
       GroceryStore ekoMarket = new GroceryStore(sausege);
//        ekoMarket.addItem(bread);
//        ekoMarket.addItem(butter);
//        ekoMarket.addItem(milk);
//        ekoMarket.addItem(potato);
//        ekoMarket.addItem(sharp);

        Husband smartMan = new Husband("Pedro");
        Wife wifeNice = new Wife("Francesca", smartMan);
        smartMan.wife = wifeNice;

        wifeNice.addItemToTheList(samsung);
//        wifeNice.addItemToTheList(bread);

        ArrayList<IShop> shopsInTown = new ArrayList<>();
        shopsInTown.add(comfy);
        shopsInTown.add(ekoMarket);

        smartMan.takeListToBuy();
        smartMan.showAllShopItems(shopsInTown);

        ArrayList<Item> manBoughtIt = new ArrayList<>();

        for (IShop currentShop: shopsInTown) {
            manBoughtIt.addAll(currentShop.compareWhatYouCanBuyFromShopsList(smartMan.listWhatToBuy));
        }

        System.out.println("Bought:");

        for (Item itemToPrint : manBoughtIt) {
            System.out.println(itemToPrint.toString());
        }
    }
}
