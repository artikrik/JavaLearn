package w9;


import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        FlightList flightList = new FlightList();

        flightList.addFlight(new Flight("KL 4203", "British Airlines", 1000, 50, PlaneType.EMBRAER3));
        flightList.addFlight(new Flight("ML 4203", "Lufthansa", 10, 5, PlaneType.BOEING1));
        flightList.addFlight(new Flight("DL 4203", "Mao", 100, 5000, PlaneType.AIRBUS2));

        flightList.printByDistance();

    }
}
