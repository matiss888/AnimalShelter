package org.example.shelter;

import org.example.model.Animal;

import java.util.ArrayList;
import java.util.List;

public class Shelter<T extends Animal> {

    //Creating generic list
    private List<T> allTheAnimalsFromThisShelter = new ArrayList<>();

    //Add generic type to the list of animals in the shelter.
    public void addAnimalToShelter(T anyAnimalType) {
        allTheAnimalsFromThisShelter.add(anyAnimalType);
    }

    //Call the list of all generic type objects from the shelter.
    public List<T> getAllTheAnimalsFromShelter() {
        return allTheAnimalsFromThisShelter;
    }

    //Search animal by species
    public List<T> searchAnimalBySpecies(String species) {
        List<T> specificSpecies = new ArrayList<>();
        for (T animal : allTheAnimalsFromThisShelter) {
            if (animal.getSpecies().equalsIgnoreCase(species)) {
                specificSpecies.add(animal);
            }
        }
        return specificSpecies;
    }

    //Animals who are currently available in the shelter system ( not adopted )
    public List<T> animalsCurrentlyAvailableInShelter() {
        List<T> animalsCurrentlyInTheShelter = new ArrayList<>();
        for(T animal : allTheAnimalsFromThisShelter) {
            if(!animal.isAdopted()) {
                animalsCurrentlyInTheShelter.add(animal);
            }
        }
        return animalsCurrentlyInTheShelter;
    }
}
