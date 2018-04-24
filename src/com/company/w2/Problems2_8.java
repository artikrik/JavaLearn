package com.company.w2;

import java.util.Arrays;
import java.util.Random;

/*
Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку. Определите какой
элемент встречается в массиве чаще всего и выведите об этом сообщение на экран. Если два каких-то элемента
встречаются одинаковое количество раз, то не выводите ничего.*/
public class Problems2_8 {
    private static final int LENGTH = 11;
    private static final int[] ARRAY = new int[LENGTH];

    public static void main(String[] args) {
        //Random
        int a, b, c;
        a = b = c = 0;
        for (int i = 0; i < LENGTH; i++) {
            Random random = new Random();
            int num = 1 - random.nextInt(3);
            ARRAY[i] = num;
            if (num>0){
                a++;
            } else if (num<0) {
                c++;
            } else {
                b++;
            }
        }
        System.out.println("FIRST_ARRAY lenght = " + LENGTH + "\n\nArray:  " + Arrays.toString(ARRAY) + "\n");
        if (a>b && a>c){
            System.out.println("1 >> элемент встречается в массиве чаще всего");
        } else if (b>a && b>c) {
            System.out.println("0 >> элемент встречается в массиве чаще всего");
        } else System.out.println("-1 >> элемент встречается в массиве чаще всего");
    }
}
