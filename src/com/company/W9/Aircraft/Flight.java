package com.company.W9.Aircraft;

public class Flight {

    private String flightNumber;
    private String airline;
    private int priceTicket;
    private int distance;
    private String maker;
    private String model;

    public Flight(String flightNumber, String airline, int priceTicket, int distance, Maker maker, Model model){
        setFlightNumber(flightNumber);
        setAirline(airline);
        setPriceTicket(priceTicket);
        setDistance(distance);
        this.maker=maker.getMaker();
        this.model=model.getModel();
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void setPriceTicket(int priceTicket) {
        this.priceTicket = priceTicket;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public int getPriceTicket() {
        return priceTicket;
    }

    public int getDistance() {
        return distance;
    }

    public String getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", airline='" + airline + '\'' +
                ", priceTicket=" + priceTicket +
                ", distance=" + distance +
                ", maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                '}';
    }



}
