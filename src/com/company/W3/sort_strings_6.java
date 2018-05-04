package com.company.W3;

import java.util.Arrays;

public class sort_strings_6 {
    public static void main(String[] args) {

        String[] mas = {"море", "чайка", "пісок", "пляж", "риба", "А"};
        int i; int j;
        int index=-1;
        for (i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Відсортований масив:");
        for(i = mas.length-1 ; i > 0 ; i--){
            for(j = 0 ; j < i ; j++){
                if (mas[j].compareTo(mas[j+1]) > 0 ){
                    String tmp = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = tmp;
                }
            }
        }
        System.out.print(Arrays.toString(mas));
    }
}
