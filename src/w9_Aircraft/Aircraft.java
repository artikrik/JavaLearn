package w9_Aircraft;

public enum Aircraft {

    AIRCRAFT1("Airbus","A310"), AIRCRAFT2("Boeing","B737"), AIRCRAFT3("Embraer","E175");

    private String producer;
    private String model;

    Aircraft(String producer, String model) {
        this.model = model;
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }
}
