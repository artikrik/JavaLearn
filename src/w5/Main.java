package w5;


import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        Wine wine1 = new Wine("Shabodun","France",new GregorianCalendar(2000, 4, 12));
        
        System.out.println(wine1.toString());
    }
}
