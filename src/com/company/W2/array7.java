package com.company.W2;

import java.util.Random;

public class array7 {
    public static void main(String[] args) {
        int[] x = new int[10];
        int[] y = new int[10];
        double[] q = new double[10];
        Random r = new Random();
        int i;
        for (i = 0; i < x.length; i++) {
            x[i] = r.nextInt(9) + 1;
            System.out.print(x[i] + " ");
        }
        System.out.println(" ");
        for (i = 0; i < y.length; i++) {
            y[i] = r.nextInt(9) + 1;
            System.out.print(y[i] + " ");
        }
        System.out.println(" ");
        for (i = 0; i < q.length; i++) {
            q[i] = (double) x[i] / y[i];
            System.out.print(q[i] + " ");
        }
        int c = 0;
        for (i = 0; i < q.length; i++) {
            if (q[i] % 1 == 0)
                c++;
        }
        System.out.println(" ");
        System.out.println("количество целых элементов в третьем массиве=" + c);
    }

}
