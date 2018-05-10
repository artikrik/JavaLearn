package com.company.w3;

import java.util.Arrays;
import java.util.Random;

public class BubleSortNum {
    public static void main(String[] args) {
        int[] mass = new int[20];
        Random random = new Random(50);
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(mass));
        bubleSearch(mass);
        System.out.println(Arrays.toString(mass));
    }

    static int[] bubleSearch(int[] mass) {
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
}

