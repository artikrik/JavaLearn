package com.company.w8.Shopping;

public class Main {
    public static void main(String[] args) {

        Item sony = new Item("Sony",100);
        Item samsung = new Item("Samsung",80);
        Item apple = new Item("Apple",300);
        Item aser = new Item("Acer",40);
        Item sausege = new Item("Sausage", 80);
        Item bread = new Item("Bread", 110);
        Item butter = new Item("Butter", 70);
        Item milk = new Item("Milk", 300);
        Item potato = new Item("Potato", 40);
        Item sharp = new Item("Sharp", 70);

        Shop comfy = new Shop(aser);
        comfy.addItem(apple);
        comfy.addItem(samsung);
        comfy.addItem(sony);
        Shop ekoMarket = new Shop(sausege);
        ekoMarket.addItem(bread);
        ekoMarket.addItem(butter);
        ekoMarket.addItem(milk);
        ekoMarket.addItem(potato);
        ekoMarket.addItem(sharp);

        Husband smartMan = new Husband("Pedro");
        Wife wifeNice = new Wife("Francesca");
        smartMan.wife = wifeNice;
        wifeNice.husband=smartMan;
        wifeNice.addItemToTheList(sony);
        wifeNice.addItemToTheList(bread);
        smartMan.takeListToBuy();
    }
}
