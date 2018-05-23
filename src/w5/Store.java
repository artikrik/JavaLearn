package w5;

import java.time.LocalDate;

public class Store {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2000, 5, 23);
        Wine wine = new Wine("NoName", "NoWhere", date);
        System.out.println(wine.toString());

    }
}
