package w6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class WineStore {
    public static void main(String[] args) {
        showInfoAboutWineInCatalog();
        List<Wine> wines = createWineCatalog();
        List<Wine> youngest = getAllYoungestWines(wines, youngestWine(wines));
        for (Wine wine : youngest){
            System.out.println(wine);
        }
    }

    private static List<Wine> createWineCatalog() {

        List<Wine> wineCatalog = new ArrayList<>();
        wineCatalog.add(new Wine("NoName1\n", "NoWhere1\n", LocalDate.of(2000, 5, 23)));
        wineCatalog.add(new Wine("NoName2\n", "NoWhere2\n", LocalDate.of(2002, 5, 23)));
        wineCatalog.add(new Wine("NoName3\n", "NoWhere3\n", LocalDate.of(2003, 6, 23)));
        wineCatalog.add(new Wine("NoName4\n", "NoWhere4\n", LocalDate.of(2005, 6, 29)));
        wineCatalog.add(new Wine("NoName5\n", "NoWhere5\n", LocalDate.of(2006, 6, 29)));

        return wineCatalog;

    }
    private static void showInfoAboutWineInCatalog() {
        List<Wine> wineCatalog = createWineCatalog();
        for(Wine i: wineCatalog) {
            System.out.println(i.toString());
        }

    }

    public static long youngestWine(List<Wine> catalog) {
        long minValue = catalog.get(0).wineExtract();
        for (Wine tmp : catalog) {
            if (tmp.wineExtract() < minValue) minValue = tmp.wineExtract();
        }
        return minValue;
    }
    public static List<Wine> getAllYoungestWines(List<Wine> catalog, long minValue) {
        List<Wine> wineCatalog = new ArrayList<>();

        for (Wine tmp : catalog) {
            if (minValue == tmp.wineExtract()) {
                wineCatalog.add(tmp);
            }
        }
        return wineCatalog;
    }
}