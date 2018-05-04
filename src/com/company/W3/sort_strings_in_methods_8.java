package com.company.W3;

import java.util.Arrays;

public class sort_strings_in_methods_8 {
    public static void main(String[] args) {

        String[] mas = {"море", "чайка", "пісок", "пляж", "риба", "А"};
        int i;
        for (i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        sort(mas);
    }

    static void sort(String[] masiv) {
        int j;
        int k;
        System.out.println(" ");
        System.out.println("Відсортований масив:");
        for (k = masiv.length - 1; k > 0; k--) {
            for (j = 0; j < k; j++) {
                if (masiv[j].compareTo(masiv[j + 1]) > 0) {
                    String tmp = masiv[j];
                    masiv[j] = masiv[j + 1];
                    masiv[j + 1] = tmp;
                }
            }
        }
        System.out.print(Arrays.toString(masiv));
    }

}