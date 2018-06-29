package com.company.w9;

public class MainForFlight {
    public static void main(String[] args) {
        Flight flyKL4103= new Flight("KL4103", "British Airways", 500, Boeing.B737, 871.00 );
        Flight flyPS187= new Flight("PS1807", "Ukraine  Airlines", 400,Airbus.A310, 550.00 );
        Flight J26601= new Flight("J26601", "Azerbaijan Airlines", 930,Embraer.E175, 550.00 );
        Flight J26602= new Flight("J26602", "Azerbaijan Airlines", 300,Embraer.E175, 220.00 );

        FlightList flightList = new FlightList();
        flightList.addFlight(flyKL4103);
        flightList.addFlight(flyPS187);
        flightList.addFlight(J26601);
        flightList.addFlight(J26602);

        System.out.println("Сортування по авіакомпанії та вартості квітка");
        flightList.sortByAirLineByNameOrByDistance();
        flightList.printFlightList();

        System.out.println("\n"+"Сортування по відстані");
        flightList.sortByDistance();
        flightList.printFlightList();

        System.out.println("\n"+"Сортування вартості квитка");
        flightList.sortByPrice();
        flightList.printFlightList();

        System.out.println("\n"+"Сортування відстані, виробнику та моделі");

    }
}
