package lab_09;


import java.util.Arrays;
import java.util.List;

public class ContestController {
    public static void main(String[] args) {
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dog = new Dog();

        getWinner(Arrays.asList(horse,tiger,dog));
    }

    public static void getWinner(List<Animal> animalList){
        int fastestSpeed = 0;
        String animalName = null;
        for (Animal animal : animalList) {
                if(fastestSpeed < animal.getSpeed()){
                    fastestSpeed = animal.getSpeed();
                    animalName = animal.getClass().getSimpleName();
                }
        }
        System.out.printf("Winer is %s with speed: %d",animalName,fastestSpeed);
    }
}
