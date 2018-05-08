package w3;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchStringUsingMethods {
    public static void main(String[] args) {
        String[] array = new String[]{"some", "random", "words", "needs", "to", "be", "here", "and", "they", "are", "must", "be", "found"};
        String[] sortedArray;
        int position = 0;
        System.out.println(Arrays.toString(array));
        String word = " ";

        sortedArray = sortArray(array);
        System.out.println("\n" + Arrays.toString(sortedArray));

        System.out.println(" ");

        System.out.println("input word you want to find");
        word = inputWord(word);

        position = binarySearch(position, word, sortedArray);
        if ((sortedArray[position].compareTo(word)) == 0) {
            System.out.println("word [" + word + "] is present at position " + position);
        } else
            System.out.println("[" + word + "] " + " can't found in this array");
    }

    public static String[] sortArray(String[] array) {
        String[] sortedArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array);
            sortedArray = array;
        }
        return sortedArray;
    }

    public static String inputWord(String word) {
        Scanner scan = new Scanner(System.in);
        word = scan.next();
        return word;
    }

    public static int binarySearch(int position, String word, String[] sortedArray) {
        String index = " ";
        int left = 0;
        int right = sortedArray.length - 1;


        while (left <= right) {
            position = (left + right) / 2;
            if ((sortedArray[position].compareTo(word)) == 0) {
                index = sortedArray[position];
                break;
            } else if ((sortedArray[position].compareTo(word) > 0)) {
                right = position - 1;
            } else if ((sortedArray[position].compareTo(word) < 0)) {
                left = position + 1;
            }
        }
        if (index.equals("")) {
            position = 0;
        }
        return position;
    }
}