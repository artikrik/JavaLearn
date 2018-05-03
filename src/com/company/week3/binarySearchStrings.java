package com.company.week3;

import java.util.Arrays;
import java.util.Random;

public class binarySearchStrings {
    public static void main(String[] args) {
        String findMe = "v";
        int stringsQuantity = 100, maxWordLength = 2;
        String [] arr = generateRandomStringArray(stringsQuantity, maxWordLength);
        System.out.println(Arrays.toString(arr));
        boolean result = doBinarySearch(findMe, arr);
        if (result) {
            System.out.println("Found " + findMe);
        }
        else {
            System.out.println("Not found " + findMe);
        }
    }

    public static boolean doBinarySearch (String findMe, String [] arr) {
        boolean foundIt = false;
        int i = 0;
        int start = 0, end = arr.length - 1;
        while ((!foundIt) && ((end - start) > 1)) {
            int mid = (start + end) / 2;
            if ((arr[start].equals(findMe)) || (arr[end].equals(findMe)) || arr[mid].equals(findMe)) {
                foundIt = true;
            }
            else if (findMe.compareTo(arr[mid]) < 0) {
                end = mid;
            }
            else {
                start = mid;
            }
        }
        return foundIt;
    }

    public static String [] generateRandomStringArray (int arrayLength, int wordMaxLength) {
        String [] arr = new String[arrayLength];
        Random r = new Random();
        for (int i = 0; i < arrayLength; i++) {
            String word = "";
            int wordLength = r.nextInt(wordMaxLength) + 1;
            for (int j = 0; j < wordLength; j++) {
                word += (char)(r.nextInt(26) + 97);
            }
            arr[i] = word;
        }
        return arr;
    }
}