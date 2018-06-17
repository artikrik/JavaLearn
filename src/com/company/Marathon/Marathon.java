package com.company.Marathon;

public class Marathon implements Comparable<Marathon> {
    private String name;
    private int runningTime;

    public Marathon(String name, int runningTime) {
        setName(name);
        setRunningTime(runningTime);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }

    public String getName(){
        return name;
    }

    public int getRunningTime() {
        return runningTime;
    }

    @Override
    public int compareTo(Marathon i){
        if (getName().compareTo(i.getName()) != 0)
            return getName().compareTo(i.getName());
        else
            return getRunningTime() - i.getRunningTime();
    }

    @Override
    public String toString() {
        return "Marathon {" + "name = " + name + ", time " + runningTime + " min" + '}';
    }
}
