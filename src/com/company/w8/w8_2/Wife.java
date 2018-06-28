package w8.w8_2;

import java.util.Arrays;
import java.util.List;

public class Wife {



    public static void main(String ... args) {
        Husband husband = new Husband();

        List<Item> allItems = husband.getAllItems();
        System.out.println("Total list:");
        for (Item item: allItems) {
            System.out.println(item);
        }
        System.out.println();

        List<String> itemNames = Arrays.asList("Sony", "Bread", "Lenovo", "Onion");
        List<Item> availableItems = husband.getAvailableItems(itemNames);
        System.out.println("Bought:");
        for (Item item: availableItems) {
            System.out.println(item);
        }
        System.out.println();

        System.out.println("Total price = " + husband.getTotalPrice(itemNames));
    }
}
