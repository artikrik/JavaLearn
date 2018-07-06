package com.company.w8.Shopping;

public class Main {
    public static void main(String[] args) {

        Item sony = new Item("Sony", 100);
        Item samsung = new Item("Samsung", 80);
        Item apple = new Item("Apple", 300);
        Item acer = new Item("Acer", 40);
        Item sausage = new Item("Sausage", 85);
        Item bread = new Item("Bread", 110);
        Item butter = new Item("Butter", 70);
        Item milk = new Item("Milk", 300);
        Item potato = new Item("Potato", 35);
        Item sharp = new Item("Sharp", 70);

        Technostore comfy = new Technostore(acer);
        comfy.addItem(apple);
        comfy.addItem(samsung);
        comfy.addItem(sony);

        GroceryStore ekoMarket = new GroceryStore(sausage);
        ekoMarket.addItem(bread);
        ekoMarket.addItem(butter);
        ekoMarket.addItem(milk);
        ekoMarket.addItem(potato);
        ekoMarket.addItem(sharp);

        //создаем мужа и жену, и связь между ними Агрегирование
        Husband smartMan = new Husband("Pedro");
        Wife wifeNice = new Wife("Francesca", smartMan);

        //Добавляем товары в список жены
        wifeNice.addItemToTheList(sony);
        wifeNice.addItemToTheList(bread);

        //Добавляем магазины в список мужа
        smartMan.addAllItemsHusbandList(comfy);
        smartMan.addAllItemsHusbandList(ekoMarket);

        //выводить на экран 3 пункта
        wifeNice.wifePrintAllItemsInShops();
        wifeNice.getPriceOfPresentItems();
        wifeNice.getPriceOfShopping();
    }
}
