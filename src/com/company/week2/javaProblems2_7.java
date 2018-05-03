package com.company.week2;

import java.util.Arrays;
import java.util.Random;

public class javaProblems2_7 {
    public static void main(String[] args) {
        int quantity = 0, length = 10;
        int [] mas1 = new int[length];
        int [] mas2 = new int[length];
        double [] mas3 = new double[length];
        Random r = new Random();
        for (int i = 0; i < length; i++){
            mas1[i] = r.nextInt(9) + 1;
            mas2[i] = r.nextInt(9) + 1;
            mas3[i] = (double) mas1[i] / mas2[i];
            if ((mas1[i] % mas2[i]) == 0)
                quantity++;
        }
        System.out.println(Arrays.toString(mas1));
        System.out.println(Arrays.toString(mas2));
        System.out.println(Arrays.toString(mas3));
        System.out.println("Quantity of integer values from array 3: " + quantity);
    }
}
