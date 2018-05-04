package com.company.W2;

public class array1 {
    public static void main(String[] args) {
        int[] a = new int[50];
        for (int i = 0; i < a.length; i++) {
            a[i] = i * 2 + 1;
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        for (int i = a.length-1; i >=0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
