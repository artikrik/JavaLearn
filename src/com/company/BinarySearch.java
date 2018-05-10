package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        int counter, num, item, array[], first, last;


        Scanner Scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        num = Scanner.nextInt();


        array = new int[num];

        System.out.println("Введите " + num + " чисел");


        for (counter = 0; counter < num; counter++)
            array[counter] = Scanner.nextInt();


        Arrays.sort(array);

        System.out.println("Введите элемент поиска: ");
        item = Scanner.nextInt();
        first = 0;
        last = num - 1;


        binarySearch(array, first, last, item);
    }

    // бинарный поиск
    public static void binarySearch(int[] array, int first, int last, int item) {
        int position;
        int comparisonCount = 1;    // для подсчета количества сравнений

        // для начала найдем индекс среднего элемента массива
        position = (first + last) / 2;

        while ((array[position] != item) && (first <= last)) {
            comparisonCount++;
            if (array[position] > item) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(item + " является " + ++position + " элементом в массиве");

        } else {
            System.out.println("Ничего не найдено");
        }
    }

}