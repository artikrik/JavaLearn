package com.company.W2;

public class array5 {
    public static void main(String[] args) {
        int[] a = new int[20];
        int i;
        for (i = 0; i < a.length; i++) {
            if (i < 2) {
                a[i] = 1;
            } else {
                a[i] = a[i - 1] + a[i - 2];
            }
            System.out.print(a[i] + " ");
        }
    }
}

