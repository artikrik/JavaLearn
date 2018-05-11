/*Написать программу игры в угадывание букв.
Пользователь должен угадать загаданную программой латинскую букву вводя свой вариант буквы с клавиатуры.
Если пользователь угадал букву,
программа выводит сообщение о выигрыше и количестве попыток пользователя.
Если буква не угадана, программа предлагает ввести другую букву.
При этом программа выводит подсказки.
Если пользователь ввел букву меньше загаданной – вывести сообщение об этом (например, «Too low!»).
Аналогично при вводе буквы больше загаданной (например, «Too high!»).
* Если введена не латинская буква – предложить пользователю внимательно ознакомиться с правилами игры.
* Программа должна быть не чувствительна к регистру введенной пользователем буквы.
Например, при загаданной букве ‘G’ ответы пользователя ‘G’ или ‘g’ в равной степени считаются правильными.
Игра продолжается до выигрыша пользователя.
Тексты выводимых программой сообщений – на Ваше усмотрение.
Для загадывания букв использовать генератор псевдослучайных чисел.*/

package w4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FindTheLetter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char letterNeedToBeFind = (char) ('A' + new Random().nextInt(26));
        int numberOfAttempts = 0;
        boolean states;
        /*char[] arrayChar = new char[26];
        for (int i = 0; i < arrayChar.length; i++) {
            arrayChar[i] = (char) ('A' + i);
        }
        System.out.println(Arrays.toString(arrayChar));*/
        System.out.println("Hidden letter - " + letterNeedToBeFind);
        System.out.println("\nTry to find the hidden letter, you have 5 attempts");

        for (char i = 0; i < 7; i++) {
            char inputLetter = scan.next().charAt(0);
            inputLetter = Character.toUpperCase(inputLetter);
            states = validationChacking(inputLetter);

            numberOfAttempts++;
            if (!states) {
                System.out.println("You enter not Latin letter, please try again");
                continue;
            }
            if (letterNeedToBeFind == inputLetter) {
                System.out.println("GREAT you have been found the hidden letter - " + inputLetter);
                break;
            } else {
                System.out.println("Wrong letter try again");
                if (Character.getNumericValue(letterNeedToBeFind) > Character.getNumericValue(inputLetter)) {
                    System.out.println("You are <Too low!> to hidden letter");
                } else if (Character.getNumericValue(letterNeedToBeFind) < Character.getNumericValue(inputLetter)) {
                    System.out.println("You are <Too high!> to hidden letter");
                }
            }
        }
        System.out.println("Number of attempts = " + numberOfAttempts);
    }

    public static boolean validationChacking(int inputLetter) {
        boolean states;
        states = Character.isLetter(inputLetter);
        return states;
    }
}