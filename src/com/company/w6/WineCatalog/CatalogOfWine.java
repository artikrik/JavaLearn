package com.company.w6.WineCatalog;

import java.util.ArrayList;

public class CatalogOfWine extends ArrayList<Wine> {

    ArrayList<Wine> wineCatalog;

    public CatalogOfWine() {
        wineCatalog = new ArrayList<Wine>();
    }

    public static long youngestWine(ArrayList<Wine> catalog) {
        long minValue = catalog.get(0).periodOfWineHolding();
        for (Wine tmp : catalog) {
            if (tmp.periodOfWineHolding() < minValue) minValue = tmp.periodOfWineHolding();
        }
        return minValue;
    }

    public static ArrayList<Wine> youngestWineCatalog(ArrayList<Wine> catalog, long minValue) {
        ArrayList<Wine> youngestWineCatalog = new ArrayList();
        for (Wine tmp : catalog) {
            if (minValue == tmp.periodOfWineHolding()) {
                youngestWineCatalog.add(tmp);
            }
        }
        return youngestWineCatalog;
    }
}
