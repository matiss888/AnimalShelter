package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Can add new Animals which aren't in the animal shelter already. For example Tiger.
        // And then when Tiger would be already known in the Animal Shelter then I can make a
        // new Class explicitly for Tiger but this way I can still build new Animals without
        // needing to make new classes beforehand.
        Animal animalOne = new Animal("Zebra","John",5,"black and white", false);
        Animal animalTwo = new Zebra("Frank", 10,"black and white", false);
        Animal animalThree = new Lion("Rob",3,"brown", false );
        Animal animalFour = new Cat("Kate", 10,"white", true);
        Animal animalFive = new Animal("Dog","Jim", 8, "black", false);

        // Prints all the animals to the console
        System.out.println("Animals currently living in the shelter: " + Animal.listOfAllAnimals);

        // Prints species requested by User to the console
        List<Animal> foundBySpecies = Animal.searchAnimalBySpecies("Zebra");
        for(Animal specificSpecies : foundBySpecies) {
            System.out.println(specificSpecies);
        }

        // Prints only the available animals in the shelter who can be adopted
        List<Animal> currentlyAvailableAnimals = Animal.currentlyAvailableAnimals();
        for(Animal availableAnimal : currentlyAvailableAnimals) {
            System.out.println("You can adopt: " + availableAnimal);
        }
    }
}
