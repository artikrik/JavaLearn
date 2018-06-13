package com.company.w8.Shopping;

import java.util.Comparator;

public class ComparatorItemByName implements Comparator <Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
