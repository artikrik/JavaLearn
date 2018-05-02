package w3;

import java.util.Arrays;

public class linearSearchString {
    public static void main(String[] args) {
        String findWord = "Porshe";
        String[] mass= {"Skoda", "Opel", "Lada", "Daewoo", "Suzuki", "Honda", "Mazda", "BWV", "Citroen", "Porshe", "Mustang"};
        System.out.println(Arrays.toString(mass));
        System.out.println("Searching element "+linearSearch(mass, findWord));
    }

    static String linearSearch(String[] mass, String key){
        for (int i = 0; i <mass.length ; i++) {
            if (mass[i].equals(key)) return  "is present at the index "+i;
        }
        return "is absent in the array";
    }
}
