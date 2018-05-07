package com.company.ThirdTask;

//Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите
//массив на экран. Подсчитайте сколько в массиве чётных элементов и
//выведете это количество на экран на отдельной строке.

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int[] a = new int[15];
        int b = 0;
        Random random = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(9);
            System.out.print(a[i] + " ");
            if (a[i] % 2 == 0)
                b++;
        }
        System.out.println();
        System.out.println("Всего чётных чисел: " + b);
    }
}