package com.company.Aircraft;

public enum Model {

    A220("A220"), A310("A310"), A320("A320"), B717("B717"), B737("B737"), B747("B747"),
    ТУ204("ТУ204"), ИЛ96("ИЛ96"), ИЛ114("ИЛ114");

    private String model;

    Model(String model) {
        setModel(model);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return model;
    }
}
