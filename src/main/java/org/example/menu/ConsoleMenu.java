package org.example.menu;

import org.example.model.*;
import org.example.shelter.Shelter;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ConsoleMenu {

    //Implementing scanner for terminal inputs
    private final Scanner scanner = new Scanner(System.in);

    private final Shelter<Animal> shelter = new Shelter<>();

    //Main menu options for shelter console app.
    private void printMenu() {
        System.out.println("Animal Shelter Menu");
        System.out.println("Type 1 to: Add a new animal");
        System.out.println("Type 2 to: List all animals");
        System.out.println("Type 3 to: Search animals by species");
        System.out.println("Type 4 to: Mark an animal as adopted");
        System.out.println("Type 5 to: Show available animals");
        System.out.print("Choose what to do in app: ");
    }

    //Start running the Shelter Menu
    public void startAnimalShelterMenu() {

        boolean appStarted = true;

        while (appStarted) {

            printMenu();

            int usersChoice = Integer.parseInt(scanner.nextLine());

            if (usersChoice == MenuOption.ADD_ANIMAL) {
                System.out.println("Adding the new animal: ");
                addAnimal();
            } else if (usersChoice == MenuOption.LIST_ALL_ANIMALS) {
                System.out.println("All animals in the shelter: ");
                listAllAnimals();
            } else if (usersChoice == MenuOption.SEARCH_BY_SPECIES) {
                System.out.println("Searching by species: ");
                searchBySpecies();
            } else if (usersChoice == MenuOption.MARK_AS_ADOPTED) {
                System.out.println("Changing animal's status to adopted: ");
                markAsAdopted();
            } else if (usersChoice == MenuOption.SHOW_AVAILABLE_ANIMALS) {
                System.out.println("All available animals in shelter: ");
                showAvailableAnimals();
            } else {
                System.out.println("Exiting the animal shelter app!");
                appStarted = false;
            }
        }
    }

    // Adds one animal to shelter
    private void addAnimal() {
        System.out.println("Choose from Bird,Dog,Cat: ");
        String species = scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Color: ");
        String color = scanner.nextLine();


        if (species.equalsIgnoreCase("bird")) {
            shelter.addAnimalToShelter(new Bird(name, age, color, AdoptionStatus.AVAILABLE));
        } else if (species.equalsIgnoreCase("dog")) {
            shelter.addAnimalToShelter(new Dog(name, age, color, AdoptionStatus.AVAILABLE));
        } else if (species.equalsIgnoreCase("cat")) {
            shelter.addAnimalToShelter(new Cat(name, age, color, AdoptionStatus.AVAILABLE));
        }
    }

    //Lists all the animals
    private void listAllAnimals() {
        for (Animal animal : shelter.getAllTheAnimalsFromShelter()) {
            System.out.println(animal);
        }
    }

    //Search by specific species of animal
    private void searchBySpecies() {
        System.out.print("Enter species to search for: ");
        String species = scanner.nextLine();
        for (Animal animal : shelter.searchAnimalBySpecies(species)) {
            System.out.println(animal);
        }
    }

    //Mark this animal as adopted so it goes out of shelter
    private void markAsAdopted() {
        System.out.print("Enter the ID of the animal to mark as adopted: ");
        int id = Integer.parseInt(scanner.nextLine());

        Optional<Animal> adoptedAnimal = shelter.markAnimalAsAdopted(id);
        if (adoptedAnimal.isPresent()) {
            System.out.println(adoptedAnimal.get().getName() + " has been marked as adopted!");
        } else {
            System.out.println("Did not find an animal with this ID: " + id);
        }
    }

    //Shows animal who are currently in the shelter
    private void showAvailableAnimals() {
        List<Animal> available = shelter.animalsCurrentlyAvailableInShelter();
        if (available.isEmpty()) {
            System.out.println("No animals currently available for adoption.");
            return;
        }
        for (Animal animal : available) {
            System.out.println("You can adopt: " + animal);
        }
    }
}