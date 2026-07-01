package org.example.model;

public final class Dog extends Animal {
    public Dog (String name, int age, String color, AdoptionStatus adoptionStatus) {
        super("Dog", name, age, color, adoptionStatus);
    }

    public Dog(String name,int age, AdoptionStatus adoptionStatus) {
        this(name, age,"Light brown",adoptionStatus);
    }
    public Dog(String name, int age, String color) {
        this(name,age,color,AdoptionStatus.AVAILABLE);
    }

    public Dog(String name,int age) {
        this(name,age,"Black",AdoptionStatus.AVAILABLE);
    }


}
