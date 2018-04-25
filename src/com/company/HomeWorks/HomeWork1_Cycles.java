package com.company.HomeWorks;
//программа для подсчёта количества символов в цифре

public class HomeWork1_Cycles {
    public static void main(String[] args) {

        //первый вариант
        /*
        int a = 1234567890;
        int b = 0;
        for( ; a!=0; a/=10)
            ++b;
        System.out.println(b);
        */


        //второй вариант
        /*
        int a = 1234;

        if ((a % 10) == a) { System.out.println("1");
        } else if ((a % 100) == a) System.out.println("2");
            else if ((a % 1000) == a) System.out.println("3");
                else if ((a % 10000) == a) System.out.println("4");
                    else if ((a % 10000) == a) System.out.println("5");

         */


        //третий вариант
        /*
        int a = 1234;
        if (a < 10) {
            System.out.println("1");
        } else if (a < 100) {
            System.out.println("2");
        } else if (a < 1000) {
            System.out.println("3");
        } else if (a < 10000) {
            System.out.println("4")
        }
        */

        //четвёртый вариант
        /*
        int a = 1234567;
        System.out.println("Символов: " + String.valueOf(a).length());
        */

    }
}
