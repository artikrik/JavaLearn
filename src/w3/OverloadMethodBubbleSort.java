package w3;

import java.util.Arrays;

public class OverloadMethodBubbleSort {
    public static void main(String[] args) {
        int[] massInt = new int[0];
        String[] masString = new String[]{""};

        massInt = createArray(massInt);
        System.out.println(Arrays.toString(massInt));

        massInt = bubbleMagic(massInt);
        System.out.println(Arrays.toString(massInt) + " - bubble sorted");

        masString = createArray(masString);
        System.out.println("\n" + Arrays.toString(masString));

        masString = bubbleMagic(masString);
        System.out.println(Arrays.toString(masString) + " - bubble sorted");
    }

    public static int[] createArray(int[] massInt) {
        int[] mass0 = new int[25];
        for (int i = 0; i < mass0.length; i++) {
            mass0[i] = (int) (100 * Math.random());
        }
        return mass0;
    }

    public static int[] bubbleMagic(int[] mass) {
        int tor;
        for (int i = mass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (mass[j] > mass[j + 1]) {
                    tor = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = tor;
                }
            }
        }
        return mass;
    }

    public static String[] createArray(String[] masString) {
        String[] array = new String[]{"some", "random", "words", "needs", "to", "be", "sorted", "by", "bubble", "method", "august", "king"};
        return array;
    }

    public static String[] bubbleMagic (String[]bubblesort){
       String tmp;
        for (int i = bubblesort.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (bubblesort[j].compareTo(bubblesort[j + 1]) > 0) {
                    tmp = bubblesort[j];
                    bubblesort[j] = bubblesort[j + 1];
                    bubblesort[j + 1] = tmp;
                }
            }
        }
        return bubblesort;
    }
}
