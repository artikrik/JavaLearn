package com.company.Shopping;

import java.util.ArrayList;

interface Megamoll {

    public void addInListPurchasingCharacteristics(String purchaseName, double purchasePrise);

    public ArrayList<PurchasingCharacteristics> getListPurchasingCharacteristics();

    public void getPurchaseName();

    public void getPurchasePrise();

}
