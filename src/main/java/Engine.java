

import java.util.ArrayList;
import java.util.Scanner;

public class Engine {
    ArrayList<Pet> pets = new ArrayList<Pet>();

    public void start() {
        Integer numberOfPets = getIntegerInput("How many pets do you have?");
        for (int i = 0; i< numberOfPets; i++){
            boolean validInput = false;
            String typeOfPet = "default";
            while(!validInput){
                typeOfPet = getStringInput(String.format("What kind of pet is pet %d \n Enter dog,cat, or hamster.",i));
                validInput = isValidPetType(typeOfPet);

            }
            String name = getStringInput("What is this pet's name?");
            addPet(createPet(typeOfPet,name));
        }
        System.out.println(getPetInfo());

    }

    private String getPetInfo() {
        StringBuilder sb = new StringBuilder();
        for (Pet d : pets){
            sb.append(String.format("\n%s says %s",d.getName(), d.speak()));
        }
        return sb.toString();
    }

    public void addPet(Pet d){
        pets.add(d);
    }

    private Pet createPet(String typeOfPet, String name) {
        switch (typeOfPet.toLowerCase().trim()){
            case "dog":
                return new Dog(name);
            case "cat":
                return new Cat(name);
            case "hamster":
                return new Hamster(name);
            default:
                return null;

        }
    }

    private boolean isValidPetType(String pet) {
        switch (pet.toLowerCase().trim()){
            case "dog":
            case "cat":
            case "hamster":
                return true;
            default:
                return false;
        }
    }

    private String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    private Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        while(!scanner.hasNext()){
            scanner.next();
            System.out.println("Please enter a positive integer");
        }
        int userInput = scanner.nextInt();
        return userInput;
    }
}
