package w9_Aircraft;

enum Aircraft {

    Airbus, Boing, Embraer;

    public Model model;

    enum Model {
        A310, A320, A330, B777, B737, B747, B767, E175, E190, E195;
    }



    /*private String producer;
    private String model;

    Aircraft(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }*/
}
