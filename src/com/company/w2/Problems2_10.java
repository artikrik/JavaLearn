package com.company.w2;

import java.util.Arrays;
import java.util.Random;

/*
В массиве А размером 10х5 определить самые большие значения в каждой строке и среди них – наименьшее знаение.
*/

public class Problems2_10 {
    private static final int[][] A = new int[10][5];

    public static void main(String[] args) {
        randomizeArray();

        int[] maxRowNumbs = new int[10];
        for (int i = 0; i < A.length; i++) {
            maxRowNumbs[i] = foundMaxNumberInArray(A[i]);
        }

        System.out.println(Arrays.toString(maxRowNumbs));
        System.out.println(foundMinNumberInArray(maxRowNumbs));

    }

    private static int foundMinNumberInArray(int[] a){
        int min = a[0];
        for (int anA : a) {
            if (min > anA) {
                min = anA;
            }
        }
        return min;
    }

    private static int foundMaxNumberInArray(int[] a) {
        int max = a[0];
        for (int anA : a) {
            if (max < anA) {
                max = anA;
            }
        }
        return max;
    }

    private static void randomizeArray() {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                Random random = new Random();
                int num = random.nextInt(25);
                A[i][j] = num;
            }
        }
    }
}
