package com.company.w9;

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
}
