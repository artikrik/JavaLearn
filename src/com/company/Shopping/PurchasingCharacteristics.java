package com.company.Shopping;

public class PurchasingCharacteristics {

    private String purchaseName;
    private double purchasePrise;

    public PurchasingCharacteristics(String purchaseName, int purchasePrise) {
        setPurchaseName(purchaseName);
        setPurchasePrise(purchasePrise);
    }

    private void setPurchaseName(String purchaseName) {
        this.purchaseName = purchaseName;
    }

    private void setPurchasePrise(int purchasePrise) {
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
