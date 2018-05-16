package w4;


import java.util.Random;
import java.util.Scanner;


public class GuessLetter {
    public static void main(String[] args) {

        System.out.println("\bПравила игры:" + "\nПрограмма загадывает одну латинскую букву. Пользователь должен угадать эту букву." + "\nПользователь вводит одну латинскую букву с клавиатуры." +
                            "\nПрограмма помогает угадывать букву подсказками. Вводить можно как большие, так и маленькие буквы." + "\nВНИМАНИЕ! При введении нескольких символов, будет учтён только первый символ.");

        //программа генерирует букву для отгадывания

        Random r = new Random();
        char programLetter = (char) (r.nextInt(26) + 'A');
        System.out.println(programLetter);
        char userLetter;
        int asciiUserLetter;
        int otherSymbols;
        boolean b;

        do {
            //программа ожидает ввода с клавиатуры

            Scanner sc = new Scanner(System.in);
            System.out.println("\nВведите свою букву:");
            userLetter = Character.toUpperCase(sc.next().charAt(0));
            asciiUserLetter = (int) userLetter;
            otherSymbols = 95;
            b = Character.isLetter(userLetter);

            // обработка введенных данных

            try {
                if (!b) {
                    throw new IllegalMonitorStateException();
                }
            } catch (IllegalMonitorStateException e) {
                System.out.println("Вы ввели неверный символ. Ознакомьтесь с правилами игры!");
            }
            try {
                if (asciiUserLetter > otherSymbols) {
                    throw new IllegalMonitorStateException();
                }
            } catch (IllegalMonitorStateException d) {
                System.out.println("Вы ввели неверный символ. Ознакомьтесь с правилами игры!");
            }
            try {
                if (programLetter < userLetter) {
                    throw new ArithmeticException();
                }
            } catch (ArithmeticException c) {
                System.out.println("Холодно. Перелёт!");
            }
            try {
                if (programLetter > userLetter) {
                    throw new ArithmeticException();
                }
            } catch (ArithmeticException n) {
                System.out.println("Холодно. Недолёт!");
            }
        }
        while (programLetter != userLetter);
        System.out.println("Вы угадали букву " + userLetter + "!" + " Поздравляем!");
    }
}
