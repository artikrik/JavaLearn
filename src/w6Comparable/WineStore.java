package w6Comparable;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WineStore {

    public static void main(String[] args) {
        List<Wine> wineCatalog = new ArrayList<>();
        wineCatalog.add(new Wine("NoName1", "NoWhere1", 14));
        wineCatalog.add(new Wine("NoName1", "NoWhere1", 13));
        wineCatalog.add(new Wine("NoName1", "NoWhere1", 12));
        wineCatalog.add(new Wine("NoName1", "NoWhere1", 11));
        wineCatalog.add(new Wine("NoName1", "NoWhere1", 10));

        Collections.sort(wineCatalog);
        for(Wine wine:wineCatalog) {
            System.out.println(wine.toString());
        }
    }
}

