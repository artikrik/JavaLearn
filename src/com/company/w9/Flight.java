package com.company.w9;

public class Flight {
    private String id;
    private String airline;
    private double price;
    private Enum plane;
    private double distance;

    public String getAirline() {
        return airline;
    }

    public Flight(String id, String airline, double price, Enum plane, double distance) {
        this.id = id;
        this.airline = airline;
        this.price = price;
        this.plane = plane;
        this.distance = distance;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public Enum getPlane() {
        return plane;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", airline=" + airline  +
                ", price=" + price +
                ", plane=" + plane +
                ", distance=" + distance +
                '}';
    }
}
