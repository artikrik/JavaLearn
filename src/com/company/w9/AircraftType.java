package com.company.w9;

public enum AircraftType {
    AirbusA310("Airbus", "A310"), AirbusA320("Airbus", "A320"), AirbusA330("Airbus", "A320"),
    Boeing737("Boeing", "737"), Boeing747("Boeing", "747"), Boeing767("Boeing", "767"), Boeing777("Boeing", "777"),
    Embraer175("Embraer", "175"), Embraer190("Embraer", "190"), Embraer195("Embraer", "195");

    private String model;
    private String manufacturer;

    AircraftType(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
