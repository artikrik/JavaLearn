package com.company.W4;

import java.io.IOException;
import java.text.Collator;
import java.util.Random;
import java.util.Scanner;


public class Find_letter {

    public static void main(String[] args) {
        Random ran = new Random();
        char symbol = (char) (ran.nextInt(25) + 65);
        System.out.println(symbol + " для мене");
        int fail = compare(symbol);
        System.out.println("кількість ваших спроб " + fail);
    }

    public static int compare(char character) {
        Scanner scan = new Scanner(System.in);
        Collator collator = Collator.getInstance(new java.util.Locale("en", "US"));
        collator.setStrength(Collator.PRIMARY);
        System.out.println("Go!");
        int fail = 0;
        char a;
        String с = String.valueOf(character);
        int result = 0;
        do {
            a = scan.next().charAt(0);
            fail += 1;
            try {
                if ((a < 'A') || (a > 'Z' && a < 'a') || (a > 'z'))
                    throw new IOException("Не EN буква!");
                String b = String.valueOf(a);
                result = collator.compare(b, с);
                if (result > 0)
                    throw new IOException("Дуже високо!");
                else if (result<0)
                    throw new IOException("Дуже низько!");
            } catch (IOException i) {
                System.out.println(i.getMessage());
            }
        } while (result != 0);
        System.out.println("Ви перемогли!");
        return fail;
    }
}
