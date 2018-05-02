package com.company.w2;

import java.util.Arrays;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int[] mass = new int[12];
        Random random = new Random(29);
        for (int i = 0; i < mass.length; i++) {
            mass[i]= random.nextInt(31)-15;
        }
        System.out.println(Arrays.toString(mass));
        int maxValue=0;
        int index=0;
        for (int i = 0; i <mass.length ; i++) {
            if (mass[i]>=maxValue) {
                maxValue = mass[i];
                index=i;
            }
        }
        System.out.println();
        System.out.println("max value= "+maxValue);
        System.out.println();
        System.out.println("Index of max value= "+index);
    }
}
