package com.company.w3;

import java.util.Arrays;
import java.util.Random;

public class BubleSortNum {
    public static void main(String[] args) {

        int[] mass = new int[20];
        Random random = new Random(50);
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(mass));
        bubleSearch(mass);
        System.out.println(Arrays.toString(mass));
    }


     static int[] bubleSearch(int[] mass) {
        for (int i = mass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mass[j] > mass[j + 1]) {
                    int tmp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = tmp;
                }
            }
        }
        return mass;
    }

    public static class linearSearchNum {
        public static void main(String[] args) {
            int num=83;
            int[] mass=new int[20];
            Random random = new Random(8);
            for (int i = 0; i <mass.length ; i++) {
                mass[i]=random.nextInt(100);
            }
            System.out.println("Searching element "+linSearch(mass, num));
        }

        static String linSearch( int[] mass, int num){

            System.out.println(Arrays.toString(mass));
            for (int i = 0; i <mass.length ; i++) {
                if (mass[i]==num) return "is present at the index "+i;
            }
            return "is absent in the array";
        }
    }
}
