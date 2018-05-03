package com.company.week3;

import java.util.Arrays;

public class bubbleSortOverload {
    public static void main(String[] args) {
        int arrayLength = 10, randomBound = 10;
        int [] arr = linearSearchOverload.generateRandomIntArray(arrayLength,randomBound);
        System.out.println("Array of integer before sort: " + Arrays.toString(arr));
        doBubbleSorting(arr);
        System.out.println("Array of integer after sort: " + Arrays.toString(arr));

        int wordLength = 3;
        String [] arrS = linearSearchOverload.generateRandomStringArray(arrayLength,wordLength);
        System.out.println("Array of strings before sort: " + Arrays.toString(arrS));
        doBubbleSorting(arrS);
        System.out.println("Array of integer after sort: " + Arrays.toString(arrS));
    }

    public static void doBubbleSorting (int [] a){
        for (int index = 0; index < a.length - 1; index++) {
            boolean sorted = true;
            for (int i = 0; i < a.length - 1 - index; i++) {
                if (a[i] > (a[i + 1])) {
                    sorted = false;
                    int tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                }
            }
            if (sorted) {
                break;
            }
        }
    }

    public static void doBubbleSorting (String [] arr){
        for (int it = 0; it < arr.length - 1; it++) {
            boolean sorted = true;
            for (int i = 0; i < arr.length - 1 - it; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0 ) {
                    sorted = false;
                    String tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
            if (sorted) {
                break;
            }
        }
    }
}