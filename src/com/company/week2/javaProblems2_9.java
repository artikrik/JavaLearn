package com.company.week2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class javaProblems2_9 {
    public static void main(String[] args) {
        int input, sum2 = 0, sum1 = 0;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Please enter positive even number");
            input = s.nextInt();
        }
        while (((input % 2) != 0 ) || (input <= 0));
        int [] randomArray = new int[input];
        Random r = new Random();
        for (int i = 0; i < input; i++) {
            randomArray[i] = r.nextInt(11) - 5;
            sum2 += Math.abs(randomArray[i]);
        }
        System.out.println(Arrays.toString(randomArray));
        for (int i = 0; i < input/2; i++){
            sum1 += Math.abs(randomArray[i]);
        }
        sum2 -= sum1;
        if (sum1 > sum2)
            System.out.println("Summ of absolute values of 1st half is bigger");
        else
            if (sum1 < sum2)
                System.out.println("Summ of absolute values of 2nd half is bigger");
            else
                System.out.println("Summs of absolute values of both halfs are equal");
    }
}
