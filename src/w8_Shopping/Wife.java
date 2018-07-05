package w8_Shopping;

import java.util.ArrayList;

public class Wife {

    private ArrayList<Wife> listOfNeededItems = new ArrayList<>();

    private String name;

    public Wife(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private Husband husband;

    public Wife(Husband husband) {
        this.husband = husband;
    }

    public void listOfItemsFromWife(String name) {
        listOfNeededItems.add(new Wife(name));
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