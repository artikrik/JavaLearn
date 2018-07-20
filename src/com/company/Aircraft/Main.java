package com.company.Aircraft;

public class Main {
    public static void main(String[] args) {

        Flights f1 = new Flights("1", "Ukraine", "Airbus", "A220",
                                 75, 800);
        Flights f2 = new Flights("2", "Russia", "Boeing", "B717",
                                 150, 1200);
        Flights f3 = new Flights("3", "Canada", "National", "ТУ204",
                                 500, 3000);

        FlightsList L1 = new FlightsList();
        L1.addFlightToList(f1);
        L1.addFlightToList(f2);
        L1.addFlightToList(f3);

        System.out.println(f1 + "\n" +
                                   f2 + "\n" +
                                   f3 + "\n");

    }
}
