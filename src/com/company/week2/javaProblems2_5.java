package com.company.week2;

public class javaProblems2_5 {
    public static void main(String[] args) {
        int [] arr = new int[20];
        arr[0] = arr[1] = 1;
        System.out.println("20 first elements of Fibonacci: ");
        System.out.print(arr[0] + " " + arr[1]);
        for (int i = 2; i < arr.length; i++){
            arr[i] = arr[i-1] + arr[i-2];
            System.out.print(" " + arr[i]);
        }
    }
}
