package com.company.week3;

import java.util.Arrays;
import java.util.Random;

public class binarySearchDigits {
    public static void main(String[] args) {
        int findMe = 5;
        boolean foundIt = false;
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int i = 0;
        int start = 0, end = arr.length - 1;
        while ((!foundIt) && ((end - start) > 1)) {
            int mid = (start + end) / 2;
            if ((arr[start] == findMe) || (arr[end] == findMe) || arr[mid] == findMe) {
                foundIt = true;
            }
            else if (findMe < (arr[mid])) {
                end = mid;
            }
            else {
                start = mid;
            }
            i++;
        }
        if (foundIt) {
            System.out.println("Found " + findMe + " with iterations = " + i);
        }
        else {
            System.out.println("Not found " + findMe + " with iterations = " + i);
        }
    }
}