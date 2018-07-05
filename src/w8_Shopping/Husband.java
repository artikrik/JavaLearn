package w8_Shopping;

import java.util.ArrayList;

public class Husband {
    double totalPriceOfAvailableItems = 0;

    ArrayList<Item> avalibleListOfItems = new ArrayList<>();
    ArrayList<Item> listOfItemsThatArePresent = new ArrayList<>();

    public void allItems(InterfaceStore store) {
        avalibleListOfItems.addAll(store.getItemsList());
    }

    public ArrayList<Item> getListOfItemsThatArePresent() {
        return avalibleListOfItems;
    }

    public ArrayList<Item> getlistOfAvailebleItems(ArrayList<Item> listOfNeededItems) {
        for (Item item : avalibleListOfItems) {
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

    public String toString() {
        return avalibleListOfItems.toString();
    }
}
