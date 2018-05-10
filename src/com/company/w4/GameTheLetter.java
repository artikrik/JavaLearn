package com.company.w4;

import java.util.Random;
import java.util.Scanner;

public class GameTheLetter {
    public static void main(String[] args) {
        String welcome = "Угадайте загаданную программой латинскую букву вводя свой вариант буквы с клавиатуры";
        System.out.println(welcome);
        Random random = new Random(9);          // генерим букву, которую должен угадать пользователь
        char computerLetter = (char) (random.nextInt('z' - 'a') + 'a');
        int numberOfAttempts = winOrNo(computerLetter); //метод который вызывает метод guessedLetterIsClose до тех пор, пока мы не угадали букву
        System.out.println("Количество попыток пользователя = " + numberOfAttempts);
    }

    //метод проверка верно введеной букви
    static char getInputNumber(char computerLetter) {
        char inputNumber;
        Scanner scanner = new Scanner(System.in);

        if ((!scanner.hasNext("[a-zA-Z]"))) {
            System.out.println("Если желаете продолжить игру, введите любую латинскую букву латинская букву");
            inputNumber = 0;
        } else if (scanner.hasNext("[A-Z]"))
            inputNumber = (char) (scanner.next().charAt(0) + 32); // Букву вводите в строку? Смело. Читайте ниже
        else
            inputNumber = scanner.next().charAt(0); //Пользователь ввел строку. Почему Вы решили анализировать именно ПЕРВУЮ букву?
        return inputNumber;
    }

    //метод угадал ли пользователь введенную им букву
    static String guessedLetterIsClose(int inputNumber, char computerLetter) {
        String outValue = null;
        if (inputNumber == computerLetter) outValue = "Поздравляем Вы угадали букву";
        else if ((Math.abs(inputNumber - computerLetter)) <= 5) outValue = "Вы очень близко";
        else if ((Math.abs(inputNumber - computerLetter)) <= 10) outValue = "Горячо";
        else if ((Math.abs(inputNumber - computerLetter)) >= 11 || ((Math.abs(inputNumber - computerLetter)) <= 24))
            outValue = "Холодно";
        return outValue;
    }


    static int winOrNo(char computerLetter) {
        int numberOfAttempts = 0;
        String valueOfcompareTwoLetter;
        do {
            char userLetter = getInputNumber(computerLetter);
            if ((userLetter < 'a' || userLetter > 'z') && (userLetter < 'A' || userLetter > 'Z')) {
                valueOfcompareTwoLetter = "";
            } else {
                valueOfcompareTwoLetter = (guessedLetterIsClose(userLetter, computerLetter));
                System.out.println(valueOfcompareTwoLetter);
            }
            ++numberOfAttempts;
        }
        while (!valueOfcompareTwoLetter.equals("Поздравляем Вы угадали букву"));
        return numberOfAttempts;
    }
}
