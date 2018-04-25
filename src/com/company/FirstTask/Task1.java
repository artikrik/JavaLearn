package com.company.FirstTask;

//программа для подсчёта количества символов в цифре
//первый вариант

public class Task1 {
    public static void main(String[] args) {

        int a = 123456790;
        int b = 0;
        for( ; a!=0; a/=10)
            ++b;
        System.out.println(b);
    }
}
