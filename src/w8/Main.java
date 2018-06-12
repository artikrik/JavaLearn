package w8;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal.Bird bird = new Animal.Bird();
        Animal.Dog dog = new Animal.Dog();

        System.out.println();

        animal.sleep();
        animal.eat();

        bird.sleep();
        bird.eat();

        dog.sleep();
        dog.eat();

        Animal animalDog = new Animal.Dog();
        Animal animalBird = new Animal.Bird();

        animalDog.eat();
        animalBird.sleep();

    }
}
