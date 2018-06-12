package com.company.week8;

public class Dog extends Animal implements Eat, Sleep {

    public Dog() {
        System.out.println("A new dog has been created!");
    }

    @Override
    public void sleep() {
        System.out.println("A dog sleeps...");
    }

    @Override
    public void eat() {
        System.out.println("A dog eats...");
    }
}