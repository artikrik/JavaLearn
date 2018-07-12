package com.company.shopping;

import java.util.ArrayList;

public class Human {
    protected ArrayList<String> purchaseList = new ArrayList<>();

    public ArrayList<String> getPurchaseList() {
        return purchaseList;
    }

    public void setPurchaseList(ArrayList<String> purchaseList) {
        this.purchaseList = purchaseList;
    }
}
