package com.company.ForthTask;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortInt {
    public static void main(String[] args) {
        Random random = new Random();
        int[] bubbleArrToSort = new int[25];
        for (int i = 0; i < bubbleArrToSort.length; i++) {
            bubbleArrToSort[i] = random.nextInt(10);
            System.out.print(bubbleArrToSort[i] + ", ");
        }
        for (int i = 0; i < bubbleArrToSort.length; i++) {
            for (int a = bubbleArrToSort.length - 1; a > i; a--) {
                if (bubbleArrToSort[a] < bubbleArrToSort[a - 1]) {
                    int tmp = bubbleArrToSort[a];
                    bubbleArrToSort[a] = bubbleArrToSort[a - 1];
                    bubbleArrToSort[a - 1] = tmp;
                }
            }
        }
        System.out.println("\n" + Arrays.toString(bubbleArrToSort));
    }
}
