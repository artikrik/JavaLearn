package w8_Animals;

public class Animal {

    private String eat;
    private String sleep;

    public Animal(String eat, String sleep) {
        setEat(eat);
        setSleep(sleep);
        System.out.println("A new animal has been created!....");
    }

    public void setEat(String eat) {
        this.eat = eat;
        System.out.println("An animal eats... ");
    }

    public void setSleep(String sleep) {
        this.sleep = sleep;
        System.out.println("An animal sleeps... ");
    }

    public String getEat() {
        return eat;
    }

    public String getSleep() {
        return sleep;
    }
}