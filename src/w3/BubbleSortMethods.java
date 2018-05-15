package w3;


import java.util.Arrays;

public class BubbleSortMethods {
    public static void main(String[] args) {
        String[] alphabet = {"Yankee", "November", "Alfa", "Lima", "Quebec", "Romeo", "Victor", "Whiskey", "Uniform", "Delta", "Bravo", "Mike",
                "Foxtrot",
                "Hotel", "X-ray", "Sierra", "Charlie", "Juliett", "Oscar", "Zulu", "Papa", "Golf", "Tango", "Echo", "India", "Kilo"};
        System.out.println(Arrays.toString(alphabet));

        alphabet = Bubbles(alphabet);
        System.out.print("");
        System.out.println(Arrays.toString(alphabet) + " - отсортированный массив");
    }

    public static String[] Bubbles(String[] alphabet) { // зачем возвращать массив? все равно параметр alphabet будет изменен
        String tempStr;
        for (int t = 0; t < alphabet.length - 1; t++) {
            for (int i = 0; i < alphabet.length - t - 1; i++) {
                if (alphabet[i + 1].compareTo(alphabet[i]) < 0) {
                    tempStr = alphabet[i];
                    alphabet[i] = alphabet[i + 1];
                    alphabet[i + 1] = tempStr;
                }
            }
        }

        for (int i = 0; i < alphabet.length; i++) {  // зачем этот цикл?



        }return alphabet;
    }


}

