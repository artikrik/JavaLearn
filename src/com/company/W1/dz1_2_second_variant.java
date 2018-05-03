package com.company.W1;

public class dz1_2_second_variant {
    public static void main(String[] args) {
        int x=112345;
        int a=0;
        if (x<10)
            a=1;
        else if (x<100)
            a=2;
        else if (x<1000)
            a=3;
        else if (x<10000)
            a=4;
        else if (x<100000)
            a=5;
        else if (x<1000000)
            a=6;
        else if (x<10000000)
            a=7;
        else if (x<100000000)
            a=8;
        else if (x<100000000)
            a=9;
        System.out.println(a);
    }
}