package com.company.w9;

import java.util.Objects;

public class Flight {
    private String id;
    private String airline;
    private double price;
    private AircraftType aircraft;
    private double distance;


    public Flight(String id, String airline, double price, AircraftType airCraft,  double distance) {
        this.id = id;
        this.airline = airline;
        this.price = price;
        this.aircraft=airCraft;
        this.distance = distance;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getAirline() {
        return airline;
    }

    public String getModel() {
        return aircraft.getModel();
    }
    public String getPlaneFirm() {
        return aircraft.getManufacturer();
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", airline='" + airline + '\'' +
                ", price=" + price +
                ", plane=" + aircraft.getManufacturer()+
                ", model=" + aircraft.getModel()+
                ", distance=" + distance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, airline, aircraft.getModel(), aircraft.getManufacturer(), distance);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Flight)) {
            return false;
        }

        Flight otherFlight= (Flight) obj;
        if ( id.equals(otherFlight.getId()) && airline.equals(otherFlight.getAirline()) && price==otherFlight.getPrice() && aircraft.getModel().equals(otherFlight.aircraft.getModel()
        ) && aircraft.getManufacturer().equals(otherFlight.aircraft.getManufacturer()) && distance==otherFlight.getDistance()) return true;
        return false;
    }
}
