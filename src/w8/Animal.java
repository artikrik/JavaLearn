package w8;

public class Animal {
    public Animal() {
        System.out.println("A new animal has been created!");
    }

    public void eat() {
        System.out.println("An animal eats...");
    }

    public void sleep() {
        System.out.println("An animal sleeps...");
    }
    static class Dog extends Animal {
        public Dog() {
            System.out.println("A new dog has been created!");
        }

        public void eat() {
            System.out.println("A dog eats...");
        }

        public void sleep() {
            System.out.println("A dog sleeps...");
        }

    }
    static class Bird extends Animal {
        public Bird() {
            System.out.println("A new bird has been created!");
        }

        public void eat() {
            System.out.println("A bird eats...");
        }

        public void sleep() {
            System.out.println("A bird sleeps...");
        }
    }

}

