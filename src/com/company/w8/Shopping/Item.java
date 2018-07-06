package com.company.w8.Shopping;

public class Item {

    private String name;
    private double price;

    public Item(String name) {
        setName(name);
    }

    public Item(String name, double price) {
        setName(name);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - " + price;
    }

    public int compareTo(Item item) {
        if (this.getName().compareTo(item.getName()) == 0) return 0;
        else return -1;
    }
}