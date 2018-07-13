package com.company.W9.Aircraft;

public enum Model {
    A310("A310"), A320("A320"), A330("A330"), B410("B410"),B420("B420"),B430("B430"),E510("E510"),E520("E520"),E530("E530");

    private String model;

    Model (String model){
        setModel(model);
    }

    public String getModel(){
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
