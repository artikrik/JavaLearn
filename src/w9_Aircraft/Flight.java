package w9_Aircraft;

public class Flight {

    private String numberOfFlight;
    private String aviaCompany;
    private double price;
    private long distance;
    private Aircraft aircraft;
    private Aircraft.Model model;


    public Flight (String numberOfFlight, String aviaCompany, double price, long distance, Aircraft aircraft, Aircraft.Model model){
       setNumberOfFlight(numberOfFlight);
       setAviaCompany(aviaCompany);
       setPrice(price);
       setDistance(distance);
       this.aircraft = aircraft;
       this.model = model;
    }

    public String getNumberOfFlight(){
        return numberOfFlight;
    }

    public String getAviaCompany(){
        return aviaCompany;
    }

    public double getPrice(){
        return price;
    }

    public long getDistance(){
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
    public String toString(){
        return "Aircraft - "+aircraft+
                "\nModel - "+model+
                "\nNumber of flight - "+ numberOfFlight
                + "\nAvia company - " + aviaCompany
                + "\nPrice - " + price
                + "\nDistance - " + distance +
                "\n";
    }
}