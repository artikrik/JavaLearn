package com.company.w6.marathon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Race {
    public static void main(String[] args) {

        List<Marathon> raceOfMarathon = new ArrayList<>(Arrays.asList(addMembersToRace()));

        Collections.sort(raceOfMarathon, new MarathonComparator());
        console(raceOfMarathon, raceOfMarathon.size()); // вывод всех участников марафона

        System.out.println("\nПобедители марафона:\n");
        Collections.sort(raceOfMarathon);
        console(raceOfMarathon, 3);
    }

    public static void console(List<Marathon> list, int numberOfLines) {
        for (int i = 0; i < numberOfLines; i++) {
            System.out.println(list.get(i).toString());
        }
    }

    public static Marathon[] addMembersToRace() {
        Marathon runner1 = new Marathon("Vasya", "Pupkin", 30);
        Marathon runner2 = new Marathon("Katya", "Melnik", 21);
        Marathon runner3 = new Marathon("Elena", "Koval", 23);
        Marathon runner4 = new Marathon("Alex", "Borisov", 28);
        Marathon runner5 = new Marathon("Igor", "Lastochkin", 26);
        Marathon runner6 = new Marathon("Oleg", "Shevchuk", 27);
        return new Marathon[]{runner1, runner2, runner3, runner4, runner5, runner6};
    }
}
