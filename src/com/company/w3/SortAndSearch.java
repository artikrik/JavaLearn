package w3;

import java.util.Arrays;
import java.util.Random;

/**
 * Сортировка "пузырьком".
 */
public class SortAndSearch {
    public static void main(String[] args) {
        Random random = new Random();
        int[] bubbleArray = new int[10];
        for (int i = 0; i < bubbleArray.length; i++) {
            bubbleArray[i] = random.nextInt(20);
            System.out.print(bubbleArray[i] + "\t"); // создание и заполнение массива
        }
        for (int i = 0; i < bubbleArray.length - 1; i++) { // число итераций прогона для каждого числа
            for (int j = bubbleArray.length - 1; j > 0+i; j--) { // прогон одного числа по массиву
                if (bubbleArray[j] < bubbleArray[j - 1]) {
                    int tmp = bubbleArray[j];
                    bubbleArray[j] = bubbleArray[j - 1];
                    bubbleArray[j - 1] = tmp;
                }
            }
        }
        System.out.println();
        System.out.println("\n" + Arrays.toString(bubbleArray));

        /**
         * Линейный поиск.
         */

    }
}



