package w8_Shopping;

import java.util.ArrayList;

public class GroceryStore implements Store {

    private ArrayList<Item> listOfItems;

    public GroceryStore() {
        listOfItems = new ArrayList<>();
    }

    public void listOfGroceryItems(String name, double price) {
        listOfItems.add(new Item(name, price));
    }

    public ArrayList<Item> getListOfItems() {
        return listOfItems;
    }
}