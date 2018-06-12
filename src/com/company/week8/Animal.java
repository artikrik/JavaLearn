package com.company.week8;

public class Animal implements Eat, Sleep {

    public Animal(){
        System.out.println("A new animal has been created!");
    }

    public void sleep() {
        System.out.println("An animal sleeps...");
    }

    public void eat() {
        System.out.println("An animal eats...");
    }
}
