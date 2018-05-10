package com.company.W3;

import java.util.Arrays;
import java.util.Scanner;

public class Find_string_in_methods_binarny_7 {
    public static void main(String[] args) {

        String[] mas = {"море", "пляж", "риба", "чайка", "кит", "сонце"};
        Scanner find = new Scanner(System.in);
        System.out.println("введіть слово");
        String a = find.nextLine();
        int i;
        Arrays.sort(mas);
        System.out.println("відсортований масив:");
        for (i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        find(mas,a);
    }

    static void find(String[] masiv, String b) {
        int index = -1;
        int first = 0;
        int last = masiv.length - 1;
        while (first <= last) {
            int middle = (first + last) / 2;
            if (masiv[middle].equals(b)) {
                index = middle;
                break;
            } else if (b.compareTo(masiv[middle]) < 0) {
                last = middle - 1;
            } else {
                first = middle + 1;
            }
        }
        if (index > -1) {
            System.out.println(" ");
            System.out.println("індекс шуканого слова= " + index);
        } else {
            System.out.println(" ");
            System.out.println("такого слова нема");
        }
    }
}

