package com.company.w8.Shopping;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Product> productsInShop = new ArrayList<>();

    Shop() {
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (Product d : productsInShop) {
            result.append(d.toString()).append("\n");
        }

        return result.toString();
    }

    public ArrayList<Product> getProductsInShop() {
        return productsInShop;
    }

    public void addProduct(Product product) {
        this.productsInShop.add(product);
    }
}
