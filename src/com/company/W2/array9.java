package com.company.W2;

import java.util.Random;
import java.util.Scanner;

public class array9 {
    public static void main(String[] args) {
        int sumleft = 0;
        int sumright = 0;
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("укажіть парне додатнє число");
        do {
            a = scan.nextInt();
            if (a % 2 != 0 || a < 1)
                System.out.println("не правильне число, введіть ще раз");
        } while (a < 1 || a % 2 != 0);
        int[] x = new int[a];
        Random r = new Random();
        int j;
        for (j = 0; j < x.length; j++) {
            x[j] = r.nextInt(11) - 5;
            System.out.print(x[j] + " ");
            if (j < x.length / 2)
                sumleft += Math.abs(x[j]);
            else sumright += Math.abs(x[j]);
        }
        System.out.println(" ");
        System.out.println(sumleft);
        System.out.println(sumright);
        if (sumleft > sumright)
            System.out.println("Сума модулів лівої частини більша і =" + sumleft);
        if (sumright > sumleft)
            System.out.println("Сума модулів правої частини більша і =" + sumright);
        if (sumright == sumleft)
            System.out.println("Сума модулів правої частини і лівої рівні");
    }
}

