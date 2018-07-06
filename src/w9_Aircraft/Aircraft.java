package w9_Aircraft;

public enum Aircraft {

    private String producer;
    private String model;

    Aircraft (String producer, String model){
    this.producer = producer;
    this.model = model;
    }


    static enum Airbus {
        A310, A320, A330, B777;
    }

    static enum Boing {
        B737, B747, B767;
    }

    static enum Embraer{
        E175, E190, E195;
    }
}
