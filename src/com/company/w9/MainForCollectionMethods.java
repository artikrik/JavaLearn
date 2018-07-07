package com.company.w9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainForCollectionMethods {
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

        Flight flyKL4223 = new Flight("KL4223", "Wind Rose", 9990, AircraftType.Boeing747, 1066.00);
        Flight flyPS1888 = new Flight("PS1888", "Air Baltic", 4880, AircraftType.Boeing737, 1440.00);
        Flight flyJ26699 = new Flight("J26699", "Bravo Airways", 4430, AircraftType.AirbusA330, 1990.00);
        Flight flyJ36677 = new Flight("J26677", "El Al - Israel Airlines", 3500, AircraftType.AirbusA320, 1660.00);
        FlightList flightList2 = new FlightList();
        flightList2.addFlight(J26602);//совпадение с flightList
        flightList2.addFlight(flyKL4223);
        flightList2.addFlight(flyPS1888);
        flightList2.addFlight(flyJ26699);
        flightList2.addFlight(flyJ36677);

        System.out.println();
        Set<Flight> setContain = new HashSet<>(flightList.getFlightArrayList());
        if (setContain.containsAll(flightList2.getFlightArrayList())) {
            System.out.println("1. набір L1 входить в набір L2");
        } else System.out.println("1. набір L1 не входить в набір L2");

        System.out.print("2. Перевірити на рівність два набори L1 і L2");
        checkListsAreEquals(flightList, flightList2);

        System.out.println("\n" + "3. Додати в кінець набору L1 всі елементи набору L2");
        flightList.addAll(flightList2);
        flightList.printFlightList();

        System.out.println();
        System.out.println("4. Набір L, включивши в нього по одному разу елементи, які входять хоча б в один з наборів L1 і L2");
        union(flightList, flightList2);

        //Новые колекции
        FlightList flightList3 = new FlightList();
        FlightList flightList4 = new FlightList();
        flightList3.addFlight(flyKL4223);
        flightList3.addFlight(flyJ26699);
        flightList3.addFlight(flyPS1888);
        flightList4.addFlight(flyPS1888);//совпадение с flightList3
        flightList4.addFlight(flyJ36677);

        System.out.println();
        System.out.println("5. Oб'єднати два упорядкованих набори L1 і L2 в один впорядкований набір L (впорядкування за Вашим бажанням)");
        Set<Flight> set = new TreeSet<>(Comparator.comparing(Flight::getPrice));
        set.addAll(flightList3.getFlightArrayList());
        set.addAll(flightList4.getFlightArrayList());
        for (Flight flight : set) {
            System.out.println(flight.toString());
        }

        List<Flight> common = new ArrayList<>(flightList3.getFlightArrayList());
        common.retainAll(flightList4.getFlightArrayList());
        System.out.println();
        System.out.println("6. The common in two collections:");
        for (Flight flight : common) {
            System.out.println(flight.toString());
        }
    }

    public static void checkListsAreEquals(FlightList flightList, FlightList flightList2) {
        if (Collections.disjoint(flightList.getFlightArrayList(), flightList2.getFlightArrayList()))
            System.out.print(". Набори L1 і L2 не рівні");
        else System.out.print(". Набори L1 і L2 рівні");
    }

    public static void union(FlightList f1, FlightList f2) {
        HashSet<Flight> union = new HashSet<>(f1.getFlightArrayList());
        union.remove(f2.getFlightArrayList());
        union.addAll(f2.getFlightArrayList());
        //для наглядности отсортировал
        List<Flight> sortList = new ArrayList<>(union);
        Collections.sort(sortList, Comparator.comparing(Flight::getId));
        Iterator<Flight> iterator = sortList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
