package com.company.week2;

import java.util.Random;

public class javaProblems2_4 {
    public static void main(String[] args) {
        int [] a4, b4;
        a4 = b4 = new int[5];
        float average1, average2;
        average1 = average2 = 0f;
        Random r = new Random();
        for (int i = 0; i < a4.length; i++){
            a4[i] = r.nextInt(6);
            System.out.print(a4[i] + " ");
            average1 += a4[i];
        }
        System.out.println();
        for (int i = 0; i < b4.length; i++){
            b4[i] = r.nextInt(6);
            System.out.print(b4[i] + " ");
            average2 += b4[i];
        }
        if ((average1/a4.length) == (average2/b4.length)){
            System.out.println("\nArithmetical average value in both arrays are equal");
        }
        else{
            if ((average1/a4.length) > (average2/b4.length))
                System.out.println("\nAverage1 is bigger than average2");
            else
                System.out.println("\nAverage2 is bigger than average1");
        }
    }
}
