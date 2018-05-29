package com.company.W6.Marathon;

public class Sportsmen {

    private String name;
    private long seconds;



    public static void main(String[] args) {

    }

    public Sportsmen (String name, long seconds) {
        setName(name);
        setSeconds(seconds);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName (){
        return name;
    }


    public long getSeconds() {
        return seconds;
    }

    public void setSeconds(long seconds) {
        this.seconds = seconds;
    }

    public String toString() {
        return name+", seconds="+seconds+" \n";
    }
}

