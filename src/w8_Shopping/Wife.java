package w8_Shopping;


import java.util.ArrayList;

public class Wife {

    public ArrayList<Item> listOfNeededItems = new ArrayList<>();

    Husband husband = new Husband();

    public void itemsNeedToBought (String name, double price){
        listOfNeededItems.add(new Item(name, price));
    }

    public ArrayList<Item> getListOfNeededItems() {
        return listOfNeededItems;
    }

    public void getListOfAllItems(){
        System.out.println("Total list:"+ husband.avalibleListOfItems);
    }

    @Override
    public String toString() {
        return listOfNeededItems.toString();
    }
}
