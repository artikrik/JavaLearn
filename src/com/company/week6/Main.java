package com.company.week6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Marathon> m = Marathon.fillListWithMarathonResults();
        Marathon.sortList(m);
        System.out.println("3 Marathon winners with the results: ");
        Marathon.printWinners(m);
    }
}
