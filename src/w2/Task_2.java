package w2;
        /*2.Создайте массив из 15 случайных целых чисел из отрезка [0;9].
        Выведите массив на экран.
        Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.*/

import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        Random ram = new Random();
        int[] mass;
        int l = 0;
        mass = new int[16];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = ram.nextInt(10);
            if (mass[i] % 2 == 0) {             // определяем парные числа
                ++l;                            // считаем количество парных чисел
                System.out.print(mass[i] + " ");
            }
        }
        System.out.println("\n" + l + "");
    }
}
