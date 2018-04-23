package com.company.w3;

import java.util.Arrays;

public class Problem3_1_3 {
    public static void main(String[] args) {
        int[] mas = new int[20];
        Problem3_1.randomizeArray(mas, 50);
        System.out.println(Arrays.toString(mas));
        bubbleSort(mas);
        System.out.println(Arrays.toString(mas));
    }

    private static void bubbleSort(int[] a) {
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] < a[i + 1]) {
                    isSorted = false;
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
    }
}
