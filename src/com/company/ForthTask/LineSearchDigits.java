package com.company.ForthTask;

import java.util.Random;
import java.util.Arrays;

//линейный поиск числа

public class LineSearchDigits {
    public static void main(String[] args) {
        int searchNumber = 9;
        int[] mass = new int[10];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(15);
        }
        System.out.println("Искомое число " + searchNumber + "\n" + lineSearch(mass, searchNumber));
    }

    static String lineSearch(int[] mass, int num) {
        System.out.println(Arrays.toString(mass));
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == num)
                return "Находится в массиве по индексу: " + i;
        }
        return "Такого числа нет в массиве";
    }
}
