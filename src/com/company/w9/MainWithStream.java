package com.company.w9;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainWithStream {
    public static void main(String[] args) {

        Flight flyKL4123 = new Flight("KL4103", "British Airways", 500, AircraftType.AirbusA310, 871.00);
        Flight flyPS180 = new Flight("PS1807", "Poland  Airlines", 400, AircraftType.Boeing767, 220.00);
        Flight J26601 = new Flight("J26601", "Germany Airlines", 930, AircraftType.Embraer195, 550.00);
        Flight J26602 = new Flight("J26602", "Azerbaijan Airlines", 300, AircraftType.Embraer190, 550.00);

        FlightList flightList = new FlightList();
        flightList.addFlight(flyKL4123);
        flightList.addFlight(flyPS180);
        flightList.addFlight(J26601);
        flightList.addFlight(J26602);

        Flight flyKL4223 = new Flight("KL4223", "Wind Rose", 9990, AircraftType.Boeing747, 1066.00);
        Flight flyPS1888 = new Flight("PS1888", "Air Baltic", 4880, AircraftType.Boeing737, 1440.00);
        Flight flyJ26699 = new Flight("J26699", "Bravo Airways", 4430, AircraftType.AirbusA330, 1990.00);
        Flight flyJ36677 = new Flight("J26677", "El Al - Israel Airlines", 3500, AircraftType.AirbusA320, 1660.00);

        FlightList flightList2 = new FlightList();
        FlightList flightList3 = new FlightList();

        flightList2.addFlight(J26602);//совпадение с flightList
        flightList2.addFlight(flyKL4223);
        flightList2.addFlight(flyPS1888);
        flightList2.addFlight(flyJ26699);
        flightList2.addFlight(flyJ36677);
        flightList3.addAll(flightList2);
        flightList3.addFlight(flyKL4123);

        System.out.println();
        sortedByDistance(flightList2);
        System.out.println();
        sortedByPrice(flightList2);
        System.out.println();
        sortedByAirlineAndPriceOfTicket(flightList2);
        System.out.println();
        sortedByDistanceAndPlaneFirmAndModel(flightList2);
        System.out.println();
        searchByAirLine(flightList2, "Bravo Airways");
        System.out.println();
        searchByFlightNumber(flightList2, "J26677");
        System.out.println();
        searchByPrice(flightList2, 9990);
        System.out.println();
        removeById(flightList2, "J26677");
        removeByPlaneFirm(flightList2, "uiui");

        List list3 = identicalObjectsFromTwoLists(flightList, flightList2);
        printFlightList(list3, "сформувати набір L, включивши в нього по одному разу елементи, які входять хоча б в один з наборів L1 і L2");
        List list4 = uniteTwoListByPrice(flightList, flightList2);
        printFlightList(list4, "об'єднати два упорядкованих набори L1 і L2 в один впорядкований набір L (впорядкування за ціною)");
        List list5 = uniqueObjectsFromTwoLists(flightList, flightList2);
        printFlightList(list5, "сформувати набір L, включивши в нього по одному разу елементи, які входять одночасно в обидва набори L1 і L2.");
        List list6 = uniteTwoList(flightList, flightList2);
        printFlightList(list6, "додати в кінець набору L1 всі елементи набору L2");
        listsAreEquals(flightList, flightList2);
        listContainAnotherList(flightList3, flightList2);
    }

    public static void sortedByDistance(FlightList flightList) {
        List<Flight> l1 = flightList.getFlightArrayList().stream().sorted((o1, o2) -> Double.compare(o1.getDistance(), o2.getDistance())).collect(Collectors.toList());
        printFlightList(l1, "Сортування по відстані");
    }

    public static void sortedByPrice(FlightList flightList) {
        List<Flight> l1 = flightList.getFlightArrayList().stream().sorted((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice())).collect(Collectors.toList());
        printFlightList(l1, "Сортування по вартості квитка");
    }

    public static void sortedByAirlineAndPriceOfTicket(FlightList flightList) {
        List<Flight> l1 = flightList.getFlightArrayList().stream()
                .sorted(Comparator.comparing(Flight::getAirline).thenComparing(Flight::getPrice))
                .collect(Collectors.toList());
        printFlightList(l1, "Сортування по авіакомпанії та вартості квитка");
    }

    public static void sortedByDistanceAndPlaneFirmAndModel(FlightList flightList) {
        List<Flight> l1 = flightList.getFlightArrayList().stream()
                .sorted(Comparator.comparing(Flight::getDistance).thenComparing(Flight::getPlaneFirm).thenComparing(Flight::getModel))
                .collect(Collectors.toList());
        printFlightList(l1, "Сортування по відстані, виробнику та моделі");
    }

    public static void searchByAirLine(FlightList flightList, String airline) {
        List<Flight> list = flightList.getFlightArrayList().stream().filter(flight -> flight.getAirline().equals(airline)).collect(Collectors.toList());
        if (list.isEmpty()) System.out.println("Рейс відстуній з такою авіалінією ");
        else printFlightList(list, "Знайдено рейс з такою авіалінією " + airline);
    }

    public static void searchByFlightNumber(FlightList flightList, String flightNumber) {
        List<Flight> list = flightList.getFlightArrayList().stream().filter(flight -> flight.getId().equals(flightNumber)).collect(Collectors.toList());
        if (list.isEmpty()) System.out.println("Рейс відстуній з таким номером рейсу ");
        else printFlightList(list, "Знайдено рейс з таким номером рейсу " + flightNumber);
    }

    public static void searchByPrice(FlightList flightList, double price) {
        List<Flight> list = flightList.getFlightArrayList().stream().filter(flight -> flight.getPrice() == price).collect(Collectors.toList());
        if (list.isEmpty()) System.out.println("Рейс відстуній з такою ціною ");
        else printFlightList(list, "Знайдено рейс з такою ціною " + price);
    }

    public static void removeById(FlightList flightList, String flightNumber) {
        List<Flight> list = flightList.getFlightArrayList().stream()
                .filter(o -> !o.getId().equals(flightNumber)).collect(Collectors.toList());
        if (list.size() == flightList.getFlightArrayList().size())
            System.out.println("рейс з таким номером відсутній");
        else {
            flightList.clear();
            for (Flight flight : list) {
                flightList.addFlight(flight);
            }
            System.out.println(flightNumber + " рейс був видалений");
        }
    }

    public static void removeByPlaneFirm(FlightList flightList, String planeFirm) {
        List<Flight> list = flightList.getFlightArrayList().stream()
                .filter(o -> !o.getPlaneFirm().equals(planeFirm)).collect(Collectors.toList());
        if (list.size() == flightList.getFlightArrayList().size())
            System.out.println("рейс з таким типом літака відсутній");
        else {
            flightList.clear();
            for (Flight flight : list) {
                flightList.addFlight(flight);
            }
            System.out.println(planeFirm + " рейс був видалений");
        }
    }


    public static void printFlightList(List<Flight> list, String word) {
        ListIterator<Flight> iterator = list.listIterator();
        System.out.println(word);
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

    public static void printFlightList(List<Flight> list) {
        ListIterator<Flight> iterator = list.listIterator();
        System.out.println();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

    public static List identicalObjectsFromTwoLists(FlightList list1, FlightList list2) {
        return Stream.concat(list1.getFlightArrayList().stream(), list2.getFlightArrayList().stream()).distinct().collect(Collectors.toList());
    }

    public static List uniteTwoListByPrice(FlightList list1, FlightList list2) {
        return Stream.concat(list1.getFlightArrayList().stream(), list2.getFlightArrayList().stream()).sorted(Comparator.comparing(Flight::getPrice)).collect(Collectors.toList());
    }

    public static List uniqueObjectsFromTwoLists(FlightList list1, FlightList list2) {
        List<Flight> list = list1.getFlightArrayList().stream().filter(list2.getFlightArrayList()::contains).collect(Collectors.toList());
        return list;
    }

    public static List uniteTwoList(FlightList list1, FlightList list2) {
        return Stream.concat(list1.getFlightArrayList().stream(), list2.getFlightArrayList().stream()).collect(Collectors.toList());
    }

    public static void listsAreEquals(FlightList list1, FlightList list2) {
        boolean contain = list1.getFlightArrayList().stream().allMatch(o -> list2.getFlightArrayList().contains(o));
        if (contain && list1.getFlightArrayList().size() == list2.getFlightArrayList().size())
            System.out.println("два набори L1 і L2 рівні");
        else System.out.println("два набори L1 і L2 не рівні");
    }

    public static void listContainAnotherList(FlightList list1, FlightList list2) {
        boolean isEquals = list1.getFlightArrayList().stream().anyMatch(o -> list2.getFlightArrayList().contains(o));
        if (isEquals) System.out.println("набір L1 входить в набір L2");
        else System.out.println("набір L1 не входить в набір L2");
    }
}
