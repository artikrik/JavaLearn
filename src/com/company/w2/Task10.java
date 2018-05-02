package Auto2week;

import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        int[][] mass = new int[10][5];
        createArray(mass);
        biggestSmallerValueOfArray(mass);

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

    static void biggestSmallerValueOfArray(int[][] mass) {
        for (int i = 0; i < mass.length; i++) {
            int tmp = 0, tmpSmaller = 100;
            for (int j = 0; j < mass[i].length; j++) {
                if (tmp < mass[i][j]) tmp = mass[i][j];
                if (tmpSmaller > mass[i][j]) tmpSmaller = mass[i][j];
            }
            System.out.println(" biggest N=" + tmp + "; smallest N=" + tmpSmaller + " in the " + i + " row.");
        }
    }
}

