package w9_Aircraft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListOfFlight {
    private ArrayList<Flight> flightsArrayList = new ArrayList<>();


    public ArrayList<Flight> getFlightsArrayList() {
        return flightsArrayList;
    }

    public void add(Flight flight) {
        flightsArrayList.add(flight);
    }

    public void sortByPrice (){
        Collections.sort(getFlightsArrayList(), Comparator.comparing(Flight::getPrice));
        System.out.println(flightsArrayList);
    }

    public void sortByDistance(){
        Collections.sort(getFlightsArrayList(), Comparator.comparing(Flight::getDistance));
        System.out.println(flightsArrayList);
    }

    public void sortByAviaCompany(){
        Collections.sort(getFlightsArrayList(), Comparator.comparing(Flight::getAviaCompany));
        System.out.println(flightsArrayList);
    }

    public void sortByNumberOfFlight(){
        Collections.sort(getFlightsArrayList(), Comparator.comparing(Flight::getNumberOfFlight));
        System.out.println(flightsArrayList);
    }
}