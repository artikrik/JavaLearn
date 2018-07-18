package w9_Aircraft;

public class Flight {

    private String numberOfFlight;
    private String aviaCompany;
    private double price;
    private long distance;
    private Aircraft aircraft;
    private Model model;


    public Flight(String numberOfFlight, String aviaCompany, double price, long distance, Aircraft aircraft, Model model) {
        setNumberOfFlight(numberOfFlight);
        setAviaCompany(aviaCompany);
        setPrice(price);
        setDistance(distance);
        this.aircraft = aircraft;
        this.model = model;
    }

    public String getAircraft() {
        return aircraft.toString();
    }

    public String getModel() {
        return model.toString();
    }

    public String getNumberOfFlight() {
        return numberOfFlight;
    }

    public String getAviaCompany() {
        return aviaCompany;
    }

    public double getPrice() {
        return price;
    }

    public long getDistance() {
        return distance;
    }

    public void setNumberOfFlight(String numberOfFlight) {
        this.numberOfFlight = numberOfFlight;
    }

    public void setAviaCompany(String aviaCompany) {
        this.aviaCompany = aviaCompany;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }


    @Override
    public String toString() {
        return "Aircraft - " + aircraft +
                "\nModel - " + model +
                "\nNumber of flight - " + numberOfFlight
                + "\nAvia company - " + aviaCompany
                + "\nPrice - " + price
                + "\nDistance - " + distance +
                "\n";
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

        Flight otherFlight = (Flight) obj;
        return numberOfFlight.equals(((Flight) obj).numberOfFlight) && aviaCompany.equals(((Flight) obj).aviaCompany) && price == otherFlight.getPrice()
                && distance == otherFlight.getDistance();
    }
}