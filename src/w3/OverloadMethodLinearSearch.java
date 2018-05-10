package w3;

import java.util.Arrays;

public class OverloadMethodLinearSearch {
    public static void main(String[] args) {
        int[] randomMass = new int[0];
        int digit = 7;

        String[] str = new String[]{""};
        String word = "beeee";

        randomMass = arraysCreator(randomMass);
        System.out.print(Arrays.toString(randomMass) + "\t");

        boolean states;
        states = linearSearch(randomMass, str, digit, word);
        if (states) {
            System.out.println("\n" + Integer.toString(digit) + " IS found ");
        } else
            System.out.println("\n" + digit + " can't be found in this array ");


        str = createArrayForString(str);
        System.out.println(Arrays.toString(str));

        states = linearSearch(randomMass, str, digit, word);
        if (states) {
            System.out.println(" word is present ");
        } else
            System.out.println(" word can not be found. Try again ");
    }

    public static int[] arraysCreator(int[] randomMass) {
        int[] Mass = new int[10];
        for (int i = 0; i < Mass.length; i++) {
            Mass[i] = (int) (10 * Math.random());
            randomMass = Mass;
        }
        return randomMass;
    }

    public static boolean linearSearch(int[] mass0, String[]str, int digit, String word) {
        boolean states = true;
        int i;
        for (i = 0; i < mass0.length; i++) {
            if (digit == mass0[i]) {
                states = true;
                break;
            }
        }
        if (i == mass0.length) {
            states = false;
        }
        for (int j = 0; j < str.length; j++) {
            if (word.equals(str[j])) {
                states = true;
            }
        }
        return states;
    }

    public static String[] createArrayForString(String[] str) {
        String[] str0 = new String[]{"some", "random", "words", "needs", "to", "be", "here"};
        str = str0;
        return str;
    }
}