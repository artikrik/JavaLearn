package com.company.Shopping;

public class PurchasingCharacteristics {

    private String purchaseName;
    private double purchasePrise;

    public PurchasingCharacteristics(String purchaseName, double purchasePrise) {
        setPurchaseName(purchaseName);
        setPurchasePrise(purchasePrise);
    }

    private void setPurchaseName(String purchaseName) {
        this.purchaseName = purchaseName;
    }

    private void setPurchasePrise(double purchasePrise) {
        this.purchasePrise = purchasePrise;
    }

    public String getPurchaseName() {
        return purchaseName;
    }

    public double getPurchasePrise() {
        return purchasePrise;
    }

    @Override
    public String toString() {
        return purchaseName + " " + purchasePrise;
    }

}
