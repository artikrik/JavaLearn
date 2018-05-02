package week3;

import java.util.Arrays;
import java.util.Random;

public class linearSearchNum {
    public static void main(String[] args) {
        int num=83;
        int[] mass=new int[20];
        Random random = new Random(8);
        for (int i = 0; i <mass.length ; i++) {
            mass[i]=random.nextInt(100);
        }
        System.out.println("Searching element "+linSearch(mass, num));
    }

    static String linSearch( int[] mass, int num){

        System.out.println(Arrays.toString(mass));
        for (int i = 0; i <mass.length ; i++) {
            if (mass[i]==num) return "is present at the index "+i;
        }
        return "is absent in the array";
    }
}
