package com.company.week3;

import java.util.Arrays;
import java.util.Random;

public class linearSearchDigits {
    public static void main(String[] args) {
        int findMe = 5;
        int position = -1;
        int [] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        int i = 0;
        while ((i < arr.length) && (position == -1)) {
            if (arr[i] == findMe) {
                position = i;
            }
            i++;
        }
        if (position > -1)
            System.out.println("We found number " + findMe + " in position " + position);
        else
            System.out.println("There's no " + findMe + " in array");
    }
}
