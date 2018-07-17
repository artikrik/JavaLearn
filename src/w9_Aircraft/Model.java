package w9_Aircraft;

enum Model {

    A310(310), A320(320), A330(330), B777(777), B737(737), B747(747), B767(767), E175(175), E190(190), E195(195);

    private int modelName;

    Model(int modelName) {
        this.modelName = modelName;
    }

    public int getModelName() {
        return modelName;
    }
}
