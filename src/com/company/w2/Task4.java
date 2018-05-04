package com.company.w2;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
            int[] massFirst = new int[5];
            int[] massSecond = new int[5];

            Random random = new Random(3);
            Random random2 = new Random(1);
            for (int i = 0; i < massFirst.length; i++) {
                massFirst[i] = random.nextInt(5) + 1;
            }
            for (int i = 0; i < massSecond.length; i++) {
                massSecond[i] = random2.nextInt(5) + 1;
            }
            // Выводим и находим Среднее Арифметичное масивов
            System.out.println(Arrays.toString(massFirst));
            System.out.println(Arrays.toString(massSecond));

            if (arithmeticAverage(massFirst) > arithmeticAverage(massSecond))
                System.out.println("Среднее арифметическое элементов  1 массива больше");
            else if (arithmeticAverage(massFirst) < arithmeticAverage(massSecond))
                System.out.println("Среднее арифметическое элементов 2 массива больше");
            else System.out.println("Среднее арифметическое элементов каждого массива равны");
        }

    public static int arithmeticAverage(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        sum /= a.length;
        return sum;
    }

}
