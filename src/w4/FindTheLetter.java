
package w4;


import java.util.Random;
import java.util.Scanner;

public class FindTheLetter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char letterNeedToBeFind = (char) ('A' + new Random().nextInt('Z' - 'A'));
        int numberOfAttempts;
        char inputLetter = '0';
        boolean states;

        System.out.println("Hidden letter - " + letterNeedToBeFind);
        System.out.println("\nTry to find the hidden letter");

        for (numberOfAttempts = 0; letterNeedToBeFind != inputLetter; numberOfAttempts++) {
            inputLetter = scan.next().charAt(0);
            inputLetter = Character.toUpperCase(inputLetter);
            states = validationChacking(inputLetter);

            try {
                if (!states) {
                    throw new ArithmeticException();
                }
            } catch (ArithmeticException e) {
                System.out.println("You enter not Latin letter, please try again");
                continue;
            }

            if (letterNeedToBeFind == inputLetter) {  // Зачем это условие, если оно вынесено в for?
                System.out.println("GREAT you have been found the hidden letter - " + inputLetter); // этот вывод - после цикла?

            } else {
                System.out.println("Wrong letter try again");
                if (letterNeedToBeFind > inputLetter) {
                    System.out.println("You are <Too low!> to hidden letter");
                } else if (letterNeedToBeFind < inputLetter) {
                    System.out.println("You are <Too high!> to hidden letter");
                }
            }
        }
        System.out.println("Number of attempts = " + numberOfAttempts);
    }

    public static boolean validationChacking(int inputLetter) {
        return Character.isLetter(inputLetter);
    }
}
