package com.company.W3;

import java.util.Scanner;
import java.util.Arrays;

public class Find_string_binarny_5 {
    public static void main(String[] args) {

        String[] mas = {"море", "пляж", "риба", "чайка", "кит", "сонце"};
        Scanner find = new Scanner(System.in);
        System.out.println("введіть слово");
        String a = find.nextLine();
        int i;
        int index = -1;
        Arrays.sort(mas);
        System.out.println("відсортований масив:");
        for (i = 0; i < mas.length; i++) {
            System.out.print(mas[i]+" ");
        }
        int first = 0;
        int last = mas.length-1;
        while (first<=last)  {
             int middle = (first + last) / 2;
             if (mas[middle].equals(a)) {
                 index = middle;
                 break;
            }
            else if (a.compareTo(mas[middle])<0) {
                last = middle - 1;
            }
            else {
                first=middle+1;
            }
        }
        if (index > -1) {
           System.out.println(" ");
            System.out.println("індекс шуканого слова = " + index);
        } else if (index == -1) {
            System.out.println(" ");
            System.out.println("такого слова нема");
        }
    }
}
