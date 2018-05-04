package com.company.w2;

import java.util.Arrays;
import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        Random random = new Random(4);
        int[][] mass = new int[10][random.nextInt(3) + 3]; // Не универсально, но Вы пощупали массив!)
        createArray(mass);
        int[] bigValueOfMass = biggestValueOfArrayLine(mass);  // создаем одномерный масив из  найбольших значений строки 2-мерного масива
        System.out.println("Самые большие значения в каждой строке масива "+Arrays.toString(bigValueOfMass));
        int smallValueOfArray = smallestValueOfArrayLine(bigValueOfMass); // находим найменьшее значення 1-мерного масива
        System.out.println("Наименьшее значение среди самых больших значений масива = "+smallValueOfArray);

    }

    static void createArray(int[][] mass) {
        Random random = new Random(9);
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = random.nextInt(51) + 10;
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[] biggestValueOfArrayLine(int[][] mass) {
        int[] massTmp = new int[mass.length];
        for (int i = 0; i < mass.length; i++) {
            massTmp[i] = mass[i][0];
            for (int j = 0; j < mass[i].length; j++) {
                if (mass[i][j] >= massTmp[i]) {
                    massTmp[i] = mass[i][j];
                }
            }
        }
        return massTmp;
    }

    static int smallestValueOfArrayLine(int[] mass) {
        int massTmp = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < massTmp) {
                massTmp = mass[i];
            }
        }
        return massTmp;
    }
}


