package com.company.w5;

import java.util.ArrayList;
import java.util.Collections;

public class Marathon {
    public static void main(String[] args) {
        ArrayList<Sprinter> sprinters = new ArrayList<>();

        Sprinter sprinter1 = new Sprinter("A");
        sprinters.add(sprinter1);
        sprinters.add(new Sprinter("B"));
        sprinters.add(new Sprinter("C"));
        sprinters.add(new Sprinter("D"));

        for (Sprinter sprinter : sprinters) {
            System.out.println(sprinter.toString());
        }

        Collections.sort(sprinters);

        System.out.println("\nSorted by time\n");
        for (Sprinter sprinter : sprinters) {
            System.out.println(sprinter.toString()+"\n");
        }
    }
}
