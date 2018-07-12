package com.company.flight;

public class Plane {

    public Enum producer;
    public Enum model;

    public Plane(Enum<Producer> producer, Enum model){
        this.producer = producer;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "producer=" + producer +
                ", model=" + model +
                '}';
    }
}
