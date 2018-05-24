package w6;

import java.time.LocalDate;
import java.util.ArrayList;



public class WineStore {
    public static void main(String[] args) {
        showInfoAboutWineInCatalog();
    }



    private static ArrayList createWineCatalog() {
        ArrayList<Wine> wineCatalog = new ArrayList<>();
        wineCatalog.add(new Wine("NoName1\n", "NoWhere1\n", LocalDate.of(1999, 5, 23)));
        wineCatalog.add(new Wine("NoName2\n", "NoWhere2\n", LocalDate.of(2015, 6, 29)));

        return wineCatalog;
    }

    private static void showInfoAboutWineInCatalog() {
        ArrayList<Wine> wineCatalog = createWineCatalog();
        for(Wine i: wineCatalog) {
            System.out.println(i.toString());
        }
    }
}