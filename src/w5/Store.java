package w5;

import java.util.GregorianCalendar;
public class Store {
    public static void main(String[] args) {


        Wine wine = new Wine("NoName", "NoWhere", new GregorianCalendar(2000, 5, 23));



        System.out.println(wine.toString());

    }
}
