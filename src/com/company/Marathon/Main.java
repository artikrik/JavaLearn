package com.company.Marathon;
//Денис Киметто, Элиуд Кипчёге, Уилсан Кипсанг, Патрик Макау, Стенли Бивотт

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Marathon> marathonRunners = new ArrayList<Marathon>();

        marathonRunners.add(new Marathon("Денис Киметто", 640));
        marathonRunners.add(new Marathon("Эливуд Кипчёге", 476));
        marathonRunners.add(new Marathon("Уилсан Кипсанг", 475));
        marathonRunners.add(new Marathon("Патрик Макау", 510));
        marathonRunners.add(new Marathon("Стенли Бивотт", 749));

        Collections.sort(marathonRunners);
        System.out.println(marathonRunners);

        Collections.sort(marathonRunners, new Comparator<Marathon>() {
            @Override
            public int compare(Marathon o1, Marathon o2) {
                return o1.getRunningTime() - o2.getRunningTime();
            }
        });

        System.out.println();
        System.out.println(marathonRunners.get(0));
        System.out.println(marathonRunners.get(1));
        System.out.println(marathonRunners.get(2));
    }
}
