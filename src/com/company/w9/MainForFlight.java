package com.company.w9;

import java.util.Collections;

public class MainForFlight {
    public static void main(String[] args) {
        Flight flyKL4103 = new Flight("KL4103", "British Airways", 500, AircraftType.Boeing, Boeing.B777, 871.00);
        Flight flyPS187 = new Flight("PS1807", "Ukraine  Airlines", 400, AircraftType.Airbus, Airbus.A320, 220.00);
        Flight J26601 = new Flight("J26601", "Azerbaijan Airlines", 930, AircraftType.Embraer, Embraer.E195, 550.00);
        Flight J26602 = new Flight("J26602", "Azerbaijan Airlines", 300, AircraftType.Embraer, Embraer.E190, 550.00);

        FlightList flightList = new FlightList();
        flightList.addFlight(flyKL4103);
        flightList.addFlight(flyPS187);
        flightList.addFlight(J26601);
        flightList.addFlight(J26602);

        System.out.println("Сортування по авіакомпанії та вартості квітка");
        flightList.sortByAirLineNameThenByPrice();
        flightList.printFlightList();

        System.out.println("\n" + "Сортування по відстані");
        flightList.sortByDistance();
        flightList.printFlightList();

        System.out.println("\n" + "Сортування вартості квитка");
        flightList.sortByPrice();
        flightList.printFlightList();

        System.out.println("\n" + "Сортування відстані, виробнику та моделі");
        flightList.sortByDistanceByPlaneFirmByPlaneModel(); //сделать через внутр. классы
        flightList.printFlightList();

        System.out.println("\n" + "Пошук даного по номеру рейсу");
        flightList.searchByIdFlight("KL343433");

        System.out.println("\n" + "Пошук даного по номеру авікомпанії");
        flightList.searchByAirline("Ukraine  Airlines");

        System.out.println("\n" + "Пошук даного по вартості квитка");
        flightList.searchByPrice(500);

        System.out.println("\n" + "Видалення рейсу по номеру рейсу");
        flightList.remove("KL4103");
        System.out.println("\n" + "Видалення рейсу по типу літака");
        flightList.remove(Airbus.A320);
        System.out.println();
        flightList.printFlightList();


        Flight flyKL4223 = new Flight("KL4223", "Wind Rose", 9990, AircraftType.Boeing, Boeing.B747, 1066.00);
        Flight flyPS1888 = new Flight("PS1888", "Air Baltic", 4880, AircraftType.Boeing, Boeing.B777, 1440.00);
        Flight flyJ26699 = new Flight("J26699", "Bravo Airways", 4430, AircraftType.Airbus, Airbus.A330, 1990.00);
        Flight flyJ26655 = new Flight("J26655", "El Al - Israel Airlines", 3500, AircraftType.Airbus, Airbus.A320, 1660.00);
        FlightList flightList2 = new FlightList();
        flightList2.addFlight(flyKL4223);
        flightList2.addFlight(flyPS1888);
        flightList2.addFlight(flyJ26699);
        flightList2.addFlight(flyJ26655);

        checkListsAreEquals(flightList,flightList2);

        System.out.println("\n" +"Add all");
        flightList.addAll(flightList2);
        flightList.printFlightList();

    }

    public static void checkListsAreEquals(FlightList flightList,FlightList flightList2){
        System.out.print("Перевірити на рівність два набори L1 і L2");
        if (Collections.disjoint(flightList.getFlightArrayList(), flightList2.getFlightArrayList()) == true)
            System.out.print(". Набори L1 і L2 не рівні");
        else System.out.print(". Набори L1 і L2 рівні");
    }
}
