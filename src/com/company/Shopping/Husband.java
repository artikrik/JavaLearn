package com.company.Shopping;

import java.util.ArrayList;
import java.util.List;

public class Husband {

    ArrayList<PurchasingCharacteristics> allItemsInAllShops = new ArrayList<>();
    ArrayList<PurchasingCharacteristics> allowableProducts = new ArrayList<>();
    Silpo silpo = new Silpo();
    Comfy comfy = new Comfy();

    public void silpoInfo(Silpo products) {
        silpo = products;
    }

    public void comfyInfo(Comfy gadgets) {
        comfy = gadgets;
    }

    public List<PurchasingCharacteristics>

}
