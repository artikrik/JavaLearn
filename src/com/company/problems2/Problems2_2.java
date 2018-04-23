package com.company.problems2;

/*Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.*/

import java.util.Arrays;

public class Problems2_2 {

    private static final int[] ARR = new int[15];

    //проверка на четность
    private static boolean checkEvenVoid(int a) {
        boolean tr = false;
        if (a % 2 == 0 && a != 0) tr = true;
        return tr;
    }

    public static void main(String[] args) {

        for (int i = 0; i < ARR.length; i++) {
            ARR[i] = (int) (Math.random() * 9);
        }
        // Просто глянем наш массив
        System.out.println("ARR lenght = " + ARR.length + "\nArray:  " + Arrays.toString(ARR));

        //выведем четные
        for (int aARR : ARR) {
            //проверка
            //System.out.println(aARR + " ----> " + checkEvenVoid(aARR));
            //вывод
            if (checkEvenVoid(aARR))
                System.out.println(aARR);
        }

    }

}
