package com.company.W2;

import java.util.Random;

public class array2 {

    public static void main(String[] args) {
        Random x = new Random();
        int[] r = new int[15];
        int n = 0;
        int i = 0;
        for (i = 0; i < r.length; i++) {
            r[i] = x.nextInt(10);
            System.out.print(r[i] + " ");
            if (r[i]>=0 & r[i]%2==0)
                n+=1;
        }
        System.out.println(" ");
        System.out.println("кількість парних="+n);
    }
}



