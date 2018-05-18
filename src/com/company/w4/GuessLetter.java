import java.util.Random;
import java.util.Scanner;


public class GuessLetter {
    public static void main(String[] args) {

        System.out.println("\bПравила игры:" + "\nПрограмма загадывает одну латинскую букву. Пользователь должен угадать эту букву." + "\nПользователь вводит одну латинскую букву с клавиатуры." +
                "\nПрограмма помогает угадывать букву подсказками. Вводить можно как большие, так и маленькие буквы." + "\nВНИМАНИЕ! При введении нескольких символов, будет учтён только первый символ.");

        //программа генерирует букву для отгадывания

        Random r = new Random();
        char programLetter = (char) (r.nextInt(26) + 'A');
//        System.out.println(programLetter);
        char userLetter;
        int asciiUserLetter;
        int otherSymbols;
        boolean b;
        int counter = 0;


//        System.out.println(asciiUserLetter);
//        System.out.println(userLetter);


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
                if (!b || asciiUserLetter > otherSymbols) {
                    throw new IllegalArgumentException("Вы ввели неверный символ. Ознакомьтесь с правилами игры!");
                } else
                    try {
                        if (programLetter < userLetter) {
                            throw new IllegalArgumentException();
                        }
                    } catch (IllegalArgumentException c) {
                        System.out.println("Холодно. Перелёт!");
                    }
                try {
                    if (programLetter > userLetter) {
                        throw new IllegalArgumentException();
                    }
                } catch (IllegalArgumentException n) {
                    System.out.println("Холодно. Недолёт!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            counter++;
        }
        while (programLetter != userLetter);
//        if (programLetter == userLetter)
        System.out.println("Вы угадали букву " + userLetter + " за " + counter + " попыток " + "!" + " Поздравляем!");
    }
}
