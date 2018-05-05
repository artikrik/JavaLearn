package com.company.w3;

import java.util.Arrays;
import java.util.Random;

public class OverLoadLinearSearch {
    public static void main(String[] args) {
        String findWord = "Porshe";
        String[] massWord= {"Skoda", "Opel", "Lada", "Daewoo", "Suzuki", "Honda", "Mazda", "BWV", "Citroen", "Porshe", "Mustang"};
        System.out.println(Arrays.toString( massWord));
        System.out.println("Searching element "+linearSearch( massWord, findWord));

        int num=83;
        int[] massNum=new int[20];
        Random random = new Random(8);
        for (int i = 0; i <massNum.length ; i++) {
            massNum[i]=random.nextInt(100);
        }
        System.out.println("Searching element "+linearSearch(massNum, num));

    }

    static String linearSearch(String[] mass, String key){
        for (int i = 0; i <mass.length ; i++) {
            if (mass[i].equals(key)) return  "is present at the index "+i;
        }
        return "is absent in the array";
    }

    static String linearSearch( int[] mass, int num){

        System.out.println(Arrays.toString(mass));
        for (int i = 0; i <mass.length ; i++) {
            if (mass[i]==num) return "is present at the index "+i;
        }
        return "is absent in the array";
    }
}
