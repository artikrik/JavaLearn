package w3;

import java.util.Arrays;

public class BubblesOverload {
    public static void main(String[] args) {

        int[] intArray = new int[8];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (100 * Math.random());
            System.out.print(" " + intArray[i]);
        }
        System.out.println("");
        String[] stringAlphabet = {"Yankee", "November", "Alfa", "Lima", "Quebec", "Romeo", "Victor", "Whiskey", "Uniform", "Delta", "Bravo", "Mike",
                "Foxtrot",
                "Hotel", "X-ray", "Sierra", "Charlie", "Juliett", "Oscar", "Zulu", "Papa", "Golf", "Tango", "Echo", "India", "Kilo"};
        System.out.println(Arrays.toString(stringAlphabet));

        stringAlphabet = Bubbles(stringAlphabet);  // stringAlphabet будет изменен как параметр. Зачем его возвращать и принимать?
        System.out.print("");
        System.out.println(Arrays.toString(stringAlphabet) + " - отсортированный алфавит");

        intArray = Bubbles(intArray); // Аналогично stringAlphabet
        System.out.print("");
        System.out.println(Arrays.toString(intArray) + " - отсортированный массив чисел");

    }

    public static String[] Bubbles(String[] stringAlphabet) {
        String tempStr;
        for (int t = 0; t < stringAlphabet.length - 1; t++) {
            for (int i = 0; i < stringAlphabet.length - t - 1; i++) {
                if (stringAlphabet[i + 1].compareTo(stringAlphabet[i]) < 0) {
                    tempStr = stringAlphabet[i];
                    stringAlphabet[i] = stringAlphabet[i + 1];
                    stringAlphabet[i + 1] = tempStr;
                }
            }
        }

        for (int i = 0; i < stringAlphabet.length; i++) {  // Для чего этот пустой цикл?


        }
        return stringAlphabet;
    }

    public static int[] Bubbles(int[] intArray) {
        int n;
        for (int i = intArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (intArray[j] > intArray[j + 1]) {
                    n = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = n;
                }
            }
        }
        return intArray;
    }

}



