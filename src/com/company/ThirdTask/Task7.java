package com.company.ThirdTask;

//Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и
//третий массив из 10 действительных чисел. Каждый элемент с i-ым
//индексом третьего массива должен равняться отношению элемента из
//первого массива с i-ым индексом к элементу из второго массива с i-ым
//индексом. Вывести все три массива на экран (каждый на отдельной
//строке), затем вывести количество целых элементов в третьем массиве.

public class Task7 {
    public static void main(String[] args) {
        int counter = 0;
        int mas1[] = new int[10];
        int mas2[] = new int[10];
        double mas3[] = new double[10];
        for (int i = 0; i < 10; i++) {
            mas1[i] = (int) (Math.random() * 9 + 1);
            mas2[i] = (int) (Math.random() * 9 + 1);
            mas3[i] = Math.round(((double) mas1[i] / (double) mas2[i]) * 100.0) / 100.0;
            if (mas3[i] == (int) mas3[i])
                counter++;
        }
        for (int i = 0; i < 10; i++)
            System.out.print(mas1[i] + "\t");
        System.out.println();
        for (int i = 0; i < 10; i++)
            System.out.print(mas2[i] + "\t");
        System.out.println();
        for (int i = 0; i < 10; i++)
            System.out.print(mas3[i] + "\t");
        System.out.println("\n" + "Целых чисел в третьем масиве: " + counter);
    }
}

