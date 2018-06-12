package w8_Animals;

public class Dog extends Animal {

    public Dog() {
        System.out.println("A new dog has been created!....");
    }

    @Override
    public void eat (){
        System.out.println("A dog eats... ");
    }

    @Override
    public void sleep (){
        System.out.println("A dog sleeps... ");
    }
}