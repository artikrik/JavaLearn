package com.company.w9;

public class Flight {
    private String id;
    private String airline;
    private double price;
    private String model;
    private String planeFirm;
    private double distance;


    public Flight(String id, String airline, double price, AircraftType airCraft,  double distance) {
        this.id = id;
        this.airline = airline;
        this.price = price;
        this.model = airCraft.getModel();
        this.planeFirm=airCraft.getManufacturer();
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
        return model;
    }
    public String getPlaneFirm() {
        return planeFirm;
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
                ", plane=" + planeFirm+
                ", model=" + model+
                ", distance=" + distance;
    }
}
