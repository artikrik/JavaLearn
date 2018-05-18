package w4;
import java.util.Random;
import java.util.Scanner;

public class GuessLetter {
    static int counter;
    static char systemsLetter;

    public static void main(String[] args) {
        compareSymbols();
}
    private static char userSetsLetter() {
        Scanner usersLetter = new Scanner(System.in);
        char symbol;
        printMessage("Введите букву:");
        symbol = usersLetter.next().charAt(0);
        while (symbol < 'A' || (symbol > 'Z' && symbol < 'a') || symbol > 'z') {
            printMessage("Буква должна быть латинского алфавита:");
            symbol = usersLetter.next().charAt(0);
        }
        return transformSmallToCapitalLetter(symbol);
    }

    private static char transformSmallToCapitalLetter(char symbol) {  // Стоит ли писать то, что есть в языке?
        if(symbol >= 'a' && symbol <= 'z')
            return (char)(symbol - ('a' - 'A'));
        else {
            return symbol;
        }
    }

    private static char systemSetsLetter() {
        int intSystemsLetter = 65 + new Random().nextInt(26);  // магические числа
        return (char)intSystemsLetter;
    }

    private static void compareSymbols() {
        char usersLetter = userSetsLetter();
        while(systemsLetter == '\u0000') {   // какова цель этого цикла?
            systemsLetter = systemSetsLetter();
        }
        compareSymbolsMechanism(usersLetter, systemsLetter);
    }

    private static void compareSymbolsMechanism(char usersLetter, int systemsLetter) {
        if(usersLetter == systemsLetter) {
            guessedMessage();
            attemptsCounter(); // зачем дублировать вызов эотого метода?
            printMessage("Количество попыток " + counter);
        }
        else if(usersLetter < systemsLetter) {
            nextLetterMessage();
            attemptsCounter();
            compareSymbols();
        }
        else {
            previousLetterMessage();
            attemptsCounter();
            compareSymbols();
        }
    }

    private static void guessedMessage() {
        printMessage("Поздарвляем. Вы угадали!");
    }

    private static void nextLetterMessage() {
        printMessage("Попробуйте одну из следующих букв в алфавите");
    }

    private static void previousLetterMessage() {
        printMessage("Попробуйте одну из предыдущих букв в алфавите");
    }

    private static void printMessage(String message) {
        System.out.println(message);
    }

    private static void attemptsCounter() {
        counter++;
    }
}
