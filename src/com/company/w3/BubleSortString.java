package w3;

import java.util.Arrays;

public class BubleSortString {
    public static void main(String[] args) {
        String[] mass= {"Skoda", "Opel", "Lada", "Daewoo", "Suzuki", "Honda", "Mazda", "BWV", "Citroen", "Porshe", "Mustang", "Hyundai"};
        System.out.println(Arrays.toString(mass));
        bubleSort(mass);
        System.out.println(Arrays.toString(mass));

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
