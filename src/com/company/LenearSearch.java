package com.company;

import java.util.Scanner;

public class LenearSearch {
    public static void main(String args[]) {
        int i, num, item, array[];
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        num = input.nextInt();


        array = new int[num];

        System.out.println("Введите " + num + " чисел");


        for (i = 0; i < num; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Введите число, которое надо найти: ");
        item = input.nextInt();

        for (i = 0; i < num; i++) {
            if (array[i] == item) {
                System.out.println(item + " является " + (i+1) + " по счету в массиве");
                break;
            }
        }
        if (i == num) {
            System.out.println("Число " + item + " не найдено в массиве");
        }
    }
}