package w8.w8_2_1;

import java.util.ArrayList;
import java.util.List;

public class Husband implements ShopAssistant {

    private List<Shop> shops = new ArrayList<>();

    public void addShop(Shop shop) {
        shops.add(shop);
    }

    @Override
    public List<Item> getAllItems() {
        List<Item> items = new ArrayList<>();
        for (Shop shop: shops) {
            items.addAll(shop.getItemList());
        }
        return items;
    }

    @Override
    public List<Item> getAvailableItems(List<String> itemNames) {
        List<Item> availableItems = new ArrayList<>();
        for (Item item : getAllItems()) {
            if (itemNames.contains(item.getName())) {
                availableItems.add(item);
            }
        }
        return availableItems;
    }

    @Override
    public long getTotalPrice(List<String> itemNames) {
        long price = 0;
        for (Item item : getAvailableItems(itemNames)) {
            price += item.getPrice();
        }

        return price;
    }
}
