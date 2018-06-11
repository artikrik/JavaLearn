package w8_Animals;

public class Bird extends Animal {

    public Bird(String eat, String sleep) {
        super(eat,sleep);
        System.out.println("A new bird has been created!....");
    }

    @Override
    public void setEat(String eat) {
        super.setEat(eat);
        System.out.println("A bird eats... " + getEat());
    }

    @Override
    public void setSleep (String sleep){
        super.setSleep(sleep);
        System.out.println("A bird sleeps... " + getSleep());
    }
}
