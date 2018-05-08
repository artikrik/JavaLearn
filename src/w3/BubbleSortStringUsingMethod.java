package w3;

import java.util.Arrays;

public class BubbleSortStringUsingMethod {
    public static void main(String[] args) {
        String[] array = new String[]{"some", "random", "words", "needs", "to", "be", "sorted", "by", "bubble", "method", "august", "king", "j"};
        System.out.println(Arrays.toString(array));

        array = bubbleMagic(array);
        System.out.println(Arrays.toString(array) + " - sorted Array");
    }

    public static String[] bubbleMagic(String[] array) {
        String tor;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (array[j].compareTo(array[j + 1]) > 0) {
                    tor = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tor;
                }
            }
        }
        return array;
    }
}

