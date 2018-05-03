package com.company.W2;

import java.util.Random;

public class array10 {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] A = new int[10][5];
        int i;
        int j;
        int min = 10;
        for (i = 0; i < A.length; i++) {
            for (j = 0; j < A[i].length; j++) {
                A[i][j] = r.nextInt(10);
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        for (i = 0; i < A.length; i++) {
            int max = 0;

            for (j = 0; j< A[i].length; j++) {
                if (A[i][j] > max) {
                    max = A[i][j];
                }
            }
            System.out.println("максимальне число в рядку=" + max);
            if (min > max) {
                min = max;
            }
        }
        System.out.println("найменше серед максимальних чисел=" + min);
    }
}

