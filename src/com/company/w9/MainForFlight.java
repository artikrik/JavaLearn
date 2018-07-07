package com.company.w9;

import java.util.*;

public class MainForFlight {
    public static void main(String[] args) {
        Flight flyKL4103 = new Flight("KL4103", "British Airways", 500, AircraftType.AirbusA310, 871.00);
        Flight flyPS187 = new Flight("PS1807", "Ukraine  Airlines", 400, AircraftType.Boeing767, 220.00);
        Flight J26601 = new Flight("J26601", "Azerbaijan Airlines", 930, AircraftType.Embraer195, 550.00);
        Flight J26602 = new Flight("J26602", "Azerbaijan Airlines", 300, AircraftType.Embraer190, 550.00);

        FlightList flightList = new FlightList();
        flightList.addFlight(flyKL4103);
        flightList.addFlight(flyPS187);
        flightList.addFlight(J26601);
        flightList.addFlight(J26602);

        System.out.println("\n" + "Сортування вартості квитка");
        Collections.sort(flightList.getFlightArrayList(), Comparator.comparing(Flight::getPrice));
        flightList.printFlightList();

        System.out.println("\n" + "Сортування по відстані");
        Collections.sort(flightList.getFlightArrayList(), Comparator.comparing(Flight::getDistance));
        flightList.printFlightList();

        System.out.println("Сортування по авіакомпанії та вартості квітка");
        Collections.sort(flightList.getFlightArrayList(), Comparator.comparing(Flight::getAirline).thenComparing(Flight::getPrice));
        flightList.printFlightList();

        System.out.println("\n" + "Сортування відстані, виробнику та моделі");
        Collections.sort(flightList.getFlightArrayList(),
                         Comparator.comparing(Flight::getDistance).thenComparing(Flight::getPlaneFirm).thenComparing(Flight::getModel));
        flightList.printFlightList();
        // Search
        System.out.println("\n" + "Пошук даного по авікомпанії");
        Collections.sort(flightList.getFlightArrayList(), Comparator.comparing(Flight::getAirline));
        flightList.searchByAirline("Ukraine  Airlines");

        System.out.println("\n" + "Пошук даного по вартості квитка");
        Collections.sort(flightList.getFlightArrayList(), Comparator.comparing(Flight::getPrice));
        flightList.searchByPrice(500);
        // Remove
        System.out.println("\n" + "Видалення рейсу по номеру рейсу");
        flightList.remove("KL4103");
        System.out.println("\n" + "Видалення рейсу по типу літака");
        flightList.remove(AircraftType.AirbusA320);
        System.out.println();
        flightList.printFlightList();

    }
}
