package w9_Aircraft;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String args[]) {

        Flight fl1 = new Flight("KL4103", "BritishAirways", 333, 5000, Aircraft.Airbus, Model.A310);
        Flight fl2 = new Flight("KL4103", "BritishAirways", 333, 3000, Aircraft.Airbus, Model.A310);
        Flight fl3 = new Flight("KL4112", "BritishAirways", 152, 8000, Aircraft.Embraer, Model.E175);

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

        Flight fl4 = new Flight("KL4103", "BritishAirways", 333, 5000, Aircraft.Airbus, Model.A310);
        Flight fl5 = new Flight("KL4103", "BritishAirways", 333, 3000, Aircraft.Airbus, Model.A310);
        Flight fl6 = new Flight("KL4112", "BritishAirways", 152, 8000, Aircraft.Embraer, Model.E175);

        ListOfFlight lof2 = new ListOfFlight();
        lof2.addFlight(fl4);
        lof2.addFlight(fl5);
        lof2.addFlight(fl6);



        if (lof1.equals(lof2)) {
            System.out.println("the same");
        } else
            System.out.println("different");

    }
}