package w8_Animals;

public class Dog extends Animal {

    public Dog(String eat, String sleep) {
        super(eat,sleep);
        System.out.println("A new dog has been created!....");
    }

    @Override
    public void setEat (String eat){
        super.setEat(eat);
        System.out.println("A dog eats... " + getEat());
    }

    @Override
    public void setSleep (String sleep){
        super.setSleep(sleep);
        System.out.println("A dog sleeps... " + getSleep());
    }
}