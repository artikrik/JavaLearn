package com.company.Shopping;

import java.util.ArrayList;

interface Megamoll {

    public void addInListPurchasingCharacteristics(String purchaseName, int purchasePrise);

    public ArrayList<PurchasingCharacteristics> getListPurchasingCharacteristics();

    public void getPurchaseName();

    public void getPurchasePrise();

}
