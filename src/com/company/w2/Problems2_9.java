package com.company.w2;

import java.util.Arrays;
import java.util.InputMismatchException;
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

    private static boolean isPositive(int a) {
        return a >= 0;
    }

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
        } while (!isPositive(number));
        return number;
    }


    public static void main(String[] args) {

        int inputNumber = scanKeyboard();
        System.out.println(inputNumber);

        /*int[] ARRAY = new int[number];
        for (int i = 0; i < ARRAY.length; i++) {
            Random random = new Random();
            int num = 5 - random.nextInt(10);
            ARRAY[i] = num;
        }

        System.out.println("FIRST_ARRAY lenght = " + ARRAY.length + "\n\nArray:  " + Arrays.toString(ARRAY) + "\n");*/
    }
}
