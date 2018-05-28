package com.company.w6.marathon;
import java.time.LocalTime;
import java.util.Random;

public class Marathon implements Comparable<Marathon> {
    private String name;
    private String lastName;
    private int age;
    private LocalTime runTime;

    public Marathon(String name, String lastName, int age) {
        setName(name);
        setLastName(lastName);
        setAge(age);
        setRunTime();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalTime getRunTime() {
        return runTime;
    }

    public void setRunTime() {
        this.runTime = randomTimeOfRace();
    }

    public LocalTime randomTimeOfRace() {
        return LocalTime.MIN.plusSeconds(new Random().nextLong());
    }

    @Override
    public String toString() {
        return "Marathon{" + "name=" + name + ", lastName=" + lastName + ", age=" + age + ", runTime=" + runTime + '}';
    }

    public int compareTo(Marathon marathon) {
        return this.runTime.compareTo(marathon.getRunTime());
    }
}
