package com.company.W9.Aircraft;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Flight f1 = new Flight("AL111", "Germany Airways", 22, 522, Maker.Airbus, Model.A310);
        Flight f2 = new Flight("L4444", "Croatia Airways", 21, 622, Maker.Boeing, Model.B410);
        Flight f3 = new Flight("W22222", "British Airways", 11, 922, Maker.Boeing, Model.B410);
        //     Flight f4 = new Flight("W222222", "British Airways", 11, 922, Maker.Boeing, Model.B410);

        ListsOfFlights L1 = new ListsOfFlights();
        L1.addFlightToList(f1);
        L1.addFlightToList(f2);
        L1.addFlightToList(f3);
/*

        L1.compareToPriceofTicket();
        L1.compareToDistance();
        L1.compareToAirlineAndPriceOfTicket();
        L1.compareToDistanceAndMakerAndModel();
*/

  /*      L1.findInformationByFlightNumber("W112");
        L1.findInformationByAirline("Croatia Airways");
        L1.findInformationByPrice(22);
*/
      /*  L1.removeInfoByyFlightNumber("L4444");
        L1.removeInfoByTypeOfAirplane("Airbus", "A310");
      */
        ListsOfFlights L2 = new ListsOfFlights();
        Flight b1 = new Flight("AL111", "Germany Airways", 22, 522, Maker.Airbus, Model.A310);
        Flight b2 = new Flight("L4444", "Croatia Airways", 21, 622, Maker.Boeing, Model.B410);
        Flight b3 = new Flight("G22", "Brit Airways", 11, 922, Maker.Boeing, Model.B410);
        L2.addFlightToList(b1);
        L2.addFlightToList(b2);
        L2.addFlightToList(b3);

        ListsOfFlights forcomparelists = new ListsOfFlights();
        ArrayList<Flight> first = L1.getListOfFlights();
        ArrayList<Flight> second = L2.getListOfFlights();
   /*     forcomparelists.compareFlightOnContainsAllInOtherFlight(first, second);
        forcomparelists.verifyOnEqualityFlights(first, second);
        forcomparelists.addElementsSecondListFlightToFirstListFlight(first, second);

   */     ArrayList<Flight> L = forcomparelists.formateListWithSomeElementsWithTwoList(first, second);
     //   System.out.println("Набір L, включає по одному разу елементи, які входять хоча б в один з наборів L1 і L2: " + L);

     //   L = forcomparelists.createListCompareByDistanceWithOtherTwoLists(first, second);
   //     System.out.println("Об'єднаний набір L з наборів L1 і L2, впорядкований за дистанцією: " + L);

        L = forcomparelists.createListIdenticalElementsWithTwoLists(first, second);
        System.out.println("Об'єднаний набір L з наборів L1 і L2, в який входять однакові елементи: " + L);

    }
}
