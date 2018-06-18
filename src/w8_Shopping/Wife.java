package w8_Shopping;

import java.util.ArrayList;

public class Wife {
    String name;


    public Wife(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    ArrayList<Wife> itemsList = new ArrayList<>();

}
