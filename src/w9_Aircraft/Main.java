package w9_Aircraft;


import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {

        ArrayList<Flight> flight1 = new ArrayList<>();

        flight1.add(new Flight("KL4103", "BritishAirways",333, 5000,"Airbus","A310"));


        System.out.println(flight1.toString());
    }
}
