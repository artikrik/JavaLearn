package w9_Aircraft;

import java.util.ArrayList;

public class Flight {

    ArrayList<Flight> flights1 = new ArrayList<>();

    private String numberOfFlight;
    private String aviaCompany;
    private double price;
    private long distance;

    public Flight (String numberOfFlight, String aviaCompany, double price, long distance){
        this.numberOfFlight = numberOfFlight;
        this.aviaCompany = aviaCompany;
        this.price = price;
        this.distance = distance;
    }

    public String getNumberOfFlight(){
        return numberOfFlight;
    }

    public String getAviaCompany(){
        return aviaCompany;
    }

    public double getPrice(){
        return price;
    }

    public long getDistance(){
        return distance;
    }

    @Override
    public String toString(){
        return "Number of flight - "+ numberOfFlight
                + "\nAvia company - " + aviaCompany
                + "\nPrice - " + price
                + "\nDistance - " + distance;
    }
}