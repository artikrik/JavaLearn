package w8.w8_2_1;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private String name;
    private List<Item> items = new ArrayList<>();

    public Shop(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItemList() {
        return items;
    }
}
