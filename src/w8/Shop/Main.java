package w8.Shop;

import w8.Shop.item.ItemGood;

public class Main {
    public static void main(String[] args) {



        Wife wife = new Wife();


        Husband husband = new Husband(wife.getListOfNeededItems());

        wife.showTotalListOfItemsFromHusband();
        wife.showListOfAvailableItems();
        wife.showTotalPriceOfBoughtItems();


    }
}