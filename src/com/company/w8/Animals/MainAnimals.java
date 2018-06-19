package com.company.w8.Animals;

public class MainAnimals {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Dog dog = new Dog();

        System.out.println();

        animal.sleep();
        animal.eat();

        bird.sleep();
        bird.eat();

        dog.sleep();
        dog.eat();

        Animal a1 = new Dog();
        Animal a2 = new Bird();

        a1.eat();
        a2.sleep();
    }

}

//
//        A new animal has been created!
//        A new animal has been created!
//        A new bird has been created!
//        A new animal has been created!
//        A new dog has been created!
//
//        An animal sleeps...
//        An animal eats...
//        A bird sleeps...
//        A bird eats...
//        A dog sleeps...
//        A dog eats...
//        A new animal has been created!
//        A new dog has been created!
//        A new animal has been created!
//        A new bird has been created!
//        A dog eats...
//        A bird sleeps...
