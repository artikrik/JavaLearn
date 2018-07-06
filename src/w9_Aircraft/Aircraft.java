package w9_Aircraft;

public enum Aircraft {

    AIRBUS1("Airbus1","A310"), BOEING1("Boeing1","B737"), EMBRAER1("Embraer1","E175"),
    AIRBUS2("Airbus2","A320"), BOEING2("Boeing2","B747"), EMBRAER2("Embraer2","E190"),
    AIRBUS3("Airbus3","A330"), BOEING3("Boeing3","B767"), EMBRAER3("Embraer3","E195"),
                               BOEING4("Boeing4","B777");

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
