package com.company.week2;

import java.util.Random;

public class javaProblems2_3 {
    public static void main(String[] args) {
        int [] arr3 = new int[8];
        Random r = new Random();
        for (int i = 0; i < arr3.length; i++){
            arr3[i] = r.nextInt(10) + 1;
            System.out.print(arr3[i] + " ");
        }
        System.out.println("\nModified array where elements with odd indexes were changed to 0:");
        for (int i = 0; i < arr3.length; i++){
            if ((i % 2) == 1)
                arr3[i] = 0;
            System.out.print(arr3[i] + " ");
        }
    }
}
