package com.company.week3;

import java.util.Arrays;
import java.util.Random;

public class bubbleSortDigits {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
        }
        System.out.println("Array before sort: " + Arrays.toString(arr));
        int count = 0;
        for (int it = 0; it < arr.length - 1; it++) {
            boolean sorted = true;
            for (int i = 0; i < arr.length - 1 - it; i++) {
                if (arr[i] > arr[i + 1]) {
                    sorted = false;
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
                count++;
            }
            if (sorted)
                break;
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("How many iterations? " + count);
    }
}