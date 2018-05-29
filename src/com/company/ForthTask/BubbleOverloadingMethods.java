package com.company.ForthTask;

import java.util.Arrays;
import java.util.Random;

public class BubbleOverloadingMethods {
    public static void main(String[] args) {
        String[] phones = {"iPhone", "Samsung", "Nokia", "Xiaomi", "Meizu",
                "LG", "Huawei", "Asus", "Sony", "Motorola", "HTC", "1+"};
        System.out.println(Arrays.toString(phones));
        bubleSort(phones);
        System.out.println(Arrays.toString(phones));

        int[] mass = new int[15];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(mass));
        bubleSort(mass);
        System.out.println(Arrays.toString(mass));
    }

    static int[] bubleSort(int[] mass) {  // возвращаемый тип можно сделать void
        for (int i = mass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mass[j] > mass[j + 1]) {
                    int tmp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = tmp;
                }
            }
        }
        return mass;
    }

    static String[] bubleSort(String[] mass) {   // возвращаемый тип можно сделать void
        for (int i = mass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mass[j].compareTo(mass[j + 1]) > 0) {
                    String tmp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = tmp;
                }
            }
        }
        return mass;
    }
}
