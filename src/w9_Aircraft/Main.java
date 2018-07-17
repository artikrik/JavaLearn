package w9_Aircraft;

public class Main {
    public static void main(String args[]) {

        ListOfFlight listOfFlight = new ListOfFlight();

        listOfFlight.add(new Flight("KL4103", "BritishAirways", 333, 5000, Aircraft.Airbus, Aircraft.Model.A310));
        listOfFlight.add(new Flight("KL4103", "BritishAirways", 555, 3000, Aircraft.Airbus, Aircraft.Model.A320));
        listOfFlight.add(new Flight("KL4103", "BritishAirways", 666, 40000, Aircraft.Airbus, Aircraft.Model.A330));
        /*flight1.add(new Flight("KL4103", "BritishAirways", 562, 12000, Aircraft.Boing, Aircraft.Model.B737));
        flight1.add(new Flight("KL4103", "BritishAirways", 111, 32000, Aircraft.Boing, Aircraft.Model.B747));
        flight1.add(new Flight("KL4103", "BritishAirways", 1000, 98000, Aircraft.Boing, Aircraft.Model.B767));
        flight1.add(new Flight("KL4103", "BritishAirways", 5698, 57000, Aircraft.Boing, Aircraft.Model.B777));
        flight1.add(new Flight("KL4103", "BritishAirways", 152, 8000, Aircraft.Embraer, Aircraft.Model.E175));
        flight1.add(new Flight("KL4103", "BritishAirways", 112, 8884, Aircraft.Embraer, Aircraft.Model.E190));
        flight1.add(new Flight("KL4103", "BritishAirways", 458, 12548, Aircraft.Embraer, Aircraft.Model.E195));*/

        System.out.println("Sort by price");
        listOfFlight.sortByPrice();
        System.out.println();
        System.out.println("Sort by Distance");
        listOfFlight.sortByDistance();
        System.out.println();
        System.out.println("Sort by AviaCompanyAndPrice");
        listOfFlight.sortByAviaCompanyAndPrice();
        System.out.println();
        System.out.println("Sort by AircraftAndModel");
        listOfFlight.sortByAircraftAndModel();
    }
}
