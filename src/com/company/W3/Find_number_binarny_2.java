package com.company.W3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Find_number_binarny_2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] mas = new int[30];
        Scanner scan = new Scanner(System.in);
        System.out.println("введіть число від 1 до 30 для пошуку в масиві");
        int a = scan.nextInt();
        int i;
        int index = 0;
        for (i = 0; i < mas.length; i++) {
            mas[i] = r.nextInt(30);
            System.out.print(mas[i] + " ");
        }
        System.out.println(" ");
        System.out.println("відсортований масив:");
        Arrays.sort(mas);// відсортовуємо, так як бінарний пошук можна використовувати тільки для відсортованих масивів
        for (i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        int first = 0;
        int last = mas.length-1;
        while (first<=last) {
            int middle = (first + last) / 2;
            if (mas[middle] == a) {
                index = middle;
                break;
            }
            else if (a < mas[middle]) {
                last = middle - 1;
            }
            else {
                first=middle+1;
            }
        }
        if (index > 0) {
            System.out.println(" ");
            System.out.println("індекс шуканого числа =" + index);
        } else if (index == 0) {
            System.out.println(" ");
            System.out.println("такого числа нема");
        }
    }
}
