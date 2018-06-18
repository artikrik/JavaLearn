package w9_Shopping;

import java.util.ArrayList;

public class Wife {
    String name;
    double price;

    public Wife(String name, double price) {
        setName(name);
        setPrice(price);

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    ArrayList<Wife> itemsList = new ArrayList<>();

}
