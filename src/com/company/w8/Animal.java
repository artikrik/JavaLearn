package w8;

public abstract class Animal {
    private String eat;
    private String sleep;

    public Animal() {
        System.out.println("A new animal has been created!");
    }

    public abstract void eat(); {}

    public abstract void sleep(); {}
}
