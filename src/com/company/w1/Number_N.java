package w1;

import java.util.Scanner;

public class Number_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int input = sc.nextInt();
        division(input);
    }

    public static void division(int input) {
        for (int i = input; i > 9; i--) {

            int temp = i;
            int number;
            while (temp > 0) {
                number = temp % 10;
                if (number > 0) {
                    number = i % number;
                    if (number >= 1) {
                        break;
                    }
                }
                else break;
                temp = temp / 10;
            }
            if (temp == 0) {
                System.out.println("Result " + i);
            }

        }
    }
}
