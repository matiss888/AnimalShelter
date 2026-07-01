package org.example.shelter;

import org.example.model.AdoptionStatus;
import org.example.model.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Shelter<T extends Animal> {

    //Creating generic list
    private final List<T> allTheAnimalsFromThisShelter = new ArrayList<>();

    //Add generic type to the list of animals in the shelter.
    public void addAnimalToShelter(T anyAnimalType) {
        allTheAnimalsFromThisShelter.add(anyAnimalType);
    }

    //Call the list of all generic type objects from the shelter.
    public List<T> getAllTheAnimalsFromShelter() {
        return new ArrayList<>(allTheAnimalsFromThisShelter);
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
        for (T animal : allTheAnimalsFromThisShelter) {
            if (animal.getAdoptionStatus() == AdoptionStatus.AVAILABLE) {
                animalsCurrentlyInTheShelter.add(animal);
            }
        }
        return animalsCurrentlyInTheShelter;
    }

    //Marks an animal as adopted
    public Optional<T> markAnimalAsAdopted(int id) {
        for (T animal : allTheAnimalsFromThisShelter) {
            if (animal.getId() == id) {
                animal.setAdoptionStatus(AdoptionStatus.ADOPTED);
                return Optional.of(animal);
            }
        }
        return Optional.empty();
    }
}
