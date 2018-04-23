package com.company.problems2;

import java.util.Arrays;

/*
Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
порядке (99 97 95 93 … 7 5 3 1).
*/
public class Problems2_1 {

    private static final int A = 99;
    private static final int[] ARR = new int[A];

    public static void main(String[] args) {

        for (int i = 0; i < ARR.length; i++) {
            ARR[i] = (int) (Math.random() * (A-1) + 1);
        }
        // Просто глянем наш массив
        System.out.println(Arrays.toString(ARR));
        System.out.println("\nпо порядку");

        for (int i = 0; i < ARR.length; i++) {
            //по порядку
            System.out.println(i + "      =>   " + ARR[i]);
        }
        System.out.println("\nв обратном порядке");
        for (int i = ARR.length - 1; i > -1; i--) {
            //в обратном порядке
            System.out.println(i + "      =>   " + ARR[i]);
        }

        System.out.println("\nвторой варик с обратным подсчетом");
        //второй варик с обратным подсчетом
        for (int i = 0; i < ARR.length; i++) {

            //в обратке второй вариант
            int b = ARR.length - 1 - i;
            System.out.println(b + "      =>   " + ARR[b]);
        }

    }
}
