package com.company.W10.AircraftAndStream;

public enum Maker {
    Airbus("Airbus"), Boeing("Boeing"), Embraer("Embraer");

    public String maker;

    Maker(String maker) {
        setMaker(maker);
    }

    public String getMaker(){
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    @Override
    public String toString() {
        return  maker;
    }
}

