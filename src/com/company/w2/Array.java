package w2;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 1. Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
 * а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
 */
public class Array {

    public static void main(String[] args) {

//        int[] massiv = new int[100];
//        for (int i = 1; i < massiv.length; i++) {
//            if (i % 2 != 0)
//                System.out.print(i + ", ");
//        }
//        {
//            System.out.println();
//        }
//        for (int i = massiv.length - 1; i >= 1 ; i--) { // Почему нулевой элемент исключен?
//            if (i % 2 != 0)
//                System.out.print(i + ", ");
//        }

        /**
         * 2. Создайте массив из 15 случайных целых чисел из отрезка [0;9].
         * Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов
         * и выведете это количество на экран на отдельной строке.
         */

//        Random random = new Random();
//        int[] randomMass = new int[15];
//        for (int i = 0; i < randomMass.length; i++) {
//            randomMass[i] = random.nextInt(10);
//            System.out.print(randomMass[i] + " ");
//        }
//        {
//            System.out.println();
//        }
//        int sum = 0;
//        for (int j = 0; j < randomMass.length; j++) {
//            if (randomMass[j] % 2 != 1) // Понятнее было бы, указав что Вы хотите ==0. Но ОК
//                sum++;
//
//        }
//        System.out.print("Количество чётных чисел - " + sum);

        /**
         * 3. Создайте массив из 8 случайных целых чисел из отрезка [1;10].
         * Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
         * Снова выведете массив на экран на отдельной строке.
         */

//        Random random = new Random();
//        int[] randomMass = new int[8];
//        for (int i = 0; i < randomMass.length; i++) {
//            randomMass[i] = random.nextInt(10)+1;
//            System.out.print(randomMass[i] + " ");
//        }
//        {
//            System.out.println();
//        }
//
//        for (int j = 0; j < randomMass.length; j++) {
//            if (randomMass[j] % 2 != 0) // нечётным индексом!!! не значением!!!
//                randomMass[j] = 0;
//
//            System.out.print(randomMass[j] + " ");
//        }

        /**
         * 4. Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
         * выведите массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов каждого массива
         * и сообщите, для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
         */

//        Random random1 = new Random();
//        int arraySize = 5;
//        int[] randomMass1 = new int[arraySize];
//        int sum1 = 0;
//        for (int i = 0; i < randomMass1.length; i++) {
//            randomMass1[i] = random1.nextInt(5);
//            sum1 +=  randomMass1[i];
//            System.out.print(randomMass1[i] + " ");
//        }
//        int average1 = sum1 / arraySize;
//        {
//            System.out.println();
//        }
//        Random random2 = new Random();
//        int[] randomMass2 = new int[arraySize];
//        int sum2 = 0;
//        for (int i = 0; i < randomMass2.length; i++) {
//            randomMass2[i] = random2.nextInt(5);
//            sum2 = sum2 + randomMass2[i];
//            System.out.print(randomMass2[i] + " ");
//        }
//        int average2 = sum2 / arraySize;
//        {
//            System.out.println();
//        }
//        if (average1 > average2)
//            System.out.print("Среднее арифметическое первого массива больше");
//        if (average1 < average2)
//            System.out.println("Среднее арифметическое второго массива больше");
//        if (average1 == average2)
//            System.out.println("Среднее арифметическое массивов равны");

/**
 * 5. Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
 * Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
 */

//        int n0 = 1;
//        int n1 = 1;
//        int n2;
//        System.out.print(n0 + " " + n1 + " ");
//        for (int i = 3; i <= 20; i++) {
//            n2 = n0 + n1;
//            System.out.print(n2 + " ");
//            n0 = n1;
//            n1 = n2;
//        }
//        System.out.println(); 

        /**
         * 6. Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
         * Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
         */

//        Random random = new Random();
//        int arraySize = 12;
//        int[] randomMass = new int[arraySize];
//        for (int i = 0; i < randomMass.length; i++) {
//            randomMass[i] = random.nextInt(31) + (-15);
//            System.out.print(randomMass[i] + " ");
//        }
//        int Max = randomMass[0];
//        int index = 0;
//        for (int i = randomMass.length - 1; i >= 0; i--) {
//            if (randomMass[i] > Max) {
//                Max = randomMass[i];
//                index = i;
//            }
//        }
//        {
//            System.out.println();
//        }
//        System.out.print("Максимальное число " + Max + ", индекс числа " + index);

        /**
         * 7. Создайте два массива из 10 целых случайных чисел из отрезка [1;9]
         * и третий массив из 10 действительных чисел.
         * Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента
         * из первого массива с i-ым индексом к элементу из второго массива с i-ым индексом.
         * Вывести все три массива на экран (каждый на отдельной строке),
         * затем вывести количество целых элементов в третьем массиве.
         */

//        int arraySize = 10;
//        int[] randomMass1 = new int[arraySize];
//        int[] randomMass2 = new int[arraySize];
//        double[] randomMass3 = new double[arraySize];
//
//        for (int i = 0; i < randomMass1.length; i++) {
//            randomMass1[i] = (int) (Math.random() * 9 + 1);
//            randomMass2[i] = (int) (Math.random() * 9 + 1);
//            randomMass3[i] = Math.round((double) randomMass1[i] / (double) randomMass2[i] * 100.0) / 100.0;
//            System.out.print("\t"+ randomMass1[i] + " ");
//            System.out.print("\t"+ randomMass2[i] + " ");
//            System.out.print("\t"+ randomMass3[i] + "\n");
//        }
//        int wholeNumbers = 0;
//        for (int i = 0; i < randomMass3.length; i++)
//            if (randomMass3[i] % 1 == 0) wholeNumbers++;
//        System.out.println("Количество целых элементов в третьем массиве: " + wholeNumbers);


        /**
         8. Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку.
         Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
         Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
         */

//        Random random = new Random();
//        int count_a = 0;
//        int count_b = 0;
//        int count_c = 0;
//        int arraySize = 11;
//        int[] randomMass = new int[arraySize];
//        for (int i = 0; i < randomMass.length; i++) {
//            randomMass[i] = random.nextInt(3) + (-1);
//            System.out.print(randomMass[i] + " ");
//            if (randomMass[i] == -1)
//                count_a++;
//            else if (randomMass[i]==0)
//                count_b++;
//            else
//                count_c++;
//        }
//        System.out.println();
//        if (count_a==count_b)
//            System.out.println();
//        if (count_a==count_c)
//            System.out.println();
//        if (count_c==count_b)
//            System.out.println();
//        else if (count_a > count_b && count_a > count_c)
//            System.out.println("Чаще всего встречаются отрицательные числа -  " + count_a);
//        else if (count_b > count_a && count_b > count_c)
//            System.out.println("Чаще всего встречаются нули -  " + count_b);
//        else
//            System.out.println("Чаще всего встречаются положительные числа -  " + count_c);

        /**
         9. Пользователь должен указать с клавиатуры чётное положительное число, а программа должна создать массив
         указанного размера из случайных целых чисел из [-5;5] и вывести его на экран в строку.
         После этого программа должна определить и сообщить пользователю о том,
         сумма модулей какой половины массива больше: левой или правой, либо сообщить, что эти суммы модулей равны.
         Если пользователь введёт неподходящее число, то программа должна требовать повторного ввода до тех пор,
         пока не будет указано корректное значение.
         */

        Random random = new Random();
        int x;
        boolean flag, overZero;
        int sumLeft = 0;
        int sumRight = 0;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите четное положительное число:");
            x = sc.nextInt();

            if (x > 0) {
                overZero = true;
            } else {
                overZero = false;
                System.out.println("Число должно быть больше нуля!");
            }

            if (x % 2 == 0) {
                flag = true;
            } else {
                flag = false;
                System.out.println("Число должно быть четным.");
            }
        }
        while (!(flag && overZero));
        int arraySize = x;
        int[] randomMass = new int[arraySize];
        for (int i = 0; i < randomMass.length; i++) {
            randomMass[i] = random.nextInt(11) + (-5);
            System.out.print(randomMass[i] + " ");

        }
        {
            System.out.println();
        }

        for (int i = 0; i < randomMass.length / 2; i++) {
            sumLeft += Math.abs(randomMass[i]);

        }
        for (int j = randomMass.length - 1; j >= randomMass.length / 2; j--) {
            sumRight += Math.abs(randomMass[j]);
        }
        if (sumLeft > sumRight)
            System.out.print("Сумма элементов слева больше и = " + sumLeft);
        if (sumLeft < sumRight)
            System.out.print("\n" + "Сумма элементов справа больше и = " + sumRight);
        else
            System.out.println("\n" + "Суммы равны");
    }
}



