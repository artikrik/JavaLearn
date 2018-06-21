package com.company.W8.Shopping;

public class Good {

    private String name;
    private int price;

    public Good(String name, int price) {
        setName(name);
        setPrice(price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  name + "-" + price;
    }
}
