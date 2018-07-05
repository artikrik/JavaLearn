package w8_Shopping;

import java.util.ArrayList;

public class TechnoStore implements InterfaceStore {

    ArrayList<Item> itemsList;

    public TechnoStore() {
        itemsList = new ArrayList<>();
    }

    public void listOfTechnoItems(String name, double price) {
        itemsList.add(new Item(name, price));
    }

    public ArrayList<Item> getItemsList() {
        return itemsList;
    }

    @Override
    public String toString() {
        return itemsList.toString();
    }
}