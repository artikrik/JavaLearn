package w8_Animals;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("meal", "z-z-z-z");
        Bird bird = new Bird("corn", "fu-fu-fu");
        Dog dog = new Dog("meet", "tu-tu-tu");

        System.out.println();

        animal.getSleep();
        animal.getEat();

        bird.getSleep();
        bird.getEat();

        dog.getSleep();
        dog.getEat();

        Animal a1 = new Dog("bird", "zu-zu-zu");
        Animal a2 = new Bird("bred", "su-sus-su");

        a1.getEat();
        a2.getSleep();
    }
}
