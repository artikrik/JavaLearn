package com.company.w2;

public class Task1{
    public static void main(String[] args) {
        int[] mass = new int[50];
        int odd = 1;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = odd;
            odd += 2;
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + "; ");
        }
        System.out.println();
        System.out.println("Обратный порядок чисел масива: ");
        for (int i = mass.length - 1; i > 0; i--) {
            System.out.print(mass[i] + "; ");
        }
    }
}