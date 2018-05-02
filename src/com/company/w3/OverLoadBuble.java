package w3;

import java.util.Arrays;
import java.util.Random;

public class OverLoadBuble {
    public static void main(String[] args) {
        String[] massWord= {"Skoda", "Opel", "Lada", "Daewoo", "Suzuki", "Honda", "Mazda", "BWV", "Citroen", "Porshe", "Mustang", "Hyundai"};
        System.out.println(Arrays.toString(massWord));
        bubleSort(massWord);
        System.out.println(Arrays.toString(massWord));

        int[] mass = new int[20];
        Random random = new Random(50);
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(mass));
        bubleSort(mass);
        System.out.println(Arrays.toString(mass));
    }

    static int[] bubleSort(int[] mass) {
        for (int i = mass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mass[j] > mass[j + 1]) {
                    int tmp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = tmp;
                }
            }
        }
        return mass;
    }

    static String[] bubleSort(String[] mass){
        for (int i = mass.length-1; i > 0; i--) {
            for (int j = 0; j <i ; j++) {
                if(mass[j].compareTo(mass[j+1]) > 0) {
                    String tmp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = tmp;
                }
            }
        }
        return mass;
    }
}
