package w8_Shopping;

import java.util.ArrayList;

public class Husband {
    private double totalPriceOfAvailableItems = 0;

    private ArrayList<Item> availableListOfItems = new ArrayList<>();
    private ArrayList<Item> listOfItemsThatArePresent = new ArrayList<>();

    public void rememberItemsFromStore(Store store) {
        availableListOfItems.addAll(store.getListOfItems());
    }

    public ArrayList<Item> getListOfItemsThatArePresent() {
        return availableListOfItems;
    }

    public ArrayList<Item> buyNeededItemsFromStore(ArrayList<Item> listOfNeededItems) {
        for (Item item : availableListOfItems) {
            for (Item listFromWife : listOfNeededItems) {
                if (item.getName().equals(listFromWife.getName()))
                    listOfItemsThatArePresent.add(item);
            }
        }
        return listOfItemsThatArePresent;
    }

    public double getTotalAmountOfAvailableItems() {
        for (Item item : listOfItemsThatArePresent) {
            totalPriceOfAvailableItems += item.getPrice();
        }
        return totalPriceOfAvailableItems;
    }
}