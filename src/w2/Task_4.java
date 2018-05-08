package w2;
        /*4.Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
        выведите массивы на экран в двух отдельных строках.
        Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение оказалось больше
        (либо сообщите, что их средние арифметические равны).*/

import java.util.Random;

public class Task_4 {
    public static void main(String[] args) {
        Random ram = new Random();
        int[] mass0;
        int sum0 = 0;
        double average0 = 0;
        mass0 = new int[5];
        for (int i = 0; i < mass0.length; i++) {
            mass0[i] = ram.nextInt(6);
            System.out.print(mass0[i] + " ");                  //все элементы массива
            sum0 += mass0[i];                                  //сумма элементов массива
            average0 += sum0 / mass0.length;                   //среднее арифметическое
        }
        System.out.println(" ");

        System.out.println("mass0 average = " + average0 + " ");
        System.out.println(" ");
        int[] mass1;
        int sum1 = 0;
        double average1 = 0;
        mass1 = new int[5];
        for (int i = 0; i < mass1.length; i++) {
            mass1[i] = (int) ((Math.random() * 5));
            System.out.print(mass1[i] + " ");                 //все элементы массива
            sum1 += mass1[i];                                 //сумма элементов массива
            average1 += sum1 / mass1.length;                  //среднее арифметическое
        }
        System.out.println(" ");
        System.out.println("mass1 average = " + average1 + " ");
        //сравниваем среднее арифметическое массивов
        System.out.println(" ");
        if (average0 > average1) {
            System.out.println("mass0 average = " + average0 + " " + " > " + " " + "mass1 average = " + average1);
        }
        if (average0 < average1) {
            System.out.println("mass0 average = " + average0 + " " + " < " + " " + "mass1 average = " + average1);
        }
        if (average0 == average1) {
            System.out.println("mass0 average = " + average0 + " " + " = " + " " + "mass1 average = " + average1);
        }
    }
}
