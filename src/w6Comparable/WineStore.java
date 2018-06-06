package w6Comparable;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WineStore {

    public static void main(String[] args) {
        List<Wine> wineCatalog = new ArrayList<>();
        wineCatalog.add(new Wine("NoName1", "NoWhere1", 14));
        wineCatalog.add(new Wine("NoName2", "NoWhere2", 13));
        wineCatalog.add(new Wine("NoName3", "NoWhere3", 12));
        wineCatalog.add(new Wine("NoName4", "NoWhere4", 9));
        wineCatalog.add(new Wine("NoName5", "NoWhere5", 10));
        Wine youngestWine = Collections.min(wineCatalog);

        for (Wine wine : wineCatalog) {
            if (youngestWine.compareTo(wine) == 0) {
                System.out.println(wine.toString());
            }
        }
    }
}


