package w1;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = sc.nextInt();
//
//        //Первое решение с помощью сравнения с числом
//
//        if (x<10)
//            System.out.println("Число состоит из одного знака");
//        if (x >= 10 && x<100)
//            System.out.println("Число состоит из двух знаков");
//        if (x >= 100 && x<1000)
//            System.out.println("Число состоит из трех знаков");
//        if (x >= 1000 && x<10000)
//            System.out.println("Число состоит из четырех знаков");
//        if (x >= 10000 && x<100000)
//            System.out.println("Число состоит из пяти знаков");
//        if (x >= 100000 && x<1000000)
//            System.out.println("Число состоит из шести знаков");
//        if (x >= 1000000 && x<10000000)
//            System.out.println("Число состоит из семи знаков");
//        if (x >= 10000000 && x<100000000)
//            System.out.println("Число состоит из восьми знаков");
//        if (x >= 100000000 && x<1000000000)
//            System.out.println("Число состоит из девяти знаков");
//        else
//            System.out.println("Приближается переполнение int");
//
//        //Второе решение с помощью перебора в цикле делением на 10
//
//        int countOfNumbers = 0;
//        for ( ; x != 0 ; x /= 10)
//            ++countOfNumbers;
//        System.out.println("Вы ввели " + countOfNumbers + " знака(ов)");
//
//        //Третье решение с помощью строки

        System.out.println((x+"").length());

    }
}
