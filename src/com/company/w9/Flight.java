package w9;


public class Flight {
    private String flightNumber;
    private String airline;
    private PlaneType planeType;
    private int distance;
    private int tiсketPrice;

    public Flight(String flightNumber, String airline, int tiсketPrice, int distance, PlaneType planeType) {
        setFlightNumber(flightNumber);
        setAirline(airline);
        setPrice(tiсketPrice);
        setDistance(distance);
        setPlaneType(planeType);
    }


    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }

    public int getPrice() {
        return tiсketPrice;
    }

    public void setPrice(int price) {
        this.tiсketPrice = price;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (tiсketPrice != flight.tiсketPrice) return false;
        if (distance != flight.distance) return false;
        if (!flightNumber.equals(flight.flightNumber)) return false;
        if (!airline.equals(flight.airline)) return false;
        return planeType == flight.planeType;
    }

    @Override
    public int hashCode() {
        int result = flightNumber.hashCode();
        result = 31 * result + airline.hashCode();
        result = 31 * result + planeType.hashCode();
        result = 31 * result + tiсketPrice;
        result = 31 * result + distance;
        return result;
    }

    @Override
    public String toString() {
        return
                "FlightNumber='" + flightNumber + '\'' +
                ", Airline='" + airline + '\'' +
                ", PlaneType=" + planeType +
                ", Distance=" + distance +
                ", TiсketPrice=" + tiсketPrice;
    }
}


