package com.company.w3;

/*
1. Числа
    3.2 бинарный поиск
 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem3_1_2 {
    public static void main(String[] args) {
        int[] array = new int[59];

        Scanner input = new Scanner(System.in);
        System.out.println("Введите число для поиска: ");
        int numberToFind = input.nextInt();

        Problem3_1.randomizeArray(array, 20);
        System.out.println(Arrays.toString(array));
        //сортируем, это же бинарный поиск
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        binSearch(array,numberToFind);
    }

    private static void binSearch(int[] a, int num) {
        int min, max, mid;
        min = 0;
        max = a.length - 1;
        mid = (max + 1) / 2;


        while (a[mid] != num && max != mid && min != mid) {
            if (a[mid] < num) {
                mid = (max + mid) / 2;
            } else if (a[mid] > num) {
                max = mid;
                mid = max / 2;
            }
        }
        if (a[max] == num) {
            mid = max;
        }
        if (a[min] == num) {
            mid = min;
        }

        System.out.print(a[mid] == num ? mid : "Not found");
    }
}
