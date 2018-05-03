package com.company.W2;

import java.util.Random;

public class array4 {
    public static void main(String[] args) {
        int[] x = new int[5];
        int[] y = new int[5];
        Random r = new Random();
        int i, j;
        double sum1 = 0;
        double sum2 = 0;
        double average1 = 0;
        double average2 = 0;
        for (i = 0; i < 5; i++) {
            x[i] = r.nextInt(6);
            System.out.print(x[i] + " ");
            sum1 += x[i];
        }
        average1 = sum1/5;
        System.out.println(" ");
        for (j = 0; j < 5; j++) {
            y[j] = r.nextInt(6);
            System.out.print(y[j] + " ");
            sum2 += y[j];
        }
        average2 = sum2/5;
        System.out.println(" ");
        if (average1 > average2)
            System.out.println("Середнє арифметичне число першого масива більше");
        else if (average1 < average2)
            System.out.println("Середнє арифметичне число першого масива менше");
        else if (average1 == average2)
            System.out.println("значення рівні");
    }
}


