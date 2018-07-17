package w9_Aircraft;

public class Main {
    public static void main(String args[]) {

        ListOfFlight listOfFlight = new ListOfFlight();

        listOfFlight.addNewFlight(new Flight("KL4107", "BritishAirways", 333, 5000, Aircraft.Airbus, Model.A310));
        //listOfFlight.addNewFlight(new Flight("KL4103", "BritishAirways", 555, 3000, Aircraft.Airbus, Model.A320));
        //listOfFlight.addNewFlight(new Flight("KL4103", "BritishAirways", 666, 40000, Aircraft.Airbus, Model.A330));
        //listOfFlight.addNewFlight(new Flight("KL4103", "BritishAirways", 562, 12000, Aircraft.Boing, Model.B737));
        listOfFlight.addNewFlight(new Flight("KL4108", "BritishAirways", 111, 32000, Aircraft.Boing, Model.B747));
        //listOfFlight.addNewFlight(new Flight("KL4103", "BritishAirways", 1000, 98000, Aircraft.Boing, Model.B767));
        //listOfFlight.addNewFlight(new Flight("KL4103", "BritishAirways", 5698, 57000, Aircraft.Boing, Model.B777));
        listOfFlight.addNewFlight(new Flight("KL4102", "BritishAirways", 152, 8000, Aircraft.Embraer, Model.E175));
        //listOfFlight.addNewFlight(new Flight("KL4103", "BritishAirways", 112, 8884, Aircraft.Embraer, Model.E190));
        //listOfFlight.addNewFlight(new Flight("KL4103", "BritishAirways", 458, 12548, Aircraft.Embraer, Model.E195));

        /*System.out.println("Sort by price");
        listOfFlight.sortByPrice();

        System.out.println("\nSort by Distance");
        listOfFlight.sortByDistance();

        System.out.println("\nSort by AviaCompanyAndPrice");
        listOfFlight.sortByAviaCompanyAndPrice();

        System.out.println("\nSort by AircraftAndModel");
        listOfFlight.sortByAircraftAndModel();
*/
        System.out.println("\nSearch by ByNumberOfFlight");
        listOfFlight.searchByNumberOfFlight("KL4105");

        System.out.println("\nSearch by ByPrice");
        listOfFlight.searchByPrice(374);

        System.out.println("\nRemove flight by number");
        listOfFlight.removeFlightByNumber("KL4102");
    }
}
