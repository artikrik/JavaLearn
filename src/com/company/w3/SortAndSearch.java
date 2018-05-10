package w3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Сортировка "пузырьком".
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
//            for (int j = bubbleArray.length - 1; j > 0+i; j--) { // прогон одного числа по массиву
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
         * Линейный поиск.
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
         * Линейный поиск String.
         */

//
//        char[] arr = {'a', 'd', 'f', 'l', 'o', 'z'};
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
         * Сортировка "пузырьком" String.
         */

        char[] arr = {'o', 'd', 'f', 'l', 'a', 'z'};

        for (int i = 0; i < arr.length - 1; i++) { // число итераций прогона для каждого числа
            for (int j = arr.length - 1; j > 0 + i; j--) { // прогон одного числа по массиву
                if (arr[j] < arr[j - 1]) {
                    char tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}



