package com.company.w4;

/*
Написать программу игры в угадывание букв.
Пользователь должен угадать загаданную программой латинскую букву вводя свой вариант буквы с клавиатуры.
Если пользователь угадал букву, программа выводит сообщение о выигрыше и количестве попыток пользователя.
Если буква не угадана, программа предлагает ввести другую букву. При этом программа выводит подсказки.
Если пользователь ввел букву меньше загаданной – вывести сообщение об этом (например, «Too low!»).
Аналогично при вводе буквы больше загаданной (например, «Too high!»).
+Если введена не латинская буква – предложить пользователю внимательно ознакомиться с правилами игры.
Программа должна быть не чувствительна к регистру введенной пользователем буквы.
Например, при загаданной букве ‘G’ ответы пользователя ‘G’ или ‘g’ в равной степени считаются правильными.
Игра продолжается до выигрыша пользователя. Тексты выводимых программой сообщений – на Ваше усмотрение.
Для загадывания букв использовать генератор псевдослучайных чисел.
 */

import java.io.IOException;
import java.io.InputStream;

public class WhatLetter {
    public static void main(String[] args) {
        char letter = 0;

        while (!isAlphabeticLetter(letter)||!isLatinLetter(letter)) {
            letter = readInputChar();
        }

        System.out.println(letter);
        System.out.println((int)letter);
    }

    private static boolean isLatinLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    private static boolean isAlphabeticLetter(char c) {
        return Character.isAlphabetic(c);
    }

    private static char readInputChar() {
        char ch = 0;
        try {
            InputStream is = System.in;

            ch = (char) is.read();
        } catch (IOException ioe) {
            System.out.println("Exception while reading input " + ioe);
        }
        return ch;
    }
}
