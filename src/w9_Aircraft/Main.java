package w9_Aircraft;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String args[]) {

        Flight fl1 = new Flight("KL4103", "BritishAirways", 335, 5000, Aircraft.Airbus, Model.A320);
        Flight fl2 = new Flight("KL4117", "BritishAirways", 333, 1000, Aircraft.Boing, Model.A310);
        Flight fl3 = new Flight("KL4112", "BritishAirways", 152, 10000, Aircraft.Embraer, Model.E175);

        ListOfFlight lof1 = new ListOfFlight();
        lof1.addFlight(fl1);
        lof1.addFlight(fl2);
        lof1.addFlight(fl3);

        System.out.println("Sort by price");
        //lof1.sortByPrice();

        System.out.println("\nSort by Distance");
        //lof1.sortByDistance();

        System.out.println("\nSort by AviaCompanyAndPrice");
        //lof1.sortByAviaCompanyAndPrice();

        System.out.println("\nSort by AircraftAndModel");
        //lof1.sortByAircraftAndModel();

        System.out.println("\nSort by aircraft name");
        //lof1.sortByAirkraftName();

        System.out.println("\nShowAircraftSerialNumber");
        //lof1.showAircraftSerialNumber();

        System.out.println("\nSearch by ByNumberOfFlight");
        //lof1.searchByNumberOfFlight("KL4105");

        System.out.println("\nSearch by ByPrice");
        //lof1.searchByPrice(374);

        System.out.println("\nRemove flight by number");
        //lof1.removeFlightByNumber("KL4103");


        Flight fl4 = new Flight("KL4103", "BritishAirways", 335, 5000, Aircraft.Airbus, Model.A320);
        Flight fl5 = new Flight("KL4133", "BritishAirways", 333, 7000, Aircraft.Airbus, Model.A310);
        Flight fl6 = new Flight("KL4112", "BritishAirways", 152, 10000, Aircraft.Embraer, Model.E175);

        ListOfFlight lof2 = new ListOfFlight();
        lof2.addFlight(fl4);
        lof2.addFlight(fl5);
        lof2.addFlight(fl6);

        List<Flight> l1 = lof1.getFlightsArrayList();
        List<Flight> l2 = lof2.getFlightsArrayList();

        System.out.println("\nCompare contains elements flightList1 and flightList2");
        if (l1.equals(l2)) {
            //System.out.println("Flight lists contains the same amount of elements");
        } else
            //System.out.println("Flight lists are different");


            System.out.println("\nCompare flightList1 and flightList2");
        if ((l1.size() == l2.size()) && (l1.equals(l2))) {
            //System.out.println("Lists are the same");
        } else
            //System.out.println("Lists are different");


            System.out.println("\nAdd list2 to the end of list1");
        //l1.addAll(l2);
        //System.out.println("List2 was added to the end of list1");


        System.out.println("\nCreate list including once element from list1 and list2");
        List<Flight> tmp = new ArrayList<>(lof1.getFlightsArrayList());
        //tmp.remove(lof2.getFlightsArrayList());
        //tmp.addAll(lof2.getFlightsArrayList());
        //System.out.println(tmp);


        System.out.println("\nUnite each sorted list in one sorted list (sorted by number of flight)");
        List<Flight> unitedLists = new ArrayList<>();
        //unitedLists.addAll(l1);
        //unitedLists.addAll(l2);
        //unitedLists.sort(Comparator.comparing(Flight::getNumberOfFlight));
        System.out.println(unitedLists.toString());


        System.out.println("\nCreate list including once element which enter simultaneously in both lists");
        tmp.retainAll(lof2.getFlightsArrayList());
        for (Flight flight : tmp) {
            System.out.println(flight.toString());
        }

    }
}