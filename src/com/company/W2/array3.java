package com.company.W2;

import java.util.Random;

public class array3 {

    public static void main(String[] args) {
        int i;
        Random r = new Random();
        int[] x = new int[8];
        for (i = 0; i < 8; i++) {
            x[i] = 1+r.nextInt(10);
            System.out.print(x[i] + " ");
        }
        System.out.println(" ");
        for (i=0;i<x.length;i++) {
            if (i % 2 == 1) {
                x[i] = 0;
            }
            System.out.print(x[i]+" ");
        }
    }
}
