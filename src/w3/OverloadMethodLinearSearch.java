package w3;

import java.util.Arrays;

public class OverloadMethodLinearSearch {
    public static void main(String[] args) {
        int digit = 60;
        boolean states;
        int[] randomMass = new int[25];
        for (int i = 0; i < randomMass.length; i++) {
            randomMass[i] = (int) (10 * Math.random());
        }
        System.out.print(Arrays.toString(randomMass) + "\t");


        String word = "herere";
        String[] str = new String[]{"some", "random", "words", "needs", "to", "be", "here"};
        System.out.println("\n" + Arrays.toString(str));

        states = linearSearch(randomMass, digit);
        if (states) {
            System.out.println("\n" + Integer.toString(digit) + " IS found ");
        } else
            System.out.println("\n" + digit + " can't be found in this array ");


        states = linearSearch(str, word);
        if (states) {
            System.out.println(" word is present ");
        } else
            System.out.println("- " + word + " -" + " word can not be found. Try again ");
    }


    public static boolean linearSearch(int[] randomMass, int digit) {
        boolean states = true;
        int i;
        for (i = 0; i < randomMass.length; i++) {
            if (digit == randomMass[i]) {
                states = true;
                break;
            }
        }
        if (i == randomMass.length) {
            states = false;
        }

        return states;
    }

    public static boolean linearSearch(String[] str, String word) {
        boolean states = false;
        for (int j = 0; j < str.length; j++) {
            if (word.equals(str[j])) {
                states = true;
                break;
            }
        }
        return states;
    }
}