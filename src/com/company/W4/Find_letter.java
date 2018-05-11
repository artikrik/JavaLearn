package com.company.W4;

import java.text.Collator;
import java.util.Random;
import java.util.Scanner;


public class Find_letter {

    public static void main(String[] args) {
        Random ran = new Random();
        char symbol = (char) (ran.nextInt(25) + 65);
        System.out.println(symbol+" для мене");
        int fail=compare(symbol);
        System.out.println("кількість ваших спроб "+fail);
    }

    public static int compare(char character) {
        Scanner scan = new Scanner(System.in);
        Collator collator = Collator.getInstance(new java.util.Locale("en", "US"));
        collator.setStrength(Collator.PRIMARY);
        System.out.println("Go!");
        int fail=0;
        char a;
        String с = String.valueOf(character);
        do {
            a = scan.next().charAt(0);
            if (a<'a' || a>'z'){
                if (a<'A'||a>'Z') {
                    System.out.println("Кінець, почитайте ше разок правила");
                    break;
                }
            }
            String b = String.valueOf(a);
            int result = collator.compare(b, с);
            if (result ==0){
                fail += 1;
                System.out.println("Вітаємо! Ви перемогли!");
                return fail;
            }
            if (result>0) {
                System.out.println("Дуже високо!");
                fail += 1;
            } else {
                System.out.println("Дуже низько!");
                fail += 1;
            }
        } while (a!=character);
        return fail;
    }
}
