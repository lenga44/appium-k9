package lab_09;


import java.security.SecureRandom;

public abstract class Animal {
    private int speed;

    public Animal() {
        this.speed = new SecureRandom().nextInt(getMAXSpeed());
    }
    public int getSpeed() {
        return speed;
    }

    public abstract int getMAXSpeed();

}
