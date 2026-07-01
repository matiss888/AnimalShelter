package org.example.model;

public final class Bird extends Animal {
    public Bird (String name, int age, String color,AdoptionStatus adoptionStatus) {
        super("Bird", name, age, color, adoptionStatus);
    }

    public Bird(String name,int age, AdoptionStatus adoptionStatus) {
        this(name, age,"Black with white stripes", adoptionStatus);
    }
    public Bird(String name, int age, String color) {
        this(name,age,color,AdoptionStatus.AVAILABLE);
    }

    public Bird(String name,int age) {
        this(name,age,"Yellow",AdoptionStatus.AVAILABLE);
    }
}
