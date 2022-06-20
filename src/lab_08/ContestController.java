package lab_08;


import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import static lab_08.Animal.Builder;

public class ContestController {
    public static void main(String[] args) {
        Animal eagle = new Builder().setName("Eagle").setSpeed(new SecureRandom().nextInt(100)).setFlyable(true).build();
        Animal falcon = new Builder().setName("Falcon").setSpeed(new SecureRandom().nextInt(100)).setFlyable(true).build();
        Animal tiger = new Builder().setName("Tiger").setSpeed(new SecureRandom().nextInt(70)).setFlyable(false).build();
        Animal snake = new Builder().setName("Snake").setSpeed(new SecureRandom().nextInt(100)).setFlyable(false).build();

        ContestController contestController = new ContestController();
        contestController.getWinner(Arrays.asList(eagle,falcon,tiger,snake));

    }

    public static void getWinner(List<Animal> animalList){
        int fastestSpeed = 0;
        String animalName = null;
        for (Animal animal : animalList) {
            if(animal.isFlyable() == false){
                if (fastestSpeed < animal.getSpeed()){
                    fastestSpeed = animal.getSpeed();
                    animalName = animal.getName();
                }
            }
        }

        System.out.printf("Winer is %s with speed: %d",animalName,fastestSpeed);
    }

}
