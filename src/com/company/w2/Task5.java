package com.company.w2;

public class Task5 {
    public static void main(String[] args) {
        int[] fibo = new int[20];

        for (int i = 0; i < fibo.length; i++) {
            if (i <=1 ) fibo[i] = 1;
            else fibo[i] = fibo[i - 2] + fibo[i - 1];
        }

        for (int i = 0; i < fibo.length; i++) {
            System.out.print(fibo[i] + "; ");
        }

    }
}
