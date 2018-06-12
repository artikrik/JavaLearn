package com.company.week8;

public class Bird extends Animal implements Eat, Sleep {

    public Bird() {
        System.out.println("A new bird has been created!");
    }

    @Override
    public void sleep() {
        System.out.println("A bird sleeps...");
    }

    @Override
    public void eat() {
        System.out.println("A bird eats...");
    }
}