package Auto2week;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] mass = new int[15];
        int counter = 0;
        Random random = new Random(1);
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(9)+1;
        }
        Arrays.sort(mass);
        System.out.println(Arrays.toString(mass));
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 0 || mass[i] % 2 == 0) {
                counter++;
            }
        }
        System.out.println();
        System.out.println("Количество парных чисел: " + counter);
    }
}
