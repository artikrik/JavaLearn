/* Группа людей участвует в марафоне,
 их имена и время бега должны сохраняться в программе.
 Ваша задача найти трех призеров забега,
 которые быстрее всех пробежали дистанцию, и вывести их имена и время.
 Считаем, что ответ всегда однозначен и случай с четырьмя и более призерами невозможен.
*/
package w6_Marathone;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<MarathonRunner> arrayList = new ArrayList<>();
        arrayList.add(new MarathonRunner("Ivanov", "Russian", 23));
        arrayList.add(new MarathonRunner("Petrov", "Belarisia", 82));
        arrayList.add(new MarathonRunner("Sidorov", "Kazaxtan", 55));
        arrayList.add(new MarathonRunner("Morgunov", "Pakestan", 109));
        arrayList.add(new MarathonRunner("Begunov", "Makestan", 3));
        arrayList.add(new MarathonRunner("Plavunov", "Kenia", 37));

        arrayList.sort(MarathonRunner.FinishTime);


        System.out.println("Winner is - " + arrayList.get(0) + "\nSecond finisher is - " + arrayList.get(1)+ "\nThird finisher is - "+ arrayList.get(2));

    }

}
