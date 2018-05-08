package w3;

import java.util.Arrays;
import java.util.Scanner;


public class BinarySearchInt {
    public static void main(String[] args) {

        int digit;
        Scanner scan = new Scanner(System.in);
        int[] mass = new int[19];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (1 + 100 * Math.random());
        }
        Arrays.sort(mass);
        System.out.println(Arrays.toString(mass));

        System.out.println("enter item need to be find");
        digit = scan.nextInt();

        int index = -1;
        int start = 0;
        int end = mass.length - 1;
        int position = 0;

        while (start <= end) {
            position = (start + end) / 2;
            if (mass[position] == digit) {
                index = mass[position];
                break;
            } else if (mass[position] > digit) {
                end = position - 1;
            } else if (mass[position] < digit) {
                start = position + 1;
            }

        }
        if (index == -1) {
            System.out.println("item can't be found in this array");
        } else {
            System.out.println("item has been found under index " + position);

        }
    }
}
