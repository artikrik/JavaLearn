package com.company.w2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Пользователь должен указать с клавиатуры чётное положительное число, а программа должна создать массив указанного
размера из случайных целых чисел из [-5; 5] и вывести его на экран в строку. После этого программа должна определить
и сообщить пользователю о том, сумма модулей какой половины массива больше: левой или правой, либо сообщить, что эти
суммы модулей равны. Если пользователь введёт неподходящее число, то программа должна требовать повторного ввода до
тех пор, пока не будет указано корректное значение.
*/
public class Problems2_9 {

    private static int scanKeyboard() {

        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Пользователь должен указать с клавиатуры чётное положительное число \n");
            while (!sc.hasNextInt()) {
                System.out.println("Это не число!");
                sc.next();
            }
            number = sc.nextInt();
        } while (number <= 0);

        do {
            if (number % 2 == 0) {
                break;
            } else {
                System.out.println("Это не четное число!");
                number = sc.nextInt();
            }
        } while (number % 2 != 0);

        return number;
    }

    private static void arrayBig(int[] a) {
        int tmp1 = 0, tmp2 = 0;
        for (int i = 0; i < a.length / 2; i++) {
            tmp1 = a[i] + tmp1;
        }
        for (int i = a.length / 2; i < a.length; i++) {
            tmp2 = a[i] + tmp2;
        }
        System.out.println("сумма модулей левой половины массива: " + tmp1);
        System.out.println("сумма модулей правой половины массива: " + tmp2);
        if (tmp1 > tmp2) {
            System.out.println("сумма модулей какой половины массива больше: левой");
        } else if (tmp2 > tmp1) {
            System.out.println("сумма модулей какой половины массива больше: правой");
        } else {
            System.out.println("сумма модулей какой половины массива больше: равны");
        }
    }

    public static void main(String[] args) {

        int inputNumber = scanKeyboard();

        int[] ARRAY = new int[inputNumber];
        for (int i = 0; i < ARRAY.length; i++) {
            Random random = new Random();
            int num = 5 - random.nextInt(10);
            ARRAY[i] = num;
        }

        System.out.println("FIRST_ARRAY length = " + ARRAY.length + "\n\nArray:  " + Arrays.toString(ARRAY) + "\n");
        arrayBig(ARRAY);

    }
}
