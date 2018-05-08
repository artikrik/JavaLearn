package w3;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchString {
    public static void main(String[] args) {

        String[] array = new String[]{"some", "random", "words", "needs", "to", "be", "sorted", "by", "bubble", "method", "august", "king", "j"};
        int position = 0;
        System.out.println(Arrays.toString(array));
        String word = " ";

        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array);
        }
        System.out.println("\n" + Arrays.toString(array)+ " - sorted array");
        System.out.println(" ");
        System.out.println("input word you want to find");
        Scanner scan = new Scanner(System.in);
        word = scan.next();

        String index = " ";
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            position = (start + end) / 2;
            if ((array[position].compareTo(word)) == 0) {
                index = array[position];
                break;
            } else if ((array[position].compareTo(word) > 0)) {
                end = position - 1;
            } else if ((array[position].compareTo(word) < 0)) {
                start = position + 1;
            }
        }
        if (index.equals(" ")) {
            System.out.println(" [ " + word + " ] " + " can't found in this array");
        } else
            System.out.println("word [" + word + "] is present at position " + position);
    }
}