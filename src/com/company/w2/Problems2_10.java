package com.company.w2;

import java.util.Random;

/*
В массиве А размером 10х5 определить самые большие значения в каждой строке и среди них – наименьшее знаение.
*/
public class Problems2_10 {
    private static final int[][] A = new int[10][5];

    public static void main(String[] args) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                Random random = new Random();
                int num = random.nextInt(10);
                A[i][j] = num;
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
