package com.company.w4;

import java.util.Random;
import java.util.Scanner;

public class GameTheLetter {
    public static void main(String[] args) {
        String welcome= "Добро пожаловать в игру \"Угадай букву\"!";
        System.out.println(welcome);
        Random random=new Random(9);          // генерим букву, которую должен угадать пользователь
        char computerLetter= (char)((char)random.nextInt(26)+97);
        winOrNo(computerLetter); //метод который вызывает метод guessedLetterIsClose до тех пор, пока мы не угадали букву
    }
    //метод проверка верно введеной букви
    static char getInputNumber(char computerLetter){
        Scanner scanner = new Scanner(System.in);
         char inputNumber;
        do {
            System.out.println("Введите маленькую английскую букву от a до z");
            String inputValue = scanner.next();
            inputNumber = inputValue.charAt(0);
        }
        while ((inputNumber > 0 && inputNumber <= 96) || (inputNumber >= 123 && inputNumber <= 1000 ) );
        return inputNumber;

    }

    //метод угадал ли пользователь введенную им букву
    static String guessedLetterIsClose(int inputNumber, char computerLetter){
        String outValue="";
        if (inputNumber==computerLetter)  outValue="Поздравляем Вы угадали букву";
        else if((Math.abs(inputNumber-computerLetter))<=5) outValue="Вы очень близко";
        else if((Math.abs(inputNumber-computerLetter))<=10) outValue="Горячо";
        else if((Math.abs(inputNumber-computerLetter))>=11 || ((Math.abs(inputNumber-computerLetter))<=24)) outValue="Холодно";
        return outValue;
    }


    static void winOrNo(char computerLetter){
        String valueOfcompareTwoLetter;
        do {
            char userLetter = getInputNumber(computerLetter);
            valueOfcompareTwoLetter=(guessedLetterIsClose(userLetter, computerLetter));
            System.out.println(valueOfcompareTwoLetter);
        }
        while (valueOfcompareTwoLetter.compareTo("Поздравляем Вы угадали букву")!=0);
    }


}
