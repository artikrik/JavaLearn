package w8.w8_2_1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String ... args) {
        Husband husband = new Husband();
        Shop computerShop = new Shop("Computers");
        computerShop.addItem(new Item("Sony", 100));
        computerShop.addItem(new Item("Samsung", 80));
        computerShop.addItem(new Item("Sharp", 70));
        computerShop.addItem(new Item("Apple", 300));
        computerShop.addItem(new Item("Aser", 40));
        husband.addShop(computerShop);

        Shop foodShop = new Shop("Food");
        foodShop.addItem(new Item("Bread", 110));
        foodShop.addItem(new Item("Sausage", 80));
        foodShop.addItem(new Item("Butter", 70));
        foodShop.addItem(new Item("Milk", 300));
        foodShop.addItem(new Item("Potato", 40));
        husband.addShop(foodShop);

        Wife wife = new Wife(husband);

        wife.printAll();

        wife.printAvailable("Sony", "Bread", "Lenovo", "Onion");

        wife.printTotalPrice("Sony", "Bread", "Lenovo", "Onion");
    }
}
