package com.company.ForthTask;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSortStringInMethods {
    public static void main(String[] args) {
        String[] phoneList = {"iPhone", "Samsung", "Nokia", "Xiaomi", "Meizu",
                "LG", "Huawei", "Asus", "Sony", "Motorola", "HTC", "1+"};
        bubbleSort(phoneList);
    }

    public static void bubbleSort(String[] phonesSort) {
        for (int i = 0; i < phonesSort.length - 1; i++) {
            for (int a = phonesSort.length - 1; a > i; a--) {
                if (phonesSort[a].compareTo(phonesSort[a - 1]) < 0) {
                    String tmp = phonesSort[a];
                    phonesSort[a] = phonesSort[a - 1];
                    phonesSort[a - 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(phonesSort));
    }
}

