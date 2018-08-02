package com.company.W10.AircraftAndStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListsOfFlights {

    List<Flight> listsOfFlights = new ArrayList<>();

    public void addFlightToList(Flight flight) {
        listsOfFlights.add(flight);
    }

    public List<Flight> getListOfFlights() {
        return listsOfFlights;
    }

    public void compareToPriceofTicket() {
        List<Flight> newList = listsOfFlights.stream().sorted((o1, o2) -> o1.getPriceTicket() - o2.getPriceTicket()).collect(Collectors.toList());
        System.out.println("Сортіровка по ціні-" + newList);
    }

    public void compareToDistance() {
        List<Flight> newList = listsOfFlights.stream().sorted((o1, o2) -> o1.getDistance() - o2.getDistance()).collect(Collectors.toList());
        System.out.println("Сортіровка по відстані-" + newList);
    }

    public void compareToAirlineAndPriceOfTicket() {
        List<Flight> newList = listsOfFlights.stream()
                                             .sorted(Comparator.comparing(Flight::getAirline).thenComparing(Flight::getPriceTicket))
                                             .collect(Collectors.toList());
        System.out.println("Сортіровка по авіакампанії і ціні-" + newList);
    }

    public void compareToDistanceAndMakerAndModel() {
        List<Flight> newList = listsOfFlights.stream()
                                             .sorted(Comparator.comparing(Flight::getDistance).thenComparing(Flight::getMaker).thenComparing(Flight::getModel))
                                             .collect(Collectors.toList());
        System.out.println("Сортіровка по відстані і виробнику і моделі" + newList);
    }

    public void findInformationByFlightNumber(String flightNumber) {
        List<Flight> newList = listsOfFlights.stream().filter((flight) -> flight.getFlightNumber().equals(flightNumber)).collect(Collectors.toList());
        if (newList.isEmpty()) {
            System.out.println("рейса з таким номером нема");
        } else System.out.println("інфа по конкретному рейсу-" + newList);
    }

    public void findInformationByAirline(String airline) {
        List<Flight> newList = listsOfFlights.stream().filter((flight) -> flight.getAirline().equals(airline)).collect(Collectors.toList());
        if (newList.isEmpty()) {
            System.out.println("авіакомпанії з тако назвою нема");
        } else System.out.println("інфа по конкретній авіакомпанії-" + newList);
    }

    public void findInformationByPrice(int price) {
        List<Flight> newList = listsOfFlights.stream().filter((flight) -> flight.getPriceTicket() == price).collect(Collectors.toList());
        if (newList.isEmpty()) {
            System.out.println(" з такою вартістю квитка рейсів нема");
        } else System.out.println("інфа по конкретній вартості-" + newList);
    }

    public void removeInfoByyFlightNumber(String flightNumber) {
        boolean infaIsFinded = false;
        for (Flight flight : listsOfFlights) {
            if (flight.getFlightNumber().compareTo(flightNumber) == 0) {
                List<Flight> newList = listsOfFlights.stream().filter(o -> !o.getFlightNumber().equals(flightNumber)).collect(Collectors.toList());
                listsOfFlights = newList;
                System.out.println("інфа по конкретному рейсу видалена");
                infaIsFinded = true;
            }
        }
        if (!infaIsFinded)
            System.out.println("рейса з таким номером нема");
    }

    public void removeInfoByTypeOfAirplane(String airline, String model) {
        boolean infaIsFinded = false;
        for (Flight flight : listsOfFlights) {
            if ((flight.getAirline().compareTo(airline) == 0) || (flight.getModel().compareTo(model) == 0)) {
                List<Flight> newList = listsOfFlights.stream().filter(o -> !(o.getAirline().equals(airline)) & (o.getModel().equals(model))).collect
                        (Collectors.toList());
                listsOfFlights = newList;
                System.out.println("інфа по конкретному типу літака видалена");
                infaIsFinded = true;
            }
        }
        if (!infaIsFinded)
            System.out.println("рейса з таким типом літака нема");
    }

    public void compareFlightOnContainsAllInOtherFlight(List<Flight> first, List<Flight> second) {
        boolean isAnyOneTrue = true;
        for (Flight flight : second) {
            isAnyOneTrue = first.stream().anyMatch(flight::equals);
            if (!isAnyOneTrue) {
                break;
            }
        }
        if (!isAnyOneTrue) {
            System.out.println("набір не входить");
        } else System.out.println("набір входить");
    }

    public void verifyOnEqualityFlights(List<Flight> first, List<Flight> second) {
        boolean isAnyOneTrue = true;
        if (first.size() == second.size()) {
            for (Flight flight : second) {
                isAnyOneTrue = first.stream().anyMatch(flight::equals);
                if (!isAnyOneTrue) {
                    break;
                }
            }
            if (isAnyOneTrue) {
                System.out.println("набіри рівні");
            }
        }
        else   System.out.println("набіри не рівні");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void addElementsSecondListFlightToFirstListFlight(List<Flight> first, List<Flight> second) {
        List<Flight> temporary = Stream.concat(first.stream(),second.stream()).collect(Collectors.toList());
        first=temporary;
        System.out.println("Додано елементи другого набіра в кінець першого-" + first);
    }

    public List<Flight> formateListWithSomeElementsWithTwoList(List<Flight> first, List<Flight> second) {
        List<Flight> temporary = Stream.concat(first.stream(),second.stream()).distinct().collect(Collectors.toList());
        return temporary;
    }

   /* public ArrayList<Flight> createListCompareByDistanceWithOtherTwoLists(ArrayList<Flight> first, ArrayList<Flight> second) {
        ArrayList<Flight> temporary = new ArrayList<>();
        temporary.addAll(first);
        temporary.addAll(second);
        Collections.sort(temporary, Comparator.comparing(Flight::getDistance));
        return temporary;
    }
*/
  /*  public ArrayList<Flight> createListIdenticalElementsWithTwoLists(ArrayList<Flight> first, ArrayList<Flight> second) {
        ArrayList<Flight> temp = new ArrayList<>();
        temp.addAll(first);
        temp.retainAll(second);
        return temp;
    }
*/
}


