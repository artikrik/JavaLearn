package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class BinarySearchString {
    public static void main(String[] args) {

        int counter, first, last;
        String item;
        String array[];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int num = 0;
        num = Integer.parseInt(scanner.next());


        array = new String[num];

        System.out.println("Введите " + num + " строк");


        for (counter = 0; counter < num; counter++) {

            array[counter] = scanner.next();
        }

        Arrays.sort(array);
        System.out.println("Введите элемент поиска: ");
        item = scanner.next();
        first = 0;
        last = num - 1;

        binarySearch(array, first, last, item);
    }

    public static void binarySearch(String[] array, int first, int last, String item) {
        int position;
        int comparisonCount = 1;

        position = (first + last) / 2;

        while ((!array[position].equals(item)) && (first <= last)) {
            comparisonCount++;
            if (array[position].compareTo(item) > 0) {
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