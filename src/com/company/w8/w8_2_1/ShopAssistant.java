package w8.w8_2_1;

import java.util.List;

public interface ShopAssistant {
    List<Item> getAllItems();

    List<Item> getAvailableItems(List<String> itemNames);

    long getTotalPrice(List<String> itemNames);
}
