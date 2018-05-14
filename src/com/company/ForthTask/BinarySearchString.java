package com.company.ForthTask;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchString {
    public static void main(String[] args) {

        String[] phoneList = {"iPhone", "Samsung", "Nokia", "Xiaomi", "Meizu",
                "LG", "Huawei", "Asus", "Sony", "Motorola", "HTC", "1+"};
        int numberPosition = 0;
        String phone = " ";

        for (int i = 0; i < phoneList.length; i++) {
            Arrays.sort(phoneList);
        }

        System.out.println(Arrays.toString(phoneList));
        System.out.println("Введите марку телефона, который ищите: ");
        Scanner scanner = new Scanner(System.in);
        phone = scanner.next();

        String massIndex = " ";
        int first = 0;
        int last = phoneList.length - 1;

        while (first <= last) {
            numberPosition = (first + last) / 2;
            if ((phoneList[numberPosition].compareTo(phone)) == 0) {
                massIndex = phoneList[numberPosition];
                break;
            } else if ((phoneList[numberPosition].compareTo(phone)) > 0) {
                last = numberPosition - 1;
            } else if ((phoneList[numberPosition].compareTo(phone)) < 0) {
                first = numberPosition + 1;
            }
        }
        if (massIndex.equals(" ")) {
            System.out.println("Такая модель не найденна");
        } else
            System.out.println("Ваш телефон находится под индексом: " + numberPosition);
    }
}

