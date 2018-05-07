package com.company.W3;

import java.util.Arrays;
import java.util.Random;

public class sort_number_and_String_overload_10 {

    public static void main(String[] args) {

        String[] mas = {"море", "чайка", "пісок", "пляж", "риба", "А"};
        int i;
        for (i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        sort(mas);
        System.out.println(" ");
        System.out.println("Відсортований масив:");
        System.out.print(Arrays.toString(mas));
        System.out.println(" ");

        int[] m = new int[5];
        Random r=new Random();
        for (i = 0; i < m.length; i++) {
            m[i] = r.nextInt(20);
            System.out.print(m[i] + " ");
        }
        System.out.println(" ");
        sort(m);
        System.out.println("Відсортований масив:");
        System.out.print(Arrays.toString(m));

    }

    static String[] sort(String[] masiv) {
        int j;
        int k;
        for (k = masiv.length - 1; k > 0; k--) {
            for (j = 0; j < k; j++) {
                if (masiv[j].compareTo(masiv[j + 1]) > 0) {
                    String tmp = masiv[j];
                    masiv[j] = masiv[j + 1];
                    masiv[j + 1] = tmp;
                }
            }
        }
        return masiv;
    }

    static int[] sort(int[] masiv) {

        for(int i = masiv.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( masiv[j] > masiv[j+1] ){
                    int tmp = masiv[j];
                    masiv[j] = masiv[j+1];
                    masiv[j+1] = tmp;
                }
            }
        }
        return masiv;
    }

}

