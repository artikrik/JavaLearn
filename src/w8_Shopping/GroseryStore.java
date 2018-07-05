package w8_Shopping;

import java.util.ArrayList;

public class GroseryStore implements InterfaceStore {

    ArrayList<Item> itemsList;

    public GroseryStore() {
        itemsList = new ArrayList<>();
    }

    public void listOfGroseryItems(String name, double price) {
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
