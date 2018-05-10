package w3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 3.3 Сортировка "пузырьком".
 */
public class SortAndSearch {
    public static void main(String[] args) {
//        Random random = new Random();
//        int[] bubbleArray = new int[10];
//        for (int i = 0; i < bubbleArray.length; i++) {
//            bubbleArray[i] = random.nextInt(20);
//            System.out.print(bubbleArray[i] + "\t"); // создание и заполнение массива
//        }
//        for (int i = 0; i < bubbleArray.length - 1; i++) { // число итераций прогона для каждого числа
//            for (int j = bubbleArray.length - 1; j > 0+i; j--) { // прогон одного числа по массиву !!! 0+i что значит?
//                if (bubbleArray[j] < bubbleArray[j - 1]) {
//                    int tmp = bubbleArray[j];
//                    bubbleArray[j] = bubbleArray[j - 1];
//                    bubbleArray[j - 1] = tmp;
//                }
//            }
//        }
//        System.out.println();
//        System.out.println("\n" + Arrays.toString(bubbleArray));


        /**
         * 3.1 Линейный поиск.
         */

//        Scanner s = new Scanner(System.in);
//        System.out.println("Введите число для поиска:");
//        int x = s.nextInt();
//        Random random = new Random();
//        int arrValue = 10;
//        int[] linerSearchArray = new int[arrValue];
//        int element = linerSearchArray[0];
//        for (int i = 0; i < linerSearchArray.length; i++) {
//            linerSearchArray[i] = random.nextInt(20);
//            System.out.print(linerSearchArray[i] + "\t");// создание и заполнение массива
//            if (linerSearchArray[i] == x)
//                element = linerSearchArray[i];
//        }
//
//        if (element == x)
//            System.out.println("\nЧисло есть");
//        else
//            System.out.println("\nЧисла нет");


        /**
         * 3.4 Линейный поиск String.
         */

//
//        char[] arr = {'a', 'd', 'f', 'l', 'o', 'z'}; // работать нужно с массивом данных типа String!
//        char charToFind = 'a';
//        char element = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==charToFind)
//                element = arr[i];
//        }
//        if (element == charToFind)
//            System.out.println("Буква есть");
//        else
//            System.out.println("Буква не найдена");

        /**
         * 3.6 Сортировка "пузырьком" String.
         */

//        char[] arr = {'o', 'd', 'f', 'l', 'a', 'z'};  Аналогично. Работать нужно с String
//
//        for (int i = 0; i < arr.length - 1; i++) { // число итераций прогона для каждого числа
//            for (int j = arr.length - 1; j > 0 + i; j--) { // прогон одного числа по массиву
//                if (arr[j] < arr[j - 1]) {
//                    char tmp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = tmp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));


        /**
         * 3.8 Сортировка "пузырьком" String (метод).
         */

//        char[] arr = {'o', 'd', 'f', 'l', 'a', 'z', 'h', 't', 'r'};
//        bubbleSort(arr);
//    }
//
//    public static void bubbleSort (char[] arr) {
//        for (int i = 0; i < arr.length - 1; i++)
//
//        { // число итераций прогона для каждого числа
//            for (int j = arr.length - 1; j > 0 + i; j--) { // прогон одного числа по массиву
//                if (arr[j] < arr[j - 1]) {
//                    char tmp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = tmp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));


        /**
         * 3.9 Перегрузка метода линейный поиск int и String.
         */

        char[] arrChar = {'a', 'd', 'f', 'l', 'o', 'z'};
        int[] arrInt = {1, 4, 6, 23, 0, 54, 210, 25, 2, 14};
        int numberToFind = 5;
        char charToFind = 'a';

        linerSort(arrInt, numberToFind);
        linerSort(arrChar, charToFind);

    }


    public static void linerSort(int[] mass, int a) {
        int element = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == a)
                element = mass[i];
        }

        if (element == a)
            System.out.println("\nЧисло есть");
        else
            System.out.println("\nЧисла нет");

    }


    public static void linerSort(char[] mass, char b) {  // должно быть String[]
        char element = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == b)
                element = mass[i];
        }
        if (element == b)
            System.out.println("Буква есть");
        else
            System.out.println("Буква не найдена");
    }
}



