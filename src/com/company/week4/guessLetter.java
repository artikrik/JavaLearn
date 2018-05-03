package com.company.week4;

import java.util.Random;
import java.util.Scanner;

public class guessLetter {
    public static void main(String[] args) {
        String letter = String.valueOf(generateRandomLetter());
        String input;
        System.out.println("Please enter any latin letter");
        Scanner s = new Scanner(System.in);
        int count = 0;
        do {
            input = s.next().toUpperCase();
            if (checkForWrongInput(input)) {
                System.out.println("Please make sure you enter latin letter and only 1 letter at a time");
            }
            else {
                printHintForUserIfNotGuessed(input, letter);
            }
            count++;
        }
        while (!input.equals(letter));
        System.out.println("You won in " + count + " attempts");
    }

    public static char generateRandomLetter() {
        return (char)(new Random().nextInt('Z'-'A') + 'A');
    }

    public static boolean checkInputContainsWrongCharacter(String input) {
        return (input.compareTo("A") < 0) || (input.compareTo("Z") > 0);
    }

    public static boolean checkForWrongInput (String input) {
        return (input.length() != 1) || checkInputContainsWrongCharacter(input);
    }

    public static void printHintForUserIfNotGuessed(String input, String letter) {
        if (input.compareTo(letter) < 0)
            System.out.println("Too Low");
        else if (input.compareTo(letter) > 0)
            System.out.println("Too High");
    }
}