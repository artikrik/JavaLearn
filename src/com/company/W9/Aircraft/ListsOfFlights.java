package com.company.W9.Aircraft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListsOfFlights {

    ArrayList<Flight> listsOfFlights = new ArrayList<>();

    public void addFlightToList(Flight flight) {
        listsOfFlights.add(flight);
    }

    public ArrayList<Flight> getListOfFlights() {
        return listsOfFlights;
    }

    public void compareToPriceofTicket() {
        Collections.sort(listsOfFlights, Comparator.comparing(Flight::getPriceTicket));
        System.out.println("Сортіровка по ціні-" + listsOfFlights);
    }

    public void compareToDistance() {
        Collections.sort(listsOfFlights, Comparator.comparing(Flight::getDistance));
        System.out.println("Сортіровка по відстані-" + listsOfFlights);
    }

    public void compareToAirlineAndPriceOfTicket() {
        Collections.sort(listsOfFlights, Comparator.comparing(Flight::getAirline).thenComparing(Flight::getPriceTicket));
        System.out.println("Сортіровка по афіакампанії і ціні-" + listsOfFlights);
    }

    public void compareToDistanceAndMakerAndModel() {
        Collections.sort(listsOfFlights, Comparator.comparing(Flight::getDistance).thenComparing(Flight::getMaker).thenComparing(Flight::getModel));
        System.out.println("Сортіровка по відстані і виробнику і моделі" + listsOfFlights);
    }

    public void findInformationByFlightNumber(String flightNumber) {
        boolean infaIsFinded = false;
        for (Flight flight : listsOfFlights) {
            if (flight.getFlightNumber().compareTo(flightNumber) == 0) {
                System.out.println("інфа по конкретному рейсу-" + flight.toString());
                infaIsFinded = true;
            }
        }
        if (infaIsFinded == false)
            System.out.println("рейса з таким номером нема");
    }

    public void findInformationByAirline(String airline) {
        boolean infaIsFinded = false;
        for (Flight flight : listsOfFlights) {
            if (flight.getAirline().compareTo(airline) == 0) {
                System.out.println("інфа по конкретній авіакомпанії-" + flight.toString());
                infaIsFinded = true;
            }
        }
        if (infaIsFinded == false)
            System.out.println("авіакомпанії з тако назвою нема");
    }

    public void findInformationByPrice(int price) {
        boolean infaIsFinded = false;
        for (Flight flight : listsOfFlights) {
            if (flight.getPriceTicket() == price) {
                System.out.println("інфа по конкретній вартості-" + flight.toString());
                infaIsFinded = true;
            }
        }
        if (infaIsFinded == false)
            System.out.println(" з такою вартістю квитка рейсів нема");
    }

    public void removeInfoByyFlightNumber(String flightNumber) {
        boolean infaIsFinded = false;
        for (Flight flight : listsOfFlights) {
            if (flight.getFlightNumber().compareTo(flightNumber) == 0) {
                listsOfFlights.remove(flight);
                System.out.println("інфа по конкретному рейсу видалена");
                infaIsFinded = true;
            }
        }
        if (infaIsFinded == false)
            System.out.println("рейса з таким номером нема");
    }

    public void removeInfoByTypeOfAirplane(String airline, String model) {
        boolean infaIsFinded = false;
        for (Flight flight : listsOfFlights) {
            if ((flight.getAirline().compareTo(airline) == 0) || (flight.getModel().compareTo(model) == 0)) {
                listsOfFlights.remove(flight);
                System.out.println("інфа по конкретному типу літака видалена");
                infaIsFinded = true;
            }
        }
        if (infaIsFinded == false)
            System.out.println("рейса з таким типом літака нема");
    }

    public void compareFlightOnIdentical(ArrayList<Flight> first, ArrayList<Flight> second) {
        if(second.containsAll(first)){
            System.out.println("Набір входить");
        }
        else System.out.println("набір не входить");
    }
}


