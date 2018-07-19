package w8.Shop;


import w8.Shop.item.Item;
import w8.Shop.stores.GroceryStore;
import w8.Shop.stores.Store;
import w8.Shop.stores.TechnoStore;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Husband {
    private double totalPriceOfAvailableItems = 0;

    private List<Item> listOfItems;
    private Store groceryStore = new GroceryStore();
    private Store technoStore = new TechnoStore();

    public Husband(List<Item> listOfItems) {
        this.listOfItems = listOfItems;
    }

    public void addItems(List<Item> list){
        listOfItems.addAll(list);
    }

    public Set<Item> getListOfItemsThatArePresent() {
        Set<Item> allItems = new HashSet<>(groceryStore.getListOfItems());
        allItems.addAll(technoStore.getListOfItems());
        return allItems;
    }

    public Set<Item> getAvailableItems() {
        Set<Item> availableList = new HashSet<>();
        totalPriceOfAvailableItems = 0;
        for (int i = 0; i < listOfItems.size(); i++){
            Item item = listOfItems.get(i);

            if (groceryStore.getListOfItems().contains(item)) {
                for (Item item1: groceryStore.getListOfItems()){
                    if (item.equals(item1)){
                        availableList.add(item1);
                        totalPriceOfAvailableItems = totalPriceOfAvailableItems + item1.getPrice();
                    }
                }
            }
            if (technoStore.getListOfItems().contains(item)){
                for (Item item1: technoStore.getListOfItems()){
                    if (item.equals(item1)){
                        availableList.add(item1);
                        totalPriceOfAvailableItems = totalPriceOfAvailableItems + item1.getPrice();
                    }
                }

            }
        }
        return availableList;
    }

    public double getTotalPrice() {
        return totalPriceOfAvailableItems;
    }
}