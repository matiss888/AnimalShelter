package org.example.model;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

// Making getters and setters with Lombok's @Data annotation

@Data
public sealed class Animal permits Bird,Dog,Cat {

    // Variable fields for animal
    private final int id;
    private final String species;
    private String name;
    private int age;
    private final String color;
    private boolean adopted;

    // Animal Constructor which adds newly created Animal inside the list of Animals in shelter
    // and also gives animal a unique ID.
    public Animal (String species, String name, int age, String color, boolean adopted) {
        this.id = AnimalId.getAnimalId();
        this.species = species;
        this.name = name;
        this.age = age;
        this.color = color;
        this.adopted = adopted;
        listOfAllAnimals.add(this);
    }

    // List of all animals who were or is in the shelter
    public static List<Animal> listOfAllAnimals = new ArrayList<>();

    // Creating a list for specific Animal searching Animal by species
    public static List<Animal> searchAnimalBySpecies(String species) {
        List<Animal> specificSpeciesList = new ArrayList<>();
        for(Animal animal : listOfAllAnimals) {
            if(animal.getSpecies().toLowerCase().equals(species.toLowerCase())){
                specificSpeciesList.add(animal);
            }
        }
        return specificSpeciesList;
    }

    // List of all the animals who are currently in the shelter and can be adopted
    public static List<Animal> currentlyAvailableAnimals() {
        List<Animal> currentlyInShelter = new ArrayList<>();
        for(Animal animal : listOfAllAnimals) {
            if(!animal.adopted) {
                currentlyInShelter.add(animal);
            }
        }
        return currentlyInShelter;
    }

    // Edited toString() method for all the animals in the shelter
    @Override
    public String toString() {
        return  "\nID: " + id +
                ", species: " + species +
                ", name: " + name +
                ", color: " + color +
                ", adopted: " + adopted;
    }
}
