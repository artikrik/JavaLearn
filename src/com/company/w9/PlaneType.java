package w9;

enum PlaneType {
    AIRBUS1("AIRBUS(A310)"), AIRBUS2("AIRBUS(A320)"), AIRBUS3("AIRBUS(A330)"),
    EMBRAER1("EMBRAER(E175)"), EMBRAER2("EMBRAER(E190)"), EMBRAER3("EMBRAER(E195)"),
    BOEING1("BOEING(B737)"), BOEING2("BOEING(B747)"), BOEING3("BOEING(B767)"), BOEING4("BOEING(B777)");

    String planeType;

    PlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getPlaneType() {
        return planeType;
    }
}
