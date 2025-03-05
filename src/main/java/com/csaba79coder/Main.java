package com.csaba79coder;

import com.csaba79coder.interitance.Animal;
import com.csaba79coder.interitance.Dog;
import com.csaba79coder.model.Address;
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
        Address address = new Address("15600 Mulholland Drive", "Los Angeles", "CA", "90077-1599");
        gabor.setAddress(address);
        Printer.print(gabor.getAddress().toString());

        System.out.println("---------------");
        Animal animal = new Animal(10);
        System.out.println(animal);
        animal.makeNoise();

        Dog dog = new Dog("male");
        dog.setAge(2);
        System.out.println(dog);
        dog.makeNoise();

        System.out.println("--------------------------");

        Animal animal2 = new Dog("female");
        System.out.println(animal2);
        animal2.makeNoise();
        animal2.setAge(3);
        System.out.println(animal2);

        System.out.println("--------------------------");
        Animal animal3 = new Dog();
        animal3.setAge(1); // DEEE NEM tudok beállitani gendert!
        System.out.println(animal3);
    }
}
