package com.company.GuessTheLetter;

import java.util.Random;
import java.util.Scanner;


public class GuessTheLetterGame {
    public static void main(String[] args) {

        System.out.println("Правила игры: " +
                                   "\nПрограмма загадала одну латинскую букву. Ваша задача угатать её." +
                                   "\nВводить можно только латинские символы!!!" +
                                   "\nИспользуйте подсказки.");

        char usersInputLetter = '0';
        int usersAttemps = 0;
        boolean correctionCheck;
        char computersLetter = (char) ('A' + new Random().nextInt('Z' - 'A'));

        Scanner scan = new Scanner(System.in);
        System.out.println("\nВведите свою букву: ");


        for (usersAttemps = 0; computersLetter != usersInputLetter; usersAttemps++) {
            usersInputLetter = scan.next().charAt(0);
            usersInputLetter = Character.toUpperCase(usersInputLetter);
            correctionCheck = isLetterCheck(usersInputLetter);

            try {
                if (!correctionCheck) {
                    throw new ArithmeticException();
                }
            } catch (ArithmeticException a) {
                System.out.println("Вы ввели не верный символ. Перечитайте вниметельно правила игры!");
            }
            try {
                if (usersInputLetter < computersLetter) {
                    throw new IllegalArgumentException("Ваша буква на порядок меньше загаданой," +
                                                               " попробуйте ещё");
                }
            } catch (IllegalArgumentException a){
                System.out.println(a.getMessage());
            }
            try {
                if (usersInputLetter > computersLetter) {
                    throw new IllegalArgumentException("ваша буква на порядок больше загаданной," +
                                                               " попробуйте ещё");
                }
            } catch (IllegalArgumentException b){
                System.out.println(b.getMessage());
            }
        }
        System.out.println("Вы угадали загаданную букву " + computersLetter +
                                   "\nЗа " + usersAttemps + " попыток.");
    }

    private static boolean isLetterCheck(char usersInputLetter) {
        return Character.isLetter(usersInputLetter);
    }
}