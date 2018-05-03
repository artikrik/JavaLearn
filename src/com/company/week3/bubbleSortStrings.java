package com.company.week3;

import java.util.Arrays;

public class bubbleSortStrings {
    public static void main(String[] args) {
        String [] arr = {"d", "b", "c"};
        bubbleSortOverload.doBubbleSorting(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
