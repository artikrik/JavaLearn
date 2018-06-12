package com.company.W6.MarathonComparableAndComparator;

public class Sportsmen implements Comparable<Sportsmen> {
    private String name;
    private int seconds;


    public static void main(String[] args) {

    }

    public Sportsmen(String name, int seconds) {
        setName(name);
        setSeconds(seconds);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public String toString() {
        return name +"\n" ;
    }

    @Override
    public int compareTo(Sportsmen o) {
        if (this.name.compareTo(o.getName()) != 0)
            return this.getName().compareTo(o.getName());
        else
            return this.getSeconds() - o.getSeconds();
    }
}
