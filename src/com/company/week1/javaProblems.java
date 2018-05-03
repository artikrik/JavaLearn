package com.company.week1;

import java.util.Scanner;

public class javaProblems {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = scan.nextInt();
        for (int i = 1; i <= number; i++) {
            int n = i, digit;
            while (n > 0) {
                digit = n % 10;
                if ((digit == 0) || ((i % digit) != 0))
                    n=-10;
                n /= 10;
            }
            if (n == 0)
                System.out.println(i);
        }
    }
}