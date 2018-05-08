package w3;

import java.util.Arrays;

public class BubbleSortInt {
    public static void main(String[] args) {
        int[] mass = new int[25];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (100 * Math.random());
        }
        System.out.print(Arrays.toString(mass) + "\t");

        bubbleAction(mass);
        System.out.println(" ");

        System.out.print(Arrays.toString(bubbleAction(mass)) + " - sorted Array");
    }

    public static int[] bubbleAction(int[] mass0) {
        int tor;
        for (int i = mass0.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (mass0[j] > mass0[j + 1]) {
                    tor = mass0[j];
                    mass0[j] = mass0[j + 1];
                    mass0[j + 1] = tor;
                }
            }
        }
        return mass0;
    }
}
