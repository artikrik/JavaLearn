package com.company.w2;

/*
Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).*/

import java.util.Random;

public class Problems2_4 {
    private static final int[] FIRST_ARRAY = new int[5];
    private static final int[] SECOND_ARRAY = new int[5];

    private static int calcAverageNum(int[] a) {
        int sum = 0;
        for (int elA :
                a) {
            sum = elA + sum;
        }
        return sum/a.length;
    }

    public static void main(String[] args) {
        for (int i = 0; i < FIRST_ARRAY.length; i++) {
            Random random = new Random();
            int num = 1 + random.nextInt(10);
            FIRST_ARRAY[i] = num;
            System.out.print("  " + FIRST_ARRAY[i] + "  ");
        }
        System.out.println("\n");

        for (int i = 0; i < SECOND_ARRAY.length; i++) {
            Random random = new Random();
            int num = 1 + random.nextInt(10);
            SECOND_ARRAY[i] = num;
            System.out.print("  " + SECOND_ARRAY[i] + "  ");
        }
        System.out.println("\n");
        System.out.println("FIRST_ARRAY " + calcAverageNum(FIRST_ARRAY));
        System.out.println("SECOND_ARRAY " + calcAverageNum(SECOND_ARRAY));
        System.out.println("\n");

        if (calcAverageNum(FIRST_ARRAY) > calcAverageNum(SECOND_ARRAY)) {
            System.out.println("FIRST_ARRAY " + calcAverageNum(FIRST_ARRAY));
        } else if (calcAverageNum(FIRST_ARRAY) < calcAverageNum(SECOND_ARRAY)) {
            System.out.println("SECOND_ARRAY " + calcAverageNum(SECOND_ARRAY));
        } else {
            System.out.println("Numbers are equals");
        }
    }
}
