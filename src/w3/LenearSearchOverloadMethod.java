package w3;

import java.util.Arrays;
import java.util.Random;


public class LenearSearchOverloadMethod {
    public static void main(String[] args) {
        String findWord = "Charlie";
        String[] stringAlphabet = {"Yankee", "November", "Alfa", "Lima", "Quebec", "Romeo", "Victor", "Whiskey", "Uniform", "Delta", "Bravo", "Mike",
                "Foxtrot",
                "Hotel", "X-ray", "Sierra", "Charlie", "Juliett", "Oscar", "Zulu", "Papa", "Golf", "Tango", "Echo", "India", "Kilo"};
        System.out.println(Arrays.toString( stringAlphabet));
        System.out.println("Искомый элемент "+Search( stringAlphabet, findWord));

        int num=3;
        int[] massNum=new int[10];
        Random random = new Random();
        for (int i = 0; i <massNum.length ; i++) {
            massNum[i]=random.nextInt(50);
        }
        System.out.println("Искомый элемент "+Search(massNum, num));

    }

    static String Search(String[] array, String arrayElement){
        for (int i = 0; i <array.length ; i++) {
            if (array[i].equals(arrayElement))
                return  "находится под индексом "+i;
        }
        return "отсутствует";
    }

    static String Search( int[] mass, int num){

        System.out.println(Arrays.toString(mass));
        for (int i = 0; i <mass.length ; i++) {
            if (mass[i]==num)
                return "находится под индексом  "+i;
        }
        return "отсутствует";
    }
}