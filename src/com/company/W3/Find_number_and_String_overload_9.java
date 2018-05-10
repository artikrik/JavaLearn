package com.company.W3;

import java.util.Random;
import java.util.Scanner;

public class Find_number_and_String_overload_9 {
    public static void main(String[] args) {

        String[] mas = {"море", "пляж", "риба", "чайка", "кит", "сонце"};
        Scanner find = new Scanner(System.in);
        System.out.println("введіть слово");
        String a = find.nextLine();
        int i;
        for (i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println(" ");
        find(mas,a);

        Random r = new Random();
        int[] m = new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("введіть число від 1 до 20 для пошуку в масиві");
        int b = scan.nextInt();
        for (i = 0; i < mas.length; i++) {
            m[i] = r.nextInt(12);
            System.out.print(m[i]+" ");
        }
        find(m,b);
    }

    static void find(String[] masiv, String b) {
        int index=-1;
        for (int i = 0; i < masiv.length; ++i) {
            if (masiv[i].equals(b)) {
                index=i;
                System.out.println("його індекс="+i);
            }
        }
        if (index==-1)System.out.println("такого слова нема");
    }

    static void find(int[] masiv, int b){
        int index=-1;
        for (int i = 0; i < masiv.length; i++)
            if (masiv[i]==b) {
                b = masiv[i];
                index = i;
            }
        if (index>=0) {
            System.out.println(" ");
            System.out.println("індекс шуканого числа=" + index); // Аналогично
        }
        else {
            System.out.println(" ");
            System.out.println("такого числа нема");
        }
    }

}
