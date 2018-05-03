package com.company.W1;

public class dz2 {
    public static void main(String[] args) {
        int n = 231, i;
        for (i = 1; i < n; i++) {
            int a = i;
            while (a > 0) {
                int b = a % 10;
                if (b == 0)
                    break;
                if (i % b != 0)
                    break;
                a /= 10;
            }
            if (a==0)
                System.out.print(i+" ");
        }
    }
}

