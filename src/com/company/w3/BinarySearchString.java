package com.company.w3;

import java.util.Arrays;

public class BinarySearchString {
    public static void main(String[] args) {
        String keyWord="BMW"; // переменная для поиска слова
        String[] mass= {"Skoda", "Opel", "Lada", "Daewoo", "Suzuki", "Honda", "Mazda", "BMW", "Citroen", "Porshe", "Mustang", "Hyundai"};
        System.out.println("Searching element has index " + binarySearchString(mass, keyWord) + " in the array");
    }
    static int binarySearchString(String mass[], String key){// не предусмотрен выход на случай отсутствующего данного. Зависнет!
        Arrays.sort(mass);
        System.out.println(Arrays.toString(mass));
        int begin = 0;
        int end = mass.length - 1;
        int middle = (mass.length - 1) / 2;
        while (begin <= end ) {
            middle=begin+(end-begin)/2;
            if (key.compareTo(mass[middle])==0) return middle;
            else if (key.compareTo(mass[middle])>0) {
                begin = middle+1;
            } else {
                end = middle;
            }
        }
        return middle;
    }
}


