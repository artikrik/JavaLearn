package week2;

import java.util.Scanner;

public class HomeWorkFindNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNumber = 0;
        do {
            System.out.print("Введите целое позитивное число от 1 до 100,000: ");
            userNumber = scan.nextInt();
        }
        while (userNumber < 0);

        long startTime = System.currentTimeMillis();

        int wholePart;      // целая часть числа
        int remainder = 0;  // переменная для деление по модулю
        int tmp = 0;        // временная переменная

        while (userNumber > 0) {
            tmp = userNumber;
            wholePart = tmp / 10;
            do {
                remainder = tmp % 10;
                if (remainder != 0 && userNumber % remainder == 0) {
                    tmp /= 10;
                } else {
                    break;
                }
            } while (wholePart > 0);

            if (tmp == 0) {
                System.out.println(userNumber);
            }
            --userNumber;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Work Time: " + (endTime - startTime));
    }
}

