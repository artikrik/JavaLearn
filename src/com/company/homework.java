package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class homework {

    //count by dividing int
    private static int digitsCount(int num) {
        int count = 0;

        if (num != 0) {
            do {
                num /= 10;
                count++;
            } while (num != 0);
        } else {
            count++;
        }
        return count;
    }

    //convert int to String
    private static String numberToString(int num) {
        return Integer.toString(num);
    }

    //count this
    private static int countFromCharArray(String x) {
        int count = 0;
        char[] ch = x.toCharArray();
        for (int i = 0; i < x.length(); i++) {
            if (Character.isDigit(ch[i]) && ch[i] > 0) {
                count++;
            }
        }
        return count;
    }

    //count by String length
    private static int countFromString(String x) {
        int count;
        String regex = "\\d+";
        boolean checkForNegative = x.matches(regex);
        if (checkForNegative) {
            count = x.length();
        } else {
            count = x.length() - 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Insert int number... \n");

        int number = 0;
        try (Scanner kbd = new Scanner(System.in)) {
            number = kbd.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("The number should be integer." + e);
        }

        System.out.println("First solution - count by dividing int:");
        System.out.println("Total count: " + digitsCount(number));
        System.out.println("Second solution - count by convert int to String:");
        System.out.println("Total count: " + countFromCharArray(numberToString(number)));
        System.out.println("Third solution - count by String light");
        System.out.println("Total count: " + countFromString(numberToString(number)));

    }
}