package com.company.w6.marathon;

import java.util.ArrayList;
import java.util.Arrays;

public class Race {
    public static void main(String[] args) {

        ArrayList<Marathon> raceOfMarathon = new ArrayList<>(Arrays.asList(addMembersToRace()));
        console(raceOfMarathon, raceOfMarathon.size()); // вывод всех участников марафона
        raceOfMarathon.sort(Marathon::compareTo);
        System.out.println("\nПобедители марафона:\n");
        console(raceOfMarathon, 3);
    }

    public static void console(ArrayList<Marathon> list, int numberOfLines) {
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
