package w8_Shopping;

import java.util.ArrayList;

public class Item {

    private String name;
    private  double price;

    public Item(String name, double price) {
        setName(name);
        setPrice(price);
        }

        public void setName (String name){
        this.name = name;
        }

        public void  setPrice (double price){
        this.price = price;
        }

        public String getName (){
        return name;
        }

        public double getPrice (){
        return price;
        }
        ArrayList<Item>itemsSet = new ArrayList<>();


    Item item0 = new Item("Sony", 100);
    Item item1 = new Item("Samsung", 80);
    Item item2 = new Item("Sharp", 80);
    Item item3 = new Item("Apple", 70);
    Item item4 = new Item("Aser", 40);
    Item item5 = new Item("Bread", 110);
    Item item6 = new Item("Sausage", 80);
    Item item7 = new Item("Butter", 70);
    Item item8 = new Item("Milk", 300);
    Item item9 = new Item("Potato", 40);


    public String toString (){
        return "name " + getName() + " price " + getPrice();
    }

}
