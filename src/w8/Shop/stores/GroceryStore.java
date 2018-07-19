package w8.Shop.stores;

import w8.Shop.item.ProductItem;

public class GroceryStore extends Store {

    public GroceryStore() {
         items.add(new ProductItem("Bread", 110));
         items.add(new ProductItem("Sausage", 80));
         items.add(new ProductItem("Butter", 80));
         items.add(new ProductItem("Milk", 80));
         items.add(new ProductItem("Potato", 80));
    }

    @Override
    protected void addItem(String name, double price) {
        items.add(new ProductItem(name, price));
    }
}