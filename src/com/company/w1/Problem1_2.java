package com.company.w1;

/*
Найти все натуральные числа, не превосходящие заданного N и делящиеся на каждую из своих цифр.
 */

import java.util.Scanner;

public class Problem1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Пользователь должен указать с клавиатуры чётное положительное число \n");
        while (!sc.hasNextInt()) {
            System.out.println("Это не число!");
            sc.next();
        }
        number = sc.nextInt();
        divideNum(number);
    }

    private static void divideNum(int n) {
        int tmp;
        int lastNum;
        for (int a = 1; a < n; a++) {
            tmp = a;
            while (tmp != 0) {
                lastNum = (tmp % 10);
                if (lastNum != 0)
                    if (a % lastNum != 0)
                        break;
                tmp /= 10;
            }
            if (tmp == 0) System.out.println(a);
        }
    }


}
