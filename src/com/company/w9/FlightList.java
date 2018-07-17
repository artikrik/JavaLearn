package w9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class FlightList {
    private List<Flight> flights = new ArrayList<>();

    public void printByPrice() {

    }
    public void printByDistance() {

    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public List<Flight> findByAirline(String airline) {

    }

    public void removeFlightByFlightNumber(String flightNumber) {

    }

    public boolean contains(FlightList flightList2) {
        Set<Flight> flightSet = new HashSet<>(this.flights);
        flightSet.retainAll(flightList2.flights);

        return flights.containsAll(flightList2.flights);
    }
}
