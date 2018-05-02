package com.company.w2;

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {

    int[] mass1 = new int[10];
    int[] mass2 = new int[10];
    double[] massFloat = new double[10];
    Random random = new Random(7);

        for (int i = 0; i < mass1.length; i++) {
        mass1[i] = random.nextInt(10) + 1;
    }
        for (int j = 0; j < mass1.length; j++) {
        mass2[j] = random.nextInt(9) + 1;
    }
        for (int k = 0; k < massFloat.length; k++) {
        massFloat[k] =(double)mass1[k] / (double) mass2[k];
    }
        System.out.println(Arrays.toString(mass1));
        System.out.println(Arrays.toString(mass2));
        System.out.println(Arrays.toString(massFloat));

    int number = 0;
        for (int k = 0; k < massFloat.length; k++) {
        if (massFloat[k]%(int)(massFloat[k]) == 0) {
            number++;
        }
    }
        System.out.print("whole numbers in array 3 = " + number);
}
}
