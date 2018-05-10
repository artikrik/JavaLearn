package com.company.ForthTask;

import java.util.Scanner;

public class LineSearchStrings {
    public static void main(String[] args) {

        String[] mas = {"iPhone", "Samsung", "Nokia", "Xiaomi", "Meizu",
                "LG", "Huawei", "Asus", "Sony", "Motorola", "HTC", "1+"};
        Scanner find = new Scanner(System.in);
        System.out.println("Какой телефон вы ищите?");
        String a = find.nextLine();
        int i;
        int masIndex = -1;
        for (i = 0; i < mas.length; i++) {
            if (mas[i].equals(a)) {
                masIndex = i;
                System.out.println("Ваш телефон находится на полке с индексом: " + i);
            }
        }
        if (masIndex == -1)
            System.out.println("Такого телефона нет в наличии. SORRY :)");
    }
}
