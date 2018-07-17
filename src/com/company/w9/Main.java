package w9;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static final Comparator<Flight> PRICE_COMPARATOR = (o1, o2) -> o1.getPrice() - o2.getPrice();
    public static final Comparator<Flight> DISTANCE_COMPARATOR = (o1, o2) -> o1.getDistance() - o2.getDistance();


    public static void main(String[] args) {
        ArrayList<Flight> list = new ArrayList<>();
        Collections.sort(list, PRICE_COMPARATOR);
    }
}
