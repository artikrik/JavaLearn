package w2;
        /*10.В массиве А размером 10х5
        определить самые большие значения в каждой строке
        и среди них – наименьшее значение.*/

import java.util.Arrays;

public class Task_10 {
    public static void main(String[] args) {
        int[][] massA = new int[10][5];
        int[] reservMax;
        int min;
        for (int i = 0; i < massA.length; i++) {
            for (int j = 0; j < massA[i].length; j++) {
                massA[i][j] = (int) (0 + 12 * Math.random());
                System.out.print(massA[i][j] + "\t");
            }
            System.out.println(" ");
        }

        reservMax = searchHighestValuesInStrings(massA);
        System.out.println("\nthe max value of strings " + "\n" + Arrays.toString(reservMax));

        sortArray(reservMax);
        System.out.println("\nsorted Array" + Arrays.toString(reservMax));

        min = searchLowestValueAmongTheMax(reservMax);
        System.out.println("\nmin value from max = " + min);
    }

    public static int[] searchHighestValuesInStrings(int[][] massA) {
        int i;
        int max = 0;
        int[] reservMax = new int[massA.length];

        for (i = 0; i < massA.length; i++) {
            max = massA[i][0];
            for (int j = 0; j < massA[0].length; j++) {
                if (max < massA[i][j]) {
                    max = massA[i][j];
                }
            }
            reservMax[i] = max;
        }
        return reservMax;
    }

    public static void sortArray(int[] reservMax) {
        Arrays.sort(reservMax);
    }

    public static int searchLowestValueAmongTheMax(int[] reservMax) {
        int min;
        min = reservMax[0];
        for (int i = 0; i != reservMax.length; i++) {

            if (reservMax[i] < min) {
                min = reservMax[i];
            }
        }
        return min;
    }
}
