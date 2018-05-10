package com.company.W2;

import java.util.Random;

public class array10 {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] A = new int[10][5];
        int i;
        int j;
        int[] mas = new int[A.length];
        int min;
        for (i = 0; i < A.length; i++) {
            for (j = 0; j < A[i].length; j++) {
                A[i][j] = r.nextInt(10);
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        mas = new int[A.length];
        for (i = 0; i < A.length; i++) {
            int max = 0;  // Можно обойтись без нее
            for (j = 0; j < A[i].length; j++) {
                if (A[i][j] > max) {
                    max = A[i][j];
                }
            }
            mas[i] = max;
            System.out.println("максимальне число в рядку=" + max);
        }
        min = mas[0];
        for (i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        System.out.println("найменше серед максимальних чисел=" + min);
    }
}

