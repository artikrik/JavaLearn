package com.company.w9;

public class Flight {
    private String id;
    private String airline;
    private double price;
    private Enum planeProducer;
    private Enum modelOfPlane;

    public Enum getModelOfPlane() {
        return modelOfPlane;
    }

    private double distance;

    public String getAirline() {
        return airline;
    }

    public Flight(String id, String airline, double price, Enum planeProducer, Enum modelOfPlane, double distance) {
        this.id = id;
        this.airline = airline;
        this.price = price;
        this.planeProducer = planeProducer;
        this.modelOfPlane= modelOfPlane;
        this.distance = distance;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public Enum getPlaneProducer() {
        return planeProducer;
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
                ", planeProducer=" + planeProducer +
                ", modelOfPlane=" + modelOfPlane +
                ", distance=" + distance;
    }
}
