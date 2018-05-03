package com.company.week2;

import java.util.Random;

public class javaProblems2_6 {
    public static void main(String[] args) {
        int [] arr = new int[12];
        int index = 0, max = arr[0];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(31)-15;
            if (arr[i] >= max) {
                max = arr[i];
                index = i;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nMaximum element = " + max + " and it's last index is: " + index);
    }
}
