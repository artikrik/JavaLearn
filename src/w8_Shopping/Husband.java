package w8_Shopping;

import java.util.ArrayList;

public class Husband {

    ArrayList<Item> avalibleListOfItems = new ArrayList<>();

    public void allItems(InterfaceStore store) {
        avalibleListOfItems.addAll(store.getItemsList());
    }

    public ArrayList<Item> getExecutableListOfItems(ArrayList<Item> listOfNeededItems) {
        ArrayList<Item> wifeList = listOfNeededItems;
        for (Item item : avalibleListOfItems){
            for (Item listFromWife : listOfNeededItems){
                if (item.getName().equals(listFromWife.getName()))
                    wifeList.add(item);
            }
        }
        return wifeList;
    }

    public ArrayList<Item> getAvalibleListOfItems() {
        return avalibleListOfItems;
    }

    public String toString() {
        return avalibleListOfItems.toString();
    }

}
