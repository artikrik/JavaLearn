package com.company.W3;

import java.util.Arrays;
import java.util.Random;

public class sort_number_3 {
    public static void main(String[] args) {
        int[] mas = new int[5];
        Random r=new Random();
        int i;
        int j;
        for (i = 0; i < mas.length; i++) {
            mas[i] = r.nextInt(20);
            System.out.print(mas[i] + " ");
        }
        System.out.println(" ");
        for(i = mas.length-1 ; i > 0 ; i--){
            for(j = 0 ; j < i ; j++){
                if( mas[j] > mas[j+1] ){
                    int tmp = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = tmp;
                }
            }
        }
        System.out.print(Arrays.toString(mas));

    }
}
