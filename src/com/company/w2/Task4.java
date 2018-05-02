package Auto2week;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] massFirst = new int[5];
        int[] massSecond = new int[5];

        Random random = new Random(8);
        for (int i = 0; i < massFirst.length; i++) {
            massFirst[i] = random.nextInt(5)+1;
        }
        for (int i = 0; i < massSecond.length; i++) {
            massSecond[i] = random.nextInt(5)+1;
        }
        // Выводим и находим Среднее Арифметичное масивов
        out(massFirst);
        out(massSecond);
        arithmeticAverage(massFirst, massSecond);
    }

    public static void out(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "; ");
        }
        System.out.println();
    }

    public static void arithmeticAverage(int[] a, int[] b) {
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < a.length; i++) {
            sum +=a[i];
        }
        for (int i = 0; i < b.length; i++) {
            sum2 += b[i];
        }
        sum/=a.length;
        sum2/=b.length;

        if (sum > sum2) System.out.println("Среднее арифметическое элементов  1 массива больше");
        else if (sum < sum2) System.out.println("Среднее арифметическое элементов 2 массива больше");
        else System.out.println("Среднее арифметическое элементов каждого массива равны");
    }

}
