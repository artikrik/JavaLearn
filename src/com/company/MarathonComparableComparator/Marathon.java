package com.company.MarathonComparableComparator;

public class Marathon implements Comparable<Marathon> {
    private String name;
    private long timeInMins;

    public Marathon (){ }

    public Marathon (String name, long timeInMins) {
        setName(name);
        setTimeInMins(timeInMins);
    }

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    public void setTimeInMins(long timeInMins) { this.timeInMins = timeInMins; }

    public long getTimeInMins() { return timeInMins; }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", timeInMins=" + timeInMins +
                '}';
    }

    @Override
    public int compareTo(Marathon o) { return (int) (this.timeInMins - o.getTimeInMins()); }
}
