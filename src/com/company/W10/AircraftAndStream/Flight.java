package com.company.W10.AircraftAndStream;

public class Flight {

    private String flightNumber;
    private String airline;
    private int priceTicket;
    private int distance;
    private String maker;
    private String model;

    public Flight(String flightNumber, String airline, int priceTicket, int distance, Maker maker, Model model) {
        setFlightNumber(flightNumber);
        setAirline(airline);
        setPriceTicket(priceTicket);
        setDistance(distance);
        this.maker = maker.getMaker();
        this.model = model.getModel();
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

    @Override
    public boolean equals(Object that){
        if(this == that) return true;// якщо оба мають однаковий адрес в пам'яті
        if(!(that instanceof Flight)) return false; // якщо не Flight
        Flight thatFlight = (Flight) that; // каст до нашого класу, щоб визивати методи
        return this.flightNumber.equals(thatFlight.flightNumber) && this.airline.equals(thatFlight.airline) && this.distance==thatFlight.distance && this.getMaker().equals
                                                                                                                                                                 (thatFlight.getMaker()) && this.getModel().equals(thatFlight.getModel());
    }

}


