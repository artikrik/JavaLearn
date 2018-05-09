package com.company.ForthTask;

import java.util.Arrays;
import java.util.Random;

//бинарный поиск числа

public class BinarySearchDigits {
    public static void main(String[] args) {
        int foundNumber = 2;    //чило,которое мы будем искать
        boolean a = false;
        //создание массива из 10 элементов
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
        }
        //сортировка массива
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int i = 0;
        int begin = 0, end = arr.length - 1;
        //поиск заданного числа
        while ((!a) && ((end - begin) > 1)) {
            int mid = (begin + end) / 2;
            if ((arr[begin] == foundNumber) || (arr[end] == foundNumber) || arr[mid] == foundNumber) {
                a = true;
            }
            else if (foundNumber < (arr[mid])) {
                end = mid;
            }
            else {
                begin = mid;
            }
            i++;
        }
        if (a) {
            System.out.println("Число " + foundNumber + " найденно за  " + i + " интераций.");
        }
        else {
            System.out.println("Число " + foundNumber + " не найденно.");
        }
    }
}

