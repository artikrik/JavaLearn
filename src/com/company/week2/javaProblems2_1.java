package com.company.week2;

public class javaProblems2_1 {
    public static void main(String[] args) {
        int n = 0;
        int [] arr = new int[50];
        System.out.println("Odd numbers in ascending order: ");
        for (int i = 1; i < 100; i += 2) {
            arr[n] = i;
            System.out.print(arr[n++] + " ");
        }
        System.out.println("\nOdd numbers in descending order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
