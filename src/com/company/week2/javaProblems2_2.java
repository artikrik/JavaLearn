package com.company.week2;

import java.util.Random;

public class javaProblems2_2 {
    public static void main(String[] args) {
        int [] arr2 = new int[15];
        int count = 0;
        Random r = new Random();
        System.out.println("Array with random digits from 0 to 9: ");
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = r.nextInt(10);
            System.out.print(arr2[i] + " ");
            if (arr2[i] % 2 == 0)
                count++;
        }
        System.out.println();
        System.out.println("Quantity of even numbers in array: " + count);
    }
}
