package com.company.W3;

import java.util.Random;
import java.util.Scanner;

public class Find_number_1 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] mas = new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("введіть число від 1 до 20 для пошуку в масиві");
        int a = scan.nextInt();
        int i;
        int index=-1;
        for (i = 0; i < mas.length; i++) {
            mas[i] = r.nextInt(12);
            System.out.print(mas[i]+" ");
        }
        for (i = 0; i < mas.length; i++)
            if (mas[i]==a) {
                a = mas[i];
                index = i;
            }
        if (index>=0) {
            System.out.println(" ");
            System.out.println("індекс шуканого числа=" + index);
        }
        else {
            System.out.println(" ");
            System.out.println("такого числа нема");
        }
    }
}
