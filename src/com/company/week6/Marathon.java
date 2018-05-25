package com.company.week6;

import java.util.ArrayList;
import java.util.Collections;

public class Marathon implements Comparable<Marathon> {
    private String name;
    private long timeInMins;

    public Marathon (String name, long timeInMins) {
        setName(name);
        setTimeInMins(timeInMins);
    }

    public void setName(String name) { this.name = name; }

    public void setTimeInMins(long timeInMins) { this.timeInMins = timeInMins; }

    public long getTimeInMins() { return timeInMins; }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", timeInMins=" + timeInMins +
                '}';
    }

    public static ArrayList<Marathon> fillListWithMarathonResults() {
        ArrayList<Marathon> m = new ArrayList<>();
        m.add(new Marathon("Inga Li",255));
        m.add(new Marathon("Nick Ko",350));
        m.add(new Marathon("Lika Svo",275));
        m.add(new Marathon("Rimma Lo",263));
        m.add(new Marathon("Osvald Te",215));
        return m;
    }

    public static void sortList(ArrayList<Marathon> m) { Collections.sort(m); }

    @Override
    public int compareTo(Marathon o) { return (int) (this.timeInMins - o.getTimeInMins()); }

    public static void printWinners (ArrayList<Marathon> marathonList) {
        int winnersQuantity = 3;
        for (int i = 0; i < winnersQuantity; i++) {
            System.out.println(marathonList.get(i).toString());
        }
    }
}
