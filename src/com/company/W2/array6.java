package com.company.W2;

import java.util.Random;

public class array6 {
    public static void main(String[] args) {
        Random r = new Random();

        int max=-15;
        int index=0;
        int[] x = new int[12];
        for (int i = 0; i < x.length; i++) {
            x[i] = r.nextInt(31) - 15;
            System.out.print(x[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i<x.length;i++)
            if (x[i]>=max) {
                max = x[i];
                index=i;
            }
        System.out.println("індекс останнього входження максимального числа ="+index);
        System.out.println("максимальне число="+max);
    }
}

