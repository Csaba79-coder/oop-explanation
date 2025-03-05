package com.csaba79coder.util;

public class Printer {

    public static int number = 100000; // ez az osztályhoz tartozik, nem az objektumokhoz

    // ez az osztályhoz tartozik, nem az objektumokhoz
    public static void print(String text) {
        System.out.println(text);
    }

    // ezzel megakadályozzuk, hogy az osztály példányosítható legyen
    private Printer() {

    }
}
