package org.example.shelter;

import java.util.ArrayList;
import java.util.List;

public class Shelter<T> {

    // Creating generic list
    private List<T> animalsInTheShelter = new ArrayList<>();

    // Add generic type to the list of animals in the shelter.
    public void addAnimalToShelter(T anyAnimalType) {
        animalsInTheShelter.add(anyAnimalType);
    }

    // Call the list of all generic type objects from the shelter.
    public List<T> getAllTheAnimalsFromShelter() {
        return animalsInTheShelter;
    }


}
