package w8.Shop.stores;


import w8.Shop.item.Item;

import java.util.HashSet;
import java.util.Set;

public abstract class Store {
    protected Set<Item> items = new HashSet<>();

    protected abstract void addItem(String name, double price);

    public Set<Item> getListOfItems() {
        return items;
    }
}