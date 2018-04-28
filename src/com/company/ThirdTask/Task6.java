package com.company.ThirdTask;

//Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
//Определите какой элемент является в этом массиве максимальным и
//сообщите индекс его последнего вхождения в массив.

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int a[] = new int[12];
        int max = 0, indexMax = 0;
        Random random = new Random();

        for (int i = 0; i < a.length; i++){
            a[i] = (int) (Math.round(Math.random() * 30 - 15));
            System.out.print(a[i] + " ");

            if (i == 0){
                max = a[i];
                indexMax = i;
            }
            if (i >= 1 && a[i] > max)
                max = a[i];
                indexMax = i;
        }
        System.out.println();
        System.out.println("Максимальный элемент массива: " + max + ", а его индекс: " + indexMax);
    }

}
