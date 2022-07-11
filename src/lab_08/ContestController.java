package lab_08;


import java.security.SecureRandom;
import java.util.*;

import static lab_08.Animal.Builder;

public class ContestController {
    public static void main(String[] args) {
        Animal eagle = new Builder().setName("Eagle").setSpeed(new SecureRandom().nextInt(100)).setFlyable(true).build();
        Animal falcon = new Builder().setName("Falcon").setSpeed(new SecureRandom().nextInt(100)).setFlyable(true).build();
        Animal tiger = new Builder().setName("Tiger").setSpeed(new SecureRandom().nextInt(100)).setFlyable(false).build();
        Animal snake = new Builder().setName("Snake").setSpeed(new SecureRandom().nextInt(100)).setFlyable(false).build();
        Animal dog = new Builder().setName("Dog").setSpeed(new SecureRandom().nextInt(100)).setFlyable(false).build();

        List<Animal> animalList = new ArrayList<Animal>(Arrays.asList(tiger, falcon, snake, eagle, dog));
        findWinnerAnimalsAndSpeed(animalList);
    }

    public static void findWinnerAnimalsAndSpeed(List<Animal> animalList) {
        List<Animal> animalListWithoutWings = new ArrayList<>();
        for (Animal animal : animalList) {
            if (!animal.isFlyable()) {
                animalListWithoutWings.add(animal);
            }
        }

        Map<Integer, List<Animal>> animalDataRecord = new HashMap<>();
        for (Animal animal : animalListWithoutWings) {
            if (animalDataRecord.containsKey(animal.getSpeed())) {
                animalDataRecord.get(animal.getSpeed()).add(animal);
            } else
                animalDataRecord.put(animal.getSpeed(), new ArrayList<>(Arrays.asList(animal)));
        }

        int animalWinnerSpeed = Collections.max(animalDataRecord.keySet());
        List<Animal> animalWinnerList = new ArrayList<>(animalDataRecord.get(animalWinnerSpeed));

        List<String> animalWinnerNameList = new ArrayList<>();
        for (Animal animal : animalWinnerList) {
            animalWinnerNameList.add(animal.getName());
        }
        System.out.println("Winner is : " + animalWinnerNameList + "  with speed: " + animalWinnerSpeed);

    }

}
