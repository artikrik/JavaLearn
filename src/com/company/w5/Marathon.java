package com.company.w5;

import java.util.ArrayList;
import java.util.Collections;

public class Marathon {
    public static void main(String[] args) {
        final int prizePlacesCount = 3;
        ArrayList<Sprinter> sprinters = new ArrayList<>();

        Sprinter sprinter1 = new Sprinter("A");
        sprinters.add(sprinter1);
        sprinters.add(new Sprinter("B"));
        sprinters.add(new Sprinter("C"));
        sprinters.add(new Sprinter("J"));
        sprinters.add(new Sprinter("k"));
        sprinters.add(new Sprinter("LLK"));
        sprinters.add(new Sprinter("FR"));
        sprinters.add(new Sprinter("LKGJ"));
        Collections.shuffle(sprinters);

        System.out.println("Sprinters:");
        for (Sprinter sprinter : sprinters) {
            System.out.println(sprinter.toString());
        }

        Collections.sort(sprinters);
        System.out.println(" ");
        for (int i = 0; i < prizePlacesCount; i++) {
            System.out.println((i + 1) + " place\n" + sprinters.get(i).toString() + "\n");
        }
    }
}
