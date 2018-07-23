package com.company.Aircraft;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Flights f1 = new Flights("1", "Canada", "Airbus", "A220",
                                 75, 800);
        Flights f2 = new Flights("2", "Russia", "Boeing", "B717",
                                 150, 1200);
        Flights f3 = new Flights("3", "Ukraine", "National", "ТУ204",
                                 500, 3000);

        FlightsList L1 = new FlightsList();

        L1.addFlightToList(f1);
        L1.addFlightToList(f2);
        L1.addFlightToList(f3);

        /*System.out.println(f1 + "\n" +
                                   f2 + "\n" +
                                   f3 + "\n");*/

        L1.compareToPriceOfTicket();
        System.out.println();
        L1.compareToDistance();
        System.out.println();
        L1.compareToAirlineAndPriceOfTicket();
        System.out.println();
        L1.compareToDistanceAndAirplaneBrandAndModel();
        System.out.println();

        L1.cruiseNumberInfo("1");
        System.out.println();
        L1.airlineInfo("Ukraine");
        System.out.println();
        L1.priceInfo(10);
        System.out.println();


       /*L1.deleteCruiseNumber("1");
       L1.deleteAirplaneInfo("National", "ТУ204");*/


        FlightsList L2 = new FlightsList();
        Flights f11 = new Flights("12", "Austria", "Boeing", "B747",
                                  260, 750);
        Flights f22 = new Flights("13", "Israel", "Airbus", "A310",
                                  180, 1375);
        Flights f33 = new Flights("14", "Germany", "Boeing", "B737",
                                  340, 1437);

        L2.addFlightToList(f11);
        L2.addFlightToList(f22);
        L2.addFlightToList(f33);

        FlightsList compareList = new FlightsList();
        ArrayList<Flights> first = L1.getFlightsList();
        ArrayList<Flights> second = L2.getFlightsList();

        compareList.compareFlightForEverythingInAnotherFlight(first, second);
        System.out.println();
        compareList.verifyOnEqualityFlights(first, second);
        System.out.println();
        compareList.addElementsOneToOneFlights(first, second);
        System.out.println();

        ArrayList<Flights> L = compareList.deleteListWithSomeElementsInTwoList(first, second);
        System.out.println("сформувати набір L, включивши в нього по одному разу елементи, " +
                                   "які входять хоча б в один з наборів L1 і L2." + L);
        System.out.println();

        L = compareList.createListWithComparationDistanceWithTwoLists(first, second);
        System.out.println("об'єднати два упорядкованих набори L1 і L2 в один впорядкований" +
                                   " набір L (впорядкування за Вашим бажанням)." + L);
        System.out.println();

        L = compareList.createListIdenticalElemetsWithTwoLists(first, second);
        System.out.println("сформувати набір L, включивши в нього по одному разу елементи, " +
                                   "які входять одночасно в обидва набори L1 і L2." + L);
        System.out.println();


    }
}
