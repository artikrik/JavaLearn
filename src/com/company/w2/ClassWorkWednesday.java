package week2;

import java.util.Random;

public class ClassWorkWednesday {
    public static void main(String[] args) {
        // Random class and method
//        int number;
//        Random random=new Random(10);
//        for (int i=0;i<10;i++){
//            number =  random.nextInt(10000);
//            System.out.print(number+ "; ");
//        }

        // Масивы, работа с ними

        int[] a;
        int[] b = new int[8];
        Random random = new Random();

        for (int i = 0; i < b.length; i++) {
            b[i] = random.nextInt(20);
            System.out.println("a[" + i + "]=" + b[i]);
        }

        for (int i = 0; i < b.length; i++)
            System.out.println("a[" + i + "]=" + b[i]);

        int sum = 0;
        for (int i = 0; i < b.length; i++)
            sum += b[i];

        System.out.println("Сумма всех чисел=" + sum);
    }
}



