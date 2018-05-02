package com.company.w2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputValue = 0;
        do {
            System.out.println("Введите четное положительное число: ");
            inputValue = scan.nextInt();
        }
        while (inputValue % 2 != 0 || inputValue <= 0);
        int[] array = new int[inputValue];
        array = createMass(inputValue);
        sumOfHalfOfTheArrey(array);
    }

    static int[] createMass(int size) {
        Random random = new Random(0);
        int[] mass = new int[size];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(19) - 5;
        }
        System.out.println(Arrays.toString(mass));
        return mass;
    }

    static void sumOfHalfOfTheArrey(int[] mass) {
        int sumOneHalf = 0;
        int SumSecondHalf = 0;
        for (int i = 0; i < mass.length; i++) {
            if (i < mass.length / 2) sumOneHalf += Math.abs(mass[i]);
            else SumSecondHalf += Math.abs(mass[i]);
        }
        if (sumOneHalf > SumSecondHalf)
            System.out.println("сумма модулей 1 половины массива больше, чем 2 половины масива");
        else if (sumOneHalf < SumSecondHalf)
            System.out.println("сумма модулей 2 половины массива больше, чем 1 половины масива");
        else System.out.println("Cуммы модулей равны в масиве");

    }
}
