package com.csaba79coder;

import com.csaba79coder.model.Person;
import com.csaba79coder.util.Printer;

public class Main {

    public static void main(String[] args) {

        Person gabor = new Person("Gábor", "Bábik"); // Konstruktoron keresztül egyből kezdeti értéket adunk a mezőknek
        System.out.println(gabor);
        String hello = gabor.sayHello();
        Printer.print(hello);
        System.out.println("----------------");
        StringBuilder helloFromBuilder = gabor.sayHello(new StringBuilder());
        System.out.println(helloFromBuilder);
        Person denes = new Person(); // kezdetben a mezők a default null (hiszen String) értéket veszik fel!
        System.out.println(denes);
        denes.setFirstName("Dénes"); // Setterek segítségével állítjuk be az értékeket
        denes.setLastName("Szabó"); // Setterek segítségével állítjuk be az értékeket
        System.out.println(denes);
        Printer.print(denes.getFirstName());
        Printer.print(denes.getLastName());
        String helloDenes = denes.sayHello();
        Printer.print(helloDenes);
        int numberFromPrinter = Printer.number;
        Printer.print("Number: " + numberFromPrinter);
    }
}
