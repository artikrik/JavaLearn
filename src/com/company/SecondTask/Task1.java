package com.company.SecondTask;

//Найти все натуральные числа, не превосходящие заданного N
//и делящиеся на каждую из своих цифр.

public class Task1 {
    public static void main(String[] args) {
        int n = 100;
        int i;
        for (i = 0; i <= n; i++) {
            int a = i;
            int b = i;
            if (i % 10 == 0) {
                continue;
            }
            while (b != 0) {
                if ((a % (b % 10)) == 0) {
                    b = b / 10;
                } else {
                    break;
                }
                if (b == 0) {
                    System.out.print(a + " ");
                }
            }
        }
    }
}
