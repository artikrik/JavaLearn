package com.company.w3;

import java.util.*;

/*
1. Числа
    3.1 линейный поиск
 */

public class Problem3_1 {
    public static void main(String[] args) {
        int counter, arrayLength, numberToFound, array[];

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        arrayLength = input.nextInt();

        array = new int[arrayLength];
        randomizeArray(array,10);
        System.out.println(Arrays.toString(array));

        System.out.println("Введите число, которое надо найти: ");
        numberToFound = input.nextInt();

        for (counter = 0; counter < arrayLength; counter++) {
            if (array[counter] == numberToFound) {
                System.out.println(numberToFound + " является " + (counter + 1) + " по счету в массиве");
                break;
            }
        }
        if (counter == arrayLength) {
            System.out.println("Число " + numberToFound + " не найдено в массиве");
        }
    }

    static void randomizeArray(int[] a,int randBound) {
        for (int i = 0; i < a.length; i++) {
            Random random = new Random();
            int num = random.nextInt(randBound);
            a[i] = num;
        }
    }
}