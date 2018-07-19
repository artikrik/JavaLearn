package w8.Shop;


import w8.Shop.item.Item;
import w8.Shop.item.ItemGood;
import w8.Shop.item.ProductItem;

import java.util.ArrayList;
import java.util.List;

public class Wife {

    private List<Item> listOfNeededItems = new ArrayList<>();
    private Husband husband;


    public Wife() {
        initListOfItems();
        this.husband = new Husband(listOfNeededItems);
    }

    public List<Item> getListOfNeededItems() {
        return listOfNeededItems;
    }

    private void initListOfItems() {
        listOfNeededItems.add(new ItemGood("Sony", 100));
        listOfNeededItems.add(new ItemGood("Lenovo", 110));
        listOfNeededItems.add(new ItemGood("Samsung"));
        listOfNeededItems.add(new ProductItem("Bread", 110));
        listOfNeededItems.add(new ProductItem("Onion ", 110));

    }

    public void addItems(List<Item> list){
        listOfNeededItems.addAll(list);
    }

    public void addItem(Item item){
        listOfNeededItems.add(item);
    }

    public void showTotalListOfItemsFromHusband() {
        System.out.println("Total list:");
        for (Item item : husband.getListOfItemsThatArePresent()){

            System.out.println(item);
        }
    }

    public void showListOfAvailableItems() {
        System.out.println("Bought:");
        for (Item boughtItems : husband.getAvailableItems())
            System.out.println(boughtItems);
    }

    public void showTotalPriceOfBoughtItems() {
        System.out.println("Total price = " + husband.getTotalPrice());
    }
}