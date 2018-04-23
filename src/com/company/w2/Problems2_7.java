package com.company.w2;

import java.util.Arrays;

/*
Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел. Каждый
элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым индексом к
элементу из второго массива с i-ым индексом. Вывести все три массива на экран (каждый на отдельной строке), затем
вывести количество целых элементов в третьем массиве.
*/

public class Problems2_7 {
    private static final int LENGTH = 10;
    private static final int[] FIRST_ARRAY = new int[LENGTH];
    private static final int[] SECOND_ARRAY = new int[LENGTH];
    private static final double[] THIRD_ARRAY = new double[LENGTH];

    public static void main(String[] args) {
        double num;
        int count = 0;
        //Random
        for (int i = 0; i < LENGTH; i++) {
            FIRST_ARRAY[i] = (int) (1 + Math.random() * 8);
            SECOND_ARRAY[i] = (int) (1 + Math.random() * 8);
            num = (double) FIRST_ARRAY[i] / SECOND_ARRAY[i];
            THIRD_ARRAY[i] = num;
            if (num % 1 == 0) {
                count++;
            }
        }

        System.out.println("FIRST_ARRAY lenght = " + LENGTH + "\nArray:  " + Arrays.toString(FIRST_ARRAY) + "\n");
        System.out.println("SECOND_ARRAY lenght = " + LENGTH + "\nArray:  " + Arrays.toString(SECOND_ARRAY) + "\n");
        System.out.println("THIRD_ARRAY lenght = " + LENGTH + "\nArray:  " + Arrays.toString(THIRD_ARRAY) + "\n");

        System.out.println("количество целых элементов в третьем массиве: " + count);
    }
}
