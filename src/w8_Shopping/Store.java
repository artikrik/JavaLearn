package w8_Shopping;

import java.util.ArrayList;

public class Store {

public String name;
public double price;
public ArrayList itemsList;

public Store (String name, double price){

    ArrayList<Item> itemsList = new ArrayList<>();
    itemsList.add(new Item("Sony", 100));
    itemsList.add(new Item("Samsung", 80));
    itemsList.add(new Item("Sharp", 70));
    itemsList.add(new Item("Apple", 300));
    itemsList.add(new Item("Aser", 40));
    itemsList.add(new Item("Bred", 110));
    itemsList.add(new Item("Sausage", 80));
    itemsList.add(new Item("Butter", 70));
    itemsList.add(new Item("Milk", 300));
    itemsList.add(new Item("Potato", 40));
}

public String toString () {
    return itemsList.toString();
}


}
