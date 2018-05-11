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

//        String[] arrString = {"Сом", "Горбуша", "Лещ", "Плотва", "Окунь", "Форель"};
//        String stringToFind = "Окунь";
//        String element = arrString[0];
//        for (int i = 0; i < arrString.length; i++) {
//            if (arrString[i].equals(stringToFind))
//                element = arrString[i];
//        }
//        if (element == stringToFind)
//            System.out.println("Рыба есть");
//        else
//            System.out.println("Рыбы нет");


        /**
         * 3.2 Бинарный поиск int.
         */
//
//
//        int[] arrInt = {1, 4, 6, 23, 7, 54, 210, 25, 2, 14};
//        int numberToFind = 1;
//        int last = arrInt.length - 1;
//        int first = 0;
//        int mid = (last + 1) / 2;
//
//        Arrays.sort(arrInt);
//
//        while (arrInt[mid] != numberToFind && last != mid && first != mid) {
//            if (arrInt[mid] < numberToFind) {
//                first = mid;
//                mid = (last + first) / 2;
//            } else {
//                last = mid;
//                mid = (last + first) / 2;
//            }
//        }
//        if (arrInt[last] == numberToFind)
//            mid = last;
//        if (arrInt[first] == numberToFind)
//            mid = first;
//        System.out.print(arrInt[mid] == numberToFind ? "Число " + numberToFind + " найдено на позиции " + mid : "Числа нет");

        /**
         * 3.5 Бинарный поиск String.
         */

//        String[] arrString = {"Сом", "Горбуша", "Лещ", "Плотва", "Окунь", "Форель"};
//        String stringToFind = "Горбуша";
//        int last = arrString.length-1;
//        int first = 0;
//        int mid = (last + 1) / 2;
//
//        Arrays.sort(arrString);
//
//        while (arrString[mid] != stringToFind && last != mid && first != mid) {
//            if (arrString[mid].compareTo(stringToFind) < 0) {
//                first = mid;
//                mid = (last + first) / 2;
//            } else {
//                last = mid;
//                mid = (last + first) / 2;
//            }
//        }
//        if (arrString[last].equals(stringToFind))
//            mid = last;
//        if (arrString[first].equals(stringToFind))
//            mid = first;
//        System.out.print(arrString[mid].equals(stringToFind) ? "Слово " + stringToFind + " найдено на позиции " + mid : "Слова нет");


        /**
         * 3.6 Сортировка "пузырьком" String.
         */

//        String[] arrString = {"Сом", "Горбуша", "Лещ", "Плотва", "Окунь", "Форель"};
//
//        for (int i = 0; i < arrString.length - 1; i++) { // число итераций прогона для каждого числа
//            for (int j = arrString.length - 1; j > 0 + i; j--) { // прогон одного числа по массиву
//                if (arrString[j].compareTo(arrString[j - 1]) < 0) {
//                    String tmp = arrString[j];
//                    arrString[j] = arrString[j - 1];
//                    arrString[j - 1] = tmp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arrString));


        /**
         * 3.7 Бинарный поиск String (метод).
         */

        String[] arrString = {"Сом", "Горбуша", "Лещ", "Плотва", "Окунь", "Форель"};
        String stringToFind = "Горбуша";
        binarySearch(arrString, stringToFind);

    }

    public static void binarySearch(String[] arr, String w) {
        int last = arr.length - 1;
        int first = 0;
        int mid = (last + 1) / 2;

        Arrays.sort(arr);

        while (arr[mid] != w && last != mid && first != mid) {
            if (arr[mid].compareTo(w) < 0) {
                first = mid;
                mid = (last + first) / 2;
            } else {
                last = mid;
                mid = (last + first) / 2;
            }
        }
        if (arr[last].equals(w))
            mid = last;
        if (arr[first].equals(w))
            mid = first;
        System.out.print(arr[mid].equals(w) ? "Слово " + w+ " найдено на позиции " + mid : "Слова нет");



        /**
         * 3.8 Сортировка "пузырьком" String (метод).
         */

//        String[] arrString = {"Сом", "Горбуша", "Лещ", "Плотва", "Окунь", "Форель"};
//        bubbleSort(arrString);
//    }
//
//    public static void bubbleSort(String[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) { // число итераций прогона для каждого числа
//            for (int j = arr.length - 1; j > 0 + i; j--) { // прогон одного числа по массиву
//                if (arr[j].compareTo(arr[j - 1]) < 0) {
//                    String tmp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = tmp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));


        /**
         * 3.9 Перегрузка метода линейный поиск int и String.
         */

//        String[] arrString = {"Сом", "Горбуша", "Лещ", "Плотва", "Окунь", "Форель"};
//        int[] arrInt = {1, 4, 6, 23, 0, 54, 210, 25, 2, 14};
//        int numberToFind = 5;
//        String stringToFind = "Сом";
//
//        linerSort(arrInt, numberToFind);
//        linerSort(arrString, stringToFind);
//
//    }
//
//
//    public static void linerSort(int[] mass, int a) {
//        int element = mass[0];
//        for (int i = 0; i < mass.length; i++) {
//            if (mass[i] == a)
//                element = mass[i];
//        }
//
//        if (element == a)
//            System.out.println("\nЧисло есть");
//        else
//            System.out.println("\nЧисла нет");
//
//    }
//
//
//    public static void linerSort(String[] mass, String b) {
//        String element = mass[0];
//        for (int i = 0; i < mass.length; i++) {
//            if (mass[i].equals(b))
//                element = mass[i];
//        }
//        if (element.equals(b))
//            System.out.println("Рыба есть");
//        else
//            System.out.println("Рыбы нет");


        /**
         * 3.10 Перегрузка метода сортировки "пузырёк" int и String.
         */

//        String[] arrString = {"Сом", "Горбуша", "Лещ", "Плотва", "Окунь", "Форель"};
//        int[] arrInt = {1, 4, 6, 23, 0, 54, 210, 25, 2, 14};
//        bubbleSortArray(arrInt);
//        bubbleSortArray(arrString);
//
//    }
//
//    public static void bubbleSortArray(int[] z) {
//
//        for (int i = 0; i < z.length - 1; i++) { // число итераций прогона для каждого числа
//            for (int j = z.length - 1; j > i; j--) { // прогон одного числа по массиву
//                if (z[j] < z[j - 1]) {
//                    int tmp = z[j];
//                    z[j] = z[j - 1];
//                    z[j - 1] = tmp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(z));
//
//    }
//
//    public static void bubbleSortArray(String[] a) {
//
//        for (int i = 0; i < a.length - 1; i++) { // число итераций прогона для каждого числа
//            for (int j = a.length - 1; j > i; j--) { // прогон одного числа по массиву
//                if (a[j].compareTo(a[j - 1]) < 0) {
//                    String tmp = a[j];
//                    a[j] = a[j - 1];
//                    a[j - 1] = tmp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(a));


    }
}