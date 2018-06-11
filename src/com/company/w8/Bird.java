package w8;

public class Bird extends Animal{

    public Bird() {
        System.out.println("A new bird has been created!");
    }

    @Override
    public void eat() {
        System.out.println("A bird eats...");
    }

    @Override
    public void sleep() {
        System.out.println("A bird sleeps...");
    }
}
