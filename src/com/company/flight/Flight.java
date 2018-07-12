package com.company.flight;

public class Flight {
    private String flightNumber;
    private String company;
    private Plane plane;
    private Double price;
    private Double distance;

    public Flight(String flightNumber, String company, Plane plane, Double price, Double distance) {
        this.flightNumber = flightNumber;
        this.company = company;
        this.plane = plane;
        this.price = price;
        this.distance = distance;
    }

    public String getFlightNumber() { return flightNumber; }

    public Double getPrice() { return price; }

    public String getCompany() { return company; }

    public Plane getPlane() { return plane; }

    public Double getDistance() { return distance; }

    public String getPlaneName() {return getPlane().toString(); }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", company='" + company + '\'' +
                ", plane=" + plane +
                ", price=" + price +
                ", distance=" + distance +
                '}';
    }
}