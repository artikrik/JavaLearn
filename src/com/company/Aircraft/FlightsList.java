package com.company.Aircraft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FlightsList {

    ArrayList<Flights> flightsList = new ArrayList<>();

    public void addFlightToList(Flights flights) {
        flightsList.add(flights);
    }

    public ArrayList<Flights> getFlightsList() {
        return flightsList;
    }

    public void compareToPriceOfTicket() {
        Collections.sort(flightsList, Comparator.comparing(Flights::getTicketPrice));
        System.out.println("Сортировка по цене: " + flightsList);
    }

    public void compareToDistance() {
        Collections.sort(flightsList, Comparator.comparing(Flights::getDistance));
        System.out.println("сортировка по дистанции: " + flightsList);
    }

    public void compareToAirlineAndPriceOfTicket() {
        Collections.sort(flightsList, Comparator.comparing(Flights::getAirline)
                                                .thenComparing(Flights::getTicketPrice));
        System.out.println("Сортировка по авиакомпании и цене: " + flightsList);
    }

    public void compareToDistanceAndAirplaneBrandAndModel() {
        Collections.sort(flightsList, Comparator.comparing(Flights::getDistance)
                                                .thenComparing(Flights::getPlaneBrand)
                                                .thenComparing(Flights::getPlaneModel));
        System.out.println("Сортировка по дистанции, бренду и модели: " + flightsList);
    }

    public void cruiseNumberInfo(String cruiseNumberInfo) {
        boolean infoFind = false;
        for (Flights flights : flightsList) {
            if (flights.getCruiseNumber().compareTo(cruiseNumberInfo) == 0) {
                System.out.println("Информация по рейсу: " + flights.toString());
                infoFind = true;
            }
        }
        if (infoFind == false)
            System.out.println("Такого номера рейса не найдено");
    }

    public void airlineInfo(String airlineInfo) {
        boolean infoFind = false;
        for (Flights flights : flightsList) {
            if (flights.getAirline().compareTo(airlineInfo) == 0) {
                System.out.println("Информация по авиакомпании: " + flights.toString());
            }
        }
        if (infoFind == false)
            System.out.println("Такая авиакомпания не найдена");
    }

    public void priceInfo(int priceInfo) {
        boolean infoFind = false;
        for (Flights flights : flightsList) {
            if (flights.getTicketPrice() == priceInfo) {
                System.out.println("Информация по цене: " + flights.toString());
            }
        }
        if (infoFind == false)
            System.out.println("Билеты с такой стоимостью не найдены");
    }

    public void deleteCruiseNumber(String cruiseNumberInfo) {
        boolean infoFind = false;
        for (Flights flights : flightsList) {
            if (flights.getCruiseNumber().compareTo(cruiseNumberInfo) == 0) {
                flightsList.remove(flights);
                System.out.println("Информация по рейсу удалена");
                infoFind = true;
            }
        }
        if (infoFind == false)
            System.out.println("Такого рейса не найдено");
    }

    public void deleteAirplaneInfo(String airline, String model) {
        boolean infoFind = false;
        for (Flights flights : flightsList) {
            if (flights.getAirline().compareTo(airline) == 0
                    || (flights.getPlaneModel().compareTo(model) == 0)) {
                flightsList.remove(flights);
                System.out.println("Информация по данной модели самолёта удалена");
            }
        }
        if (infoFind == false)
            System.out.println("Такая марка самолёта не найдена");
    }

    public void compareFlightForEverythingInAnotherFlight(ArrayList<Flights> first, ArrayList<Flights> second) {
        if (first.containsAll(second)) {
            System.out.println("Набор входит");
        } else
            System.out.println("Набор не входит");
    }

    public void verifyOnEqualityFlights(ArrayList<Flights> first, ArrayList<Flights> second) {
        if (first.size() == second.size() && (first.containsAll(second))) {
            System.out.println("Наборы равны");
        } else
            System.out.println("Наборы не равны");
    }

    public void addElementsOneToOneFlights(ArrayList<Flights> first, ArrayList<Flights> second) {
        first.addAll(second);
        System.out.println("Добавление элемента второго набора в конец первого" + first);
    }

    public ArrayList<Flights> deleteListWithSomeElementsInTwoList(ArrayList<Flights> first, ArrayList<Flights> second) {
        ArrayList<Flights> tmp = new ArrayList<>();
        tmp.addAll(first);
        tmp.removeAll(second);
        tmp.addAll(second);
        return tmp;
    }

    public ArrayList<Flights> createListWithComparationDistanceWithTwoLists(ArrayList<Flights> first, ArrayList<Flights> second) {
        ArrayList<Flights> tmp = new ArrayList<>();
        tmp.addAll(first);
        tmp.addAll(second);
        Collections.sort(tmp, Comparator.comparing(Flights::getDistance));
        return tmp;
    }

    public ArrayList<Flights> createListIdenticalElemetsWithTwoLists(ArrayList<Flights> first, ArrayList<Flights> second) {
        ArrayList<Flights> tmp = new ArrayList<>();
        tmp.addAll(first);
        tmp.addAll(second);
        tmp.retainAll(second);
        return tmp;
    }
}
