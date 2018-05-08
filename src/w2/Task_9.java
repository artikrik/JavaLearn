package w2;
        /*9.Пользователь должен указать с клавиатуры чётное положительное число,
        а программа должна создать массив указанного размера из случайных целых чисел из [-5;5] и вывести его на экран в строку.
        После этого программа должна определить и сообщить пользователю о том, сумма модулей какой половины массива больше: левой или правой, либо сообщить, что эти суммы модулей равны.
        Если пользователь введёт неподходящее число, то программа должна требовать повторного ввода до тех пор, пока не будет указано корректное значение.*/

import java.util.Arrays;
import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter even number");
        int number = scan.nextInt();
        int leftsum = 0;
        int rightsum = 0;
        if (number % 2 != 0) {
            System.out.println(number + " " + "not an even number, try again");
        } else {
            int[] mass0 = new int[number];
            for (int i = 0; i < mass0.length; i++) {
                mass0[i] = (int) (-5 + 10 * Math.random());
            }
            System.out.println("\nArray");
            System.out.println(Arrays.toString(mass0) + " ");

            for (int i = 0; i < (number / 2); i++) {
                leftsum += mass0[i];
                rightsum += mass0[number - 1 - i];
            }
            if (leftsum > rightsum) {
                System.out.println("left sum = " + leftsum + " bigger when" + " right sum = " + rightsum);
            }
            if (leftsum < rightsum) {
                System.out.println("left sum = " + leftsum + " smaller when" + " right sum = " + rightsum);
            }
            if (leftsum == rightsum) {
                System.out.println("left and right sums the same");
            }
        }
    }
}
