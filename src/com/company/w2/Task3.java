package com.company.w2;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] mass = new int [8];
        Random random = new Random(7);
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(10)+1;
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + "; ");
        }
        for (int i = 1; i < mass.length; i=i+2){
            mass[i]=0;
        }
        System.out.println();
        System.out.println("Изменив масив");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + "; ");
        }
    }
}
