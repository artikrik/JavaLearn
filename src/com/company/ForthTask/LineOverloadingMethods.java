package com.company.ForthTask;

import java.util.Arrays;
import java.util.Random;

public class LineOverloadingMethods {
    public static void main(String[] args) {
        String findPhone = "Sony";
        String[] phoneList = {"iPhone", "Samsung", "Nokia", "Xiaomi", "Meizu",
                "LG", "Huawei", "Asus", "Sony", "Motorola", "HTC", "1+"};
        System.out.println(Arrays.toString(phoneList));
        System.out.println("Элемент " + linearSearch(phoneList, findPhone));

        int num = 54;
        int[] massNum = new int[20];
        Random random = new Random(8);
        for (int i = 0; i < massNum.length; i++) {
            massNum[i] = random.nextInt(100);
        }
        System.out.println("Элемент " + linearSearch(massNum, num));

    }

    static String linearSearch(String[] mass, String key) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].equals(key)) return "находится под индексом: " + i;
        }
        return "отсутствует в массиве";
    }

    static String linearSearch(int[] mass, int num) {

        System.out.println(Arrays.toString(mass));
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == num) return "находится под индексом: " + i;
        }
        return "отсутствует в массиве";
    }
}
