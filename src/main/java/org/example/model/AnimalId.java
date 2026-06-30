package org.example.model;

public class AnimalId {

    // ID counter for animals to each have a unique key
    private static int animalId = 1;

    public static int getAnimalId() {
        return animalId++;
    }
}
