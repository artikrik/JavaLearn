package com.company.ForthTask;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchStringInMethods {
    public static void main(String[] args) {
        String[] phoneList = {"iPhone", "Samsung", "Nokia", "Xiaomi", "Meizu",
                "LG", "Huawei", "Asus", "Sony", "Motorola", "HTC", "1+"};
        String phone = " ";

        System.out.println("Введите марку телефона, который ищите: ");
        Scanner scanner = new Scanner(System.in);
        phone = scanner.next();

        binarySearch(phoneList, phone);

    }

    public static void binarySearch(String[] phoneSearch, String phone) {
        int last = phoneSearch.length - 1;
        int first = 0;
        int mid = (last + 1) / 2;

        Arrays.sort(phoneSearch);

        while (phoneSearch[mid] != phone && last != mid && first != mid) {
            if (phoneSearch[mid].compareTo(phone) < 0) {
                first = mid;
                mid = (last + first) / 2;
            } else {
                last = mid;
                mid = (last + first) / 2;
            }
        }
        if (phoneSearch[last].equals(phone))
            mid = last;
        if (phoneSearch[first].equals(phone))
            mid = first;
        System.out.print(phoneSearch[mid].equals(phone) ? "Ваш телефон находится под индексом: " + mid : "Телефон не найден");
    }
}

