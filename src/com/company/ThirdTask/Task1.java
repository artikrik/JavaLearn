package com.company.ThirdTask;

//Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран
//в строку, а затем этот же массив выведите на экран тоже в строку, но в
//обратном порядке (99 97 95 93 … 7 5 3 1).

public class Task1 {
    public static void main(String[] args) {

        int a[] = new int[50];
        for (int i = 0; i < a.length; i++) {
            a[i] = i * 2 + 1;
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Выведение чисел в обратном порядке");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}

//разбитие на подзадачи:
//создать масив из чисел от 1 до 99
//вывести его на экран
//вывести этот же массив в обратном порядке
