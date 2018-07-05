package w8_Shopping;

import java.util.ArrayList;

public class TechnoStore implements Store {

    private ArrayList<Item> listOfItems;

    public TechnoStore() {
        listOfItems = new ArrayList<>();
    }

    public void listOfTechnoItems(String name, double price) {
        listOfItems.add(new Item(name, price));
    }

    public ArrayList<Item> getListOfItems() {
        return listOfItems;
    }
}