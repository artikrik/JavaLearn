package w8;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal() {

            @Override
            public void eat() {
                System.out.println("An animal eats...");
            }

            @Override
            public void sleep() {
                System.out.println("An animal sleeps...");
            }
        };
        Bird bird = new Bird();
        Dog dog = new Dog();

        System.out.println(animal);

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
