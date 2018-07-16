package com.company.Aircraft;

public enum  AirplaneBrand {
    Airbus("Airbus"),Boeing("Boeing"), National("National");

    private String airplaneBrand;

    AirplaneBrand(String airplaneBrand){
        setAirplaneBrand(airplaneBrand);
    }

    public String getAirplaneBrand(){
        return airplaneBrand;
    }

    public void setAirplaneBrand(String airplaneBrand) {
        this.airplaneBrand = airplaneBrand;
    }

    @Override
    public String toString(){
        return airplaneBrand;
    }

}
