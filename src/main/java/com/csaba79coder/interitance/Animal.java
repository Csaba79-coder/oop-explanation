package com.csaba79coder.interitance;

public class Animal {

    private int age;

    public Animal() {

    }

    public Animal(int age) {
        this.age = age;
    }

    public void makeNoise() {
        System.out.println("MakeNoise");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return Animal.class.getSimpleName() + " [age=" + age + "]";
    }
}
