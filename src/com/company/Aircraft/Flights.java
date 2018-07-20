package com.company.Aircraft;

import java.util.ArrayList;

public class Flights {

    private String cruiseNumber;
    private String airline;
    private String planeBrand;
    private String planeModel;
    private int ticketPrice;
    private int distance;

    public Flights(String cruiseNumber, String airline, String planeBrand, String planeModel,
                   int ticketPrice, int distance) {
        setCruiseNumber(cruiseNumber);
        setAirline(airline);
        setPlaneBrand(planeBrand);
        setPlaneModel(planeModel);
        setTicketPrice(ticketPrice);
        setDistance(distance);
    }

    public void setCruiseNumber(String cruiseNumber) {
        this.cruiseNumber = cruiseNumber;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void setPlaneBrand(String planeBrand) {
        this.planeBrand = planeBrand;
    }

    public void setPlaneModel(String planeModel) {
        this.planeModel = planeModel;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getCruiseNumber() {
        return cruiseNumber;
    }

    public String getAirline() {
        return airline;
    }

    public String getPlaneBrand() {
        return planeBrand;
    }

    public String getPlaneModel() {
        return planeModel;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Номер рейса = " + cruiseNumber + "\n" +
                "airline = " + airline + "\n" +
                "Бренд = " + planeBrand + "\n" +
                "Модель самолёта = " + planeModel + "\n" +
                "цена билета = " + ticketPrice + "\n" +
                "Дистанция полёта = " + distance;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (!(that instanceof Flights)) return false;
        Flights thatFlights = (Flights) that;
        return this.cruiseNumber.equals(thatFlights.cruiseNumber)
                && this.airline.equals(thatFlights.airline)
                && this.distance == thatFlights.distance;
    }
}
