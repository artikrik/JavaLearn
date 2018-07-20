package w8.w8_2_1;

public class Item {
    private String name;
    private long price;

    public Item(String name, long price) {
        setName(name);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - " + price;
    }
}
