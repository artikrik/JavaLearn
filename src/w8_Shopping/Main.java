package w8_Shopping;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Wife wife = new Wife("");

        Store storeElectronic = new Store();

        ArrayList<Item> itemsElectronic = new ArrayList<>();
        itemsElectronic.add(new Item("Sony", 100));
        itemsElectronic.add(new Item("Samsung", 80));
        itemsElectronic.add(new Item("Sharp", 70));
        itemsElectronic.add(new Item("Apple", 300));
        itemsElectronic.add(new Item("Aser", 40));

        Store storeProducts = new Store();

        ArrayList<Item> itemsProducts = new ArrayList<>();
        itemsProducts.add(new Item("Bread", 110));
        itemsProducts.add(new Item("Sausage", 80));
        itemsProducts.add(new Item("Butter", 70));
        itemsProducts.add(new Item("Milk", 300));
        itemsProducts.add(new Item("Potato", 40));


        System.out.println("TotalList" + itemsElectronic.toString() + itemsProducts.toString());
    }
}
