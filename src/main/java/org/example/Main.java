package org.example;

import org.example.model.Animal;
import org.example.model.Bird;
import org.example.model.Cat;
import org.example.model.Dog;
import org.example.shelter.Shelter;
import org.example.model.AdoptionStatus;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal animalOne = new Bird("John",5,"black and white", false);
        Animal animalTwo = new Bird("Frank", 10,"black and white", false);
        Animal animalThree = new Cat("Kate", 10,"white", true);
        Animal animalFour = new Dog("Jim", 8, "black", false);

        // Prints all the animals to the console
        System.out.println("All animals who were or is in the shelter: " + Animal.listOfAllAnimals);

        // Prints species requested by User to the console
        List<Animal> foundBySpecies = Animal.searchAnimalBySpecies("Bird");
        for(Animal specificSpecies : foundBySpecies) {
            System.out.println(specificSpecies);
        }

        // Setting animal two and four to show as already adopted
        AdoptionStatus.markAsAdopted(animalTwo);
        AdoptionStatus.markAsAdopted(animalFour);

        // Prints only the available animals in the shelter who can be adopted
        List<Animal> currentlyAvailableAnimals = Animal.currentlyAvailableAnimals();
        for(Animal availableAnimal : currentlyAvailableAnimals) {
            System.out.println("You can adopt: " + availableAnimal);
        }


        // Generic shelter class called with 2 animals added to it.
        Shelter<Animal> myShelterSystem = new Shelter<>();
        myShelterSystem.addAnimalToShelter(animalOne);
        myShelterSystem.addAnimalToShelter(animalThree);
        for (Animal animal : myShelterSystem.getAllTheAnimalsFromShelter()) {
            System.out.println(animal);
        }
    }
}
