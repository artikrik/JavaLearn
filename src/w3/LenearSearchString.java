package w3;
import java.util.Scanner;

public class LenearSearchString {
    public static void main(String[] args) {

        String[] mas = {"море", "пляж", "риба", "чайка"};
        Scanner find = new Scanner(System.in);
        System.out.println("введіть слово");
        String a = find.nextLine();
        int i;
        int index=-1;
        for (i = 0; i < mas.length; ++i) {
            if (mas[i].equals(a)) {
                index=i;
                System.out.println("Индекс=" +i);
            }
        }
        if (index==-1)
            System.out.println("такого слова нема");
    }
}