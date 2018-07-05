package w8_Shopping;

import java.util.ArrayList;

public class Husband {

    ArrayList<Item> avalibleListOfItems = new ArrayList<>();

    public void allItems(InterfaceStore store) {
        avalibleListOfItems.addAll(store.getItemsList());
    }

    public ArrayList<Item> getExecutableListOfItems(ArrayList<Item> listOfNeededItems) {
        ArrayList<Item> wifeList = listOfNeededItems;

// add compare method avalibleListOfItems & listOfNeededItems

        return wifeList;
    }

    public String toString() {
        return avalibleListOfItems.toString();
    }

}
