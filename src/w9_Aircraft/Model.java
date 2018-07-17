package w9_Aircraft;

enum Model {

    A310("A310"), A320("A320"), A330("A330"), B777("B777"), B737("B737"), B747("B747"), B767("B767"), E175("E175"), E190("E190"), E195("E195");

    private String modelName;

    Model(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }
}
