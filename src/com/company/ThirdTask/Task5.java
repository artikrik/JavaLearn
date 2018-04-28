package com.company.ThirdTask;

//Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на
//экран. Напоминаем, что первый и второй члены последовательности
//равны единицам, а каждый следующий — сумме двух предыдущих.

public class Task5 {
    public static void main(String[] args) {
        int a[] = new int[20];
        for (int i = 0; i < a.length; i++){
            if (i < 2){
                a[i] = 1;
            } else {
                a[i] = a[i - 2] + a[i - 1];
            }
            System.out.print(a[i] + " ");
        }
    }

}
