package w9_Aircraft;

enum Aircraft {



    Embraer("Embraer"),Airbus("Airbus"), Boing("Boing");

    private String aircraftName;

    Aircraft(String aircraftName) {
        this.aircraftName = aircraftName;
    }

    public String getAircraftName() {
        return aircraftName;
    }
}