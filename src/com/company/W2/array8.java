package com.company.W2;

import java.util.Random;

public class array8 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] x = new int[11];
        int i;
        int k = 0;
        int h = 0;
        int m = 0;
        for (i = 0; i < x.length; i++) {
            x[i] = r.nextInt(3) - 1;
            System.out.print(x[i] + " ");
        }
        for (i = 0; i < x.length; i++) {
            if (x[i] == 0)
                k++;
            else if (x[i] == -1)
                h++;
            else m++;
        }
        System.out.println(" ");
        System.out.println("(вивожу для себе для перевірки результата кількість 0) k="+k);
        System.out.println("(вивожу для себе кількість -1) h="+h);
        System.out.println("(вивожу для себе кількість 1) m="+m);
        if ((k>h) &&(k>m)) {
            System.out.println(0);
        }
        else if ((h>m) &&(h>k)) {
            System.out.println(-1);
        }
        else if ((m>h) &&(m>k)) {
            System.out.println(1);
        }

    }
}
