package com.csaba79coder.interitance;

public class Dog extends Animal {

    private String gender;

    public Dog() {
        super();
    }

    public Dog(String gender) {
        super();
        this.gender = gender;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Dog barks");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Dog [gender=" + gender + " age=" + getAge() + "]";
    }
}
