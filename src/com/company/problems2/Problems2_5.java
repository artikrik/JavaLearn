package com.company.problems2;

import java.util.Arrays;

/*
Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
*/
public class Problems2_5 {
    private static final int[] ARRAY = new int[20];

    public static void main(String[] args) {
        ARRAY[1] = 1 ;
        ARRAY[0] = 1 ;
        int sum;
        for (int i=2; i<ARRAY.length; i++){
            sum=ARRAY[i-1]+ARRAY[i-2];
            ARRAY[i]=sum;
        }
        System.out.println("ARR lenght = " + ARRAY.length + "\nArray:  " + Arrays.toString(ARRAY));

    }
}
