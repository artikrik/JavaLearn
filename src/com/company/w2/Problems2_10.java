package com.company.w2;

import java.util.Random;

/*
В массиве А размером 10х5 определить самые большие значения в каждой строке и среди них – наименьшее знаение.
*/
public class Problems2_10 {
    private static final int[][] A = new int[10][5];

    public static void main(String[] args) {
        int max;
        int min;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                Random random = new Random();
                int num = random.nextInt(50);
                A[i][j] = num;
            }
        }

        for (int i = 0; i < A.length; i++) {
            max = A[i][0];
            min = A[i][0];
            for (int j = 0; j < A[i].length; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
                if (min >= A[i][j]) {
                    min = A[i][j];
                }
                System.out.print(A[i][j] + "\t");
            }

            System.out.println("max: " + max + " min: " + min);
            System.out.println();
        }
    }
}
