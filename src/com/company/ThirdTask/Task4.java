package com.company.ThirdTask;

//Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
//выведите массивы на экран в двух отдельных строках. Посчитайте
//среднее арифметическое элементов каждого массива и сообщите, для
//какого из массивов это значение оказалось больше (либо сообщите, что их
//средние арифметические равны).

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        double sumA = 0, sumB = 0;   //создаём переменную для присвоения среднего арифм.
        Random random = new Random();
        int a[] = new int[5];
        int b[] = new int[5];

        //создаём первый массив
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(5);
            System.out.print(a[i] + " ");
            sumA += (double) a[i] / a.length;   //вычисляем сред.арифм. первого массива
        }
        System.out.println();
        //создаём второй массив
        for (int i = 0; i < b.length; i++) {
            b[i] = random.nextInt(5);
            System.out.print(b[i] + " ");
            sumB += (double) b[i] / b.length;   //вычисляем сред.арифм. второго массива
        }
        System.out.println();

        //сравниваем массивы
        if (sumA == sumB)
            System.out.println("Средние арифметические значения двух массивов равны");
        else {
            if (sumA > sumB)
                System.out.println("Среднее арифметическое первого массива больше");
            else
                System.out.println("Среднее арифметическое второго массива больше");
        }
    }

}