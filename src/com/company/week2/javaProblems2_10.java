package com.company.week2;

import java.util.Arrays;
import java.util.Random;

public class javaProblems2_10 {
    public static void main(String[] args) {
        int min = 0;
        int [] [] array = new int [10] [5];
        Random r = new Random();
        for (int i = 0; i <array.length; i++ ){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = r.nextInt(100);
            }
            System.out.println(Arrays.toString(array[i]));
        }
        for (int i = 0; i <array.length; i++ ){
            int max = 0;
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            if ((max <= min) || (min == 0))
                min = max;
        }
        System.out.println("Minimum value from maximum in rows = " + min);
    }
}
