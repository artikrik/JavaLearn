package com.company.flight;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        FlightsInfo flights = addFlightsToSet();

        System.out.println("Sorted by Price:");
        printFlightsList(flights.sort(FlightsInfo.SORT_BY.PRICE));
        System.out.println("Sorted by Company and Price:");
        printFlightsList(flights.sort(FlightsInfo.SORT_BY.COMPANY_AND_PRICE));
        System.out.println("Sorted by Distance:");
        printFlightsList(flights.sort(FlightsInfo.SORT_BY.DISTANCE));
        System.out.println("Sorted by Distance and Plane:");
        printFlightsList(flights.sort(FlightsInfo.SORT_BY.DISTANCE_AND_PLANE));

        System.out.println("Find flight by company: ");
        printFlightsList(flights.findFlightByCompany("ok"));
        System.out.println("Find flight by flight number: ");
        printFlightsList(flights.findFlightByNumber("55"));
        System.out.println("Find flight by flight price: ");
        printFlightsList(flights.findFlightByPrice(5.99));

        flights.deleteFlightByNumber("122");
        System.out.println("After removal: ");
        flights.print();
        flights.deleteFlightByPlane("BOIENG");
        System.out.println("After removal: ");
        flights.print();
    }

    public static FlightsInfo addFlightsToSet() {
        FlightsInfo flights = new FlightsInfo();
        flights.addFlight(new Flight("222", "dss", new Plane(Producer.AIRBUS, Model.AIRBUS.A330),45.99, 150.00));
        flights.addFlight(new Flight("567", "ab", new Plane(Producer.AIRBUS, Model.AIRBUS.A320), 4.99, 10.00));
        flights.addFlight(new Flight("122", "ok", new Plane(Producer.BOIENG, Model.BOIENG.b767), 5.99, 150.00));
        flights.addFlight(new Flight("905", "ok", new Plane(Producer.BOIENG, Model.BOIENG.b737), 99.99, 70.00));
        flights.addFlight(new Flight("55", "dss", new Plane(Producer.AIRBUS, Model.AIRBUS.A310), 15.99, 10.00));
        return flights;
    }

    public static void printFlightsList(List<Flight> flights){
        for(Flight flight: flights){
            System.out.println(flight);
        }
    }
}