package com.company.w2;

import java.util.Arrays;

/*
Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой элемент является в этом массиве
максимальным и сообщите индекс его последнего вхождения в массив.
*/

public class Problems2_6 {
    private static final int[] ARRAY = new int[12];

    public static void main(String[] args) {
        int max = 0;
        int min = 0;
        int maxPos = 0;
        int minPos = 0;

        for (int i = 0; i < ARRAY.length; i++) {
            ARRAY[i] = (int) (15 - Math.random() * 30);
        }

        System.out.println("ARR lenght = " + ARRAY.length + "\nArray:  " + Arrays.toString(ARRAY));

        for (int i = 0; i < ARRAY.length; i++) {
            if (max <= ARRAY[i]) {
                max = ARRAY[i];
                maxPos = i;
            } else if (min >= ARRAY[i]) {
                min = ARRAY[i];
                minPos = i;
            }
        }
        System.out.println("индекс max последнего вхождения в массив [" + maxPos + "]  Значение: " + max);
        System.out.println("индекс min последнего вхождения в массив [" + minPos + "]  Значение: " + min);

    }
}
