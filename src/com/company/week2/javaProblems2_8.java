package com.company.week2;

import java.util.Arrays;
import java.util.Random;

public class javaProblems2_8 {
    public static void main(String[] args) {
        int [] arr = new int[11];
        boolean flag = true;
        Random r = new Random();
        int b = 0, c = 1, ctmp = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(3) - 1;
        }
        Arrays.sort(arr);
        int a = arr[0];
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == a)
                c++;
            else {
                c = 1;
                a = arr[i];
            }
            if (c > ctmp) {
                ctmp = c;
                b = a;
                flag = true;
            }
            else if (c == ctmp)
                flag = false;
        }
        if (flag)
            System.out.println("element " + b + " meets " + ctmp + " times");
    }
}
