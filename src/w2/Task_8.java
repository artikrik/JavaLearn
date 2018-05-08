package w2;
        /*8.Создайте массив из 11 случайных целых чисел из отрезка [-1;1],
        выведите массив на экран в строку.
        Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
        Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.*/

import java.util.Arrays;

public class Task_8 {
    public static void main(String[] args) {
        int[] mass0 = new int[11];
        int a = 0, b = 0, c = 0;

        for (int i = 0; i < mass0.length; i++) {
            mass0[i] = (int) (-2 + 4 * Math.random());

            if (mass0[i] == -1) {
                a++;
            }
            if (mass0[i] == 0) {
                b++;
            }
            if (mass0[i] == 1) {
                c++;
            }

            if (i == mass0.length-1) {
                if ((a > b) && (a > c))
                    System.out.println("\n -1 repeats  " + a + " times");
                if ((b > a) && (b > c))
                    System.out.println("\n 0 repeats  " + b + " times");
                if ((c > a) && (c > b))
                    System.out.println("\n 1 repeats  " + c + " times");
            }
        }
        System.out.print(Arrays.toString(mass0) + " ");
    }
}
