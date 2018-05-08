package w3;

import java.util.Arrays;

public class LinearSearchInt {
    public static void main(String[] args) {
        int[] mass = new int[10];
        int digit = 7;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (10 * Math.random());
        }
        System.out.print(Arrays.toString(mass) + "\t");

        linearSearch(mass, digit);
    }

    public static void linearSearch(int[] mass0, int digit) {
        int i;
        for (i = 0; i < mass0.length; i++) {
            if (digit == mass0[i]) {
                System.out.println("\n" + Integer.toString(digit) + " IS found " + " at position " + i);
                break;
            }
        }
        if (i == mass0.length) {
            System.out.println("\n" + digit + " can't be found in this array ");
        }
    }
}
