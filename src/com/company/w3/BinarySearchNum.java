package com.company.w3;

import java.util.Arrays;
import java.util.Random;

public class BinarySearchNum {
    public static void main(String[] args) {
        int num = 400; // переменная для поиска числа

        int[] mass = new int[12];
        Random random = new Random(50);
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(500);
        }
        System.out.println("Searching element has index " + binarySearch(mass, num) + " in the array");
    }

    static int binarySearch(int[] mass, int num)

    {
        Arrays.sort(mass);
        System.out.println(Arrays.toString(mass));
        int begin = 0;
        int end = mass.length - 1;
        while (begin <= end) {
            int middle = begin + (end - begin) / 2;
            if (num == mass[middle]) return middle;
            if (num > mass[middle]) begin = middle + 1;
            else end = middle-1;
        }
        return -1;
    }
}
