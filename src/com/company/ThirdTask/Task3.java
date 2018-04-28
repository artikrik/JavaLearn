package com.company.ThirdTask;
//Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите
//массив на экран в строку. Замените каждый элемент с нечётным индексом
//на ноль. Снова выведете массив на экран на отдельной строке.

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int a[] = new int[8];
        Random random = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Замена всех нечётных значений на 0");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0)
                a[i] = 0;
                System.out.print(a[i] + " ");
        }
    }
}
