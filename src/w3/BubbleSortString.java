package w3;

import java.util.Scanner;

public class BubbleSortString {
    public static void main(String[] args) {
        Scanner letters = new Scanner(System.in);
        String tempStr;

        System.out.print("ввести строку > ");
        String s1 = new String(letters.nextLine());

        String[] t1 = s1.split("");

        for (int t = 0; t < t1.length - 1; t++) {
            for (int i = 0; i < t1.length - t - 1; i++) {
                if (t1[i + 1].compareTo(t1[i]) < 0) {
                    tempStr = t1[i];
                    t1[i] = t1[i + 1];
                    t1[i + 1] = tempStr;
                }
            }
        }
        for (int i = 0; i < t1.length; i++) {
            System.out.print(t1[i]);
        }
    }
}