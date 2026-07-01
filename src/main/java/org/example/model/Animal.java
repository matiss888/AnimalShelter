package org.example.model;

import lombok.Data;

// Making getters and setters with Lombok's @Data annotation

@Data
public sealed class Animal permits Bird, Dog, Cat {

    // Variable fields for animal
    private final int id;
    private final String species;
    private String name;
    private int age;
    private final String color;
    private AdoptionStatus adoptionStatus;

    // Animal Constructor which adds newly created Animal inside the list of Animals in shelter
    // and also gives animal a unique ID.
    public Animal (String species, String name, int age, String color, AdoptionStatus adoptionStatus) {
        this.id = AnimalId.getAnimalId();
        this.species = species;
        this.name = name;
        this.age = age;
        this.color = color;
        this.adoptionStatus = adoptionStatus;
    }


    // Edited toString() method for all the animals in the shelter
    @Override
    public String toString() {
        return  "\nID: " + id +
                ", species: " + species +
                ", name: " + name +
                ", age: " + age +
                ", color: " + color +
                ", adoption status: " + adoptionStatus;
    }
}
