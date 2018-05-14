package com.company.ForthTask;

import java.util.Arrays;

public class BubbleSortString {
    public static void main(String[] args) {

        String[] phoneList = {"iPhone", "Samsung", "Nokia", "Xiaomi", "Meizu",
                "LG", "Huawei", "Asus", "Sony", "Motorola", "HTC", "1+"};

        for (int i = 0; i < phoneList.length - 1; i++) {
            for (int a = phoneList.length - 1; a > i; a--) {
                if (phoneList[a].compareTo(phoneList[a - 1]) < 0) {
                    String tmp = phoneList[a];
                    phoneList[a] = phoneList[a - 1];
                    phoneList[a - 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(phoneList));
    }
}
