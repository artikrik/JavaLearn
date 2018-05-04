package com.company.w2;

import java.util.Arrays;
import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        int size = 11;
        int[] mass = createArray(size);
        System.out.println(Arrays.toString(mass));
        Arrays.sort(mass);
        System.out.println(Arrays.toString(mass));
        biggestValueInArray(mass);
    }

    static int[] createArray(int size) {
        int[] mass = new int[size];
        Random random = new Random(8);
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(3) - 1;
        }
        return mass;
    }

    static void biggestValueInArray(int[] mass) {
        int tmp = mass[0], tmp2 =mass[0], tmp3 = mass[0];
        int increment1 = 0, increment2 = 0, increment3 = 0;

        int i = 0;
        while (tmp == mass[i]) {i++; increment1++;}
        tmp2=mass[i];
        while(tmp2== mass[i]) {i++; increment2++;}
        tmp3=mass[i];
        while( i < mass.length) { i++; increment3++;}

        //   System.out.println(increment1 + " " + increment2+ " " + increment3);
        if (increment1 > increment2 && increment1 > increment3) {
            System.out.println("элемент "+tmp+" встречается в массиве ="+increment1+" раз");
        } else if (increment2 > increment1 && increment2 > increment3) {
            System.out.println("элемент "+tmp2+" встречается в массиве ="+increment2+" раз");
        } else if (increment3 > increment1 && increment3 > increment1) {
            System.out.println("элемент "+tmp3+" встречается в массиве ="+increment3+" раз");
        }
    }
}
