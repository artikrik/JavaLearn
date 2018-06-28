package w8.w8_2;

import java.util.ArrayList;
import java.util.List;

public class Husband {

    private List<Shop> shops = new ArrayList<>();
    public Husband() {
        Shop computerShop = new Shop("Computers");
        computerShop.addItem(new Item("Sony", 100));
        computerShop.addItem(new Item("Samsung", 80));
        computerShop.addItem(new Item("Sharp", 70));
        computerShop.addItem(new Item("Apple", 300));
        computerShop.addItem(new Item("Aser", 40));
        shops.add(computerShop);

        Shop foodShop = new Shop("Food");
        foodShop.addItem(new Item("Bread", 110));
        foodShop.addItem(new Item("Sausage", 80));
        foodShop.addItem(new Item("Butter", 70));
        foodShop.addItem(new Item("Milk", 300));
        foodShop.addItem(new Item("Potato", 40));
        shops.add(foodShop);
    }

    public List<Item> getAllItems() {
        List<Item> items = new ArrayList<>();
        for (Shop shop: shops) {
            items.addAll(shop.getItemList());
        }
        return items;
    }

    public List<Item> getAvailableItems(List<String> itemNames) {
        List<Item> availableItems = new ArrayList<>();
        for (Item item : getAllItems()) {
            if (itemNames.contains(item.getName())) {
                availableItems.add(item);
            }
        }
        return availableItems;
    }

    public long getTotalPrice(List<String> itemNames) {
        long price = 0;
        for (Item item : getAvailableItems(itemNames)) {
            price += item.getPrice();
        }

        return price;
    }
}
