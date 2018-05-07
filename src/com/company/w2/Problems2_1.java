package com.company.w2;

import java.util.Arrays;

/*
Создайте массив из всех нечётных чисел от 1 до 99,
выведите его на экран в строку,
а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
*/
public class Problems2_1 {

    private static final int A = 99;

    public static void main(String[] args) {
        System.out.println("\n*****************************************************************" + "\nПервый вариант");
        firstVariant();
        System.out.println();
        System.out.println("\n*****************************************************************" + "\nВторой вариант");
        secondVariant();

    }


    private static void firstVariant() {
        int count = 0;
        for (int i = 1; i <= A; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }

        int[] ARR = new int[count];

        int j = 0;
        for (int i = 0; i <= A; i++) {
            if (i % 2 != 0) {
                ARR[j] = i;
                j++;
            }
        }

        // Просто глянем наш массив
        System.out.println(Arrays.toString(ARR));

        System.out.println("\nпо порядку");
        for (int i = 0; i < ARR.length; i++) {
            System.out.print(ARR[i] + "\t");
        }

        System.out.println(" ");
        System.out.println("\nв обратном порядке");
        for (int i = ARR.length - 1; i > -1; i--) {
            System.out.print(ARR[i] + "\t");
        }
        System.out.println(" ");

        System.out.println("\nвторой вариант с обратным подсчетом");
        for (int i = 0; i < ARR.length; i++) {
            int b = ARR.length - 1 - i;

            System.out.print(ARR[b] + "\t");
        }
    }

    private static void secondVariant() {
        int arrLength = getCountOfOdd();
        int[] ARR = new int[arrLength];

        int j = 0;
        for (int i = 0; i <= A; i++) {
            if (i % 2 != 0) {
                ARR[j] = i;
                j++;
            }
        }
        System.out.println(Arrays.toString(ARR));

    }

    private static int getCountOfOdd() {
        int count;
        count = Problems2_1.A / 2 + 1;

        return count;
    }
}
