package w8_Shopping;

import java.util.ArrayList;

public class Wife {

    public ArrayList<Item> listOfNeededItems = new ArrayList<>();

    Husband husband;

    public Wife(Husband husband) {
        this.husband = husband;
    }

    public void listOfItemsFromWife(String name, double price) {
        listOfNeededItems.add(new Item(name, price));
    }

    public void showTotalListOfItemsFromHusband() {
        System.out.println("Total list:");
        for (Item totalListOfItems : husband.getListOfItemsThatArePresent())
            System.out.println(totalListOfItems);
    }

    public void showListOfBoughtItems() {
        System.out.println("\nBought:");
        for (Item boughtItems : husband.buyNeededItemsFromStore(listOfNeededItems))
            System.out.println(boughtItems);
    }

    public void showTotalPriceOfBoughtItems() {
        System.out.println("Total price = " + husband.getTotalAmountOfAvailableItems());
    }
}