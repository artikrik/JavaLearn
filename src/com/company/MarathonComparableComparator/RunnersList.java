package com.company.MarathonComparableComparator;

import java.util.ArrayList;
import java.util.Collections;

public class RunnersList extends Marathon {

    public static ArrayList<Marathon> fillListWithMarathonResults() {
        ArrayList<Marathon> m = new ArrayList<>();
        m.add(new Marathon("Inga",255));
        m.add(new Marathon("Inga",350));
        m.add(new Marathon("Alisa",275));
        m.add(new Marathon("Rimma",263));
        m.add(new Marathon("Alisa",215));
        return m;
    }

    public static void sortList(ArrayList<Marathon> m) { Collections.sort(m); }

    public static void printList (ArrayList<Marathon> RunnersList) {
        for (Marathon runner: RunnersList) {
            System.out.println(runner.toString());
        }
    }

    public static ArrayList<Marathon> findWinners (ArrayList<Marathon> marathonList) {
        int winnersQuantity = 3;
        ArrayList<Marathon> winnersList = new ArrayList<>();
        for (int i = 0; i < winnersQuantity; i++) {
            winnersList.add(marathonList.get(i));
        }
        return winnersList;
    }
}
