package w9_Aircraft;

import java.util.ArrayList;

public class Flight {

    ArrayList<Flight> flights = new ArrayList<>();

    private String numberOfFlight;
    private String aviaCompany;
    private double price;
    private long distance;
    //private ArrayList<>aircraft;

    public Flight (String numberOfFlight, String aviaCompany, double price, long distance, ArrayList<Flight>aircraft){
        setNumberOfFlight(numberOfFlight);
        setAviaCompany(aviaCompany);
        setPrice(price);
        setDistance(distance);
        //setAircraft(aircraft);
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

    /*public ArrayList<Flight>getAircraft(){
        return aircraft;
    }*/

    public void setNumberOfFlight(String numberOfFlight){
        this.numberOfFlight = numberOfFlight;
    }

    public void setAviaCompany(String aviaCompany){
        this.aviaCompany = aviaCompany;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setDistance(long distance){
        this.distance = distance;
    }

   /* public void setAircraft(ArrayList<Flight> aircraft){
        this.aircraft = aircraft;
    }*/

    @Override
    public String toString(){
        return "Number of flight - "+numberOfFlight+ " \nAvia company - " + aviaCompany + "\nPrice - " + price + "\nDistance - " + distance;
    }
}
