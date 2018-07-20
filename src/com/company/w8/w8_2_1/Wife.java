package w8.w8_2_1;

import java.util.Arrays;
import java.util.List;

public class Wife {

    private ShopAssistant assistant;

    public Wife(ShopAssistant assistant) {
        this.assistant = assistant;
    }

    public void printAll() {
        System.out.println("Total list:");

        for (Item item: assistant.getAllItems()) {
            System.out.println(item);
        }
        System.out.println();
    }

    public void printAvailable(String ... itemNames) {
        List<Item> availableItems = assistant.getAvailableItems(Arrays.asList(itemNames));
        System.out.println("Bought:");
        for (Item item: availableItems) {
            System.out.println(item);
        }
        System.out.println();
    }

    public void printTotalPrice(String ... itemNames) {
        System.out.println("Total price = " + assistant.getTotalPrice(Arrays.asList(itemNames)));
    }
}
