package com.company;

public class array1 {
    public static void main(String[] args) {
        int a[] = new int[100];

        for (int i = 0; i < a.length - 1; i++) {
            if (i % 2 == 1)
                System.out.print(" " + i);
        }
        System.out.println();

        for (int i = a.length - 1; i > -1; i--) {
            if (i % 2 == 1)
                System.out.print(" " + i);
        }
    }
}
