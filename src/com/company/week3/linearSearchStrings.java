package com.company.week3;

import java.util.Arrays;
import java.util.Random;

public class linearSearchStrings {
    public static void main(String[] args) {
        String findMe = "v";
        String [] arr = new String[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            String word = "";
            int wordLength = r.nextInt(5) + 1;
            for (int j = 0; j < wordLength; j++) {
                word += (char)(r.nextInt(26) + 97);
            }
            arr[i] = word;
        }
        System.out.println(Arrays.toString(arr));
        boolean fountIt = false;
        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals(findMe)) {
                fountIt = true;
            }
        }
        if (fountIt)
            System.out.println("We found string " + findMe);
        else
            System.out.println("There's no " + findMe + " in array");
    }
}