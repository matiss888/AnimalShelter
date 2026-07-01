package org.example.model;

public final class Cat extends Animal {
    public Cat (String name, int age, String color, AdoptionStatus adoptionStatus) {
        super("Cat", name, age, color, adoptionStatus);
    }

    public Cat(String name, int age, String color) {
        this(name,age,color,AdoptionStatus.AVAILABLE);
    }

    public Cat(String name,int age, AdoptionStatus adoptionStatus) {
        this(name, age,"Brown", adoptionStatus);
    }
}
