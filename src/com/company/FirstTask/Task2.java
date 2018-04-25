package com.company.FirstTask;

//второй вариант

public class Task2 {
    public static void main(String[] args) {
        int a = 1234;

        if ((a % 10) == a) {
            System.out.println("1");
        } else if ((a % 100) == a) System.out.println("2");
            else if ((a % 1000) == a) System.out.println("3");
                else if ((a % 10000) == a) System.out.println("4");
                    else if ((a % 10000) == a) System.out.println("5");
    }
}
