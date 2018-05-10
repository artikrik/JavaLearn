package w4;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheLetter {
    public static void main(String[] args) {
        char letterNeedToBeFind = 'j';

        Scanner scan = new Scanner(System.in);
        char[] arrayChar = new char[26];
        for (int i = 0; i < arrayChar.length; i++) {
            arrayChar[i] = (char) ('a' + i);
        }
        System.out.println(Arrays.toString(arrayChar));
        System.out.println(letterNeedToBeFind);
        System.out.println("Try to find the hidden letter ?");
        char inputLetter = scan.next().charAt(0);

        for (char i = 0; i < arrayChar.length; i++) {
            if (letterNeedToBeFind == inputLetter){
                System.out.println("GREAT you have been found the hidden letter - " + inputLetter);
                break;
            }else {
                System.out.println("Wrong letter try again");

                if()
            }
        }

    }
}
