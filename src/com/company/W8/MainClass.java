package com.company.W8;

public class MainClass {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Dog dog = new Dog();

        System.out.println();

        animal.sleeps();
        animal.eats();

        bird.sleeps();
        bird.eats();

        dog.sleeps();
        dog.eats();

        Animal a1 = new Dog();
        Animal a2 = new Bird();

        a1.eats();
        a2.sleeps();
    }
}
