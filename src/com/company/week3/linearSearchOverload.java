package com.company.week3;

import java.util.Arrays;
import java.util.Random;

public class linearSearchOverload {
    public static void main(String[] args) {
        int findDigit = 5, arrayLength = 10, randomValueBound = 10;

        // generate random array with int and find there findDigit;
        int [] arrayInt = generateRandomIntArray(arrayLength,randomValueBound);
        System.out.println(Arrays.toString(arrayInt));
        int position = doLinearSearch(arrayInt,findDigit);
        printResult(position,findDigit);

        String findString = "v";
        int wordLength = 5;
        //generate random array with strings and find there findString;
        String [] arrayString = generateRandomStringArray(arrayLength, wordLength);
        System.out.println(Arrays.toString(arrayString));
        position = doLinearSearch(arrayString, findString);
        printResult(position,findString);
    }

    public static int doLinearSearch (int [] arr, int findMe) {
        int i = 0, position = -1;
        while ((i < arr.length) && (position == -1)) {
            if (arr[i] == findMe) {
                position = i;
            }
            i++;
        }
        return position;
    }

    public static int doLinearSearch (String [] arr, String findMe) {
        int position = -1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals(findMe)) {
                position = i;
            }
        }
        return position;
    }

    public static int [] generateRandomIntArray (int arrayLength, int randomBound) {
        int [] arr = new int[arrayLength];
        Random r = new Random();
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = r.nextInt(randomBound);
        }
        return arr;
    }

    public static String [] generateRandomStringArray (int arrayLength, int wordMaxLength) {
        String [] arr = new String[arrayLength];
        Random r = new Random();
        for (int i = 0; i < arrayLength; i++) {
            String word = "";
            int wordLength = r.nextInt(wordMaxLength) + 1;
            for (int j = 0; j < wordLength; j++) {
                word += (char)(r.nextInt('z'-'a') + 'a');
            }
            arr[i] = word;
        }
        return arr;
    }

    public static void printResult (int position, int findDigit) {
        if (position > -1)
            System.out.println("We found number " + findDigit + " in position " + position);
        else
            System.out.println("There's no " + findDigit + " in array");
    }

    public static void printResult (int position, String findString) {
        if (position > -1)
            System.out.println("We found string: " + findString + " in position " + position);
        else
            System.out.println("There's no string: " + findString + " in strings array");
    }
}
