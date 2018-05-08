package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] str = new String[]{"some", "random", "words", "needs", "to", "be", "here"};
        System.out.println(Arrays.toString(str));
        String word = "herer";
        boolean states;

        states = komporator(str, word);

        if (states) {
            System.out.println(" word is present ");
        } else
            System.out.println(" word can not be found. Try again ");
    }

    static boolean komporator(String[] str, String word) {

        boolean states = false;
        for (int i = 0; i < str.length; i++) {
            if (word.equals(str[i])) {
                states = true;
            }
        }
        return states;
    }
}