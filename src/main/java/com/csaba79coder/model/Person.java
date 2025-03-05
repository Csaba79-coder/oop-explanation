package com.csaba79coder.model;

public class Person {

    private String firstName;
    private String lastName;
    private Address address; // ezt a kapcsoatot utólag adtam hozzá

    // Üres konstruktor
    public Person() {

    }

    // lehet akár egy paraméteres konstruktor is ...
    public Person(String firstName) {
        this.firstName = firstName;
    }

    // Paraméteres konstruktor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // ez pedig egy metódus
    public String sayHello() {
        return "Hello " + firstName + " " + lastName + "!";
    }

    public StringBuilder sayHello(StringBuilder sb) {
        return sb.append("Hello ").append(firstName).append(" ").append(lastName).append("!");
    }

    // Getter
    public String getFirstName() {
        return firstName;
    }

    // Setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter
    public String getLastName() {
        return lastName;
    }

    // Setter
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
