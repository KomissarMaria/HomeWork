package lesson04.Task5_package;

/**
 * Написать класс «автомобиль» Car, который должен уметь заводится on(), глушить мотор off(), ехать go() и держать необходимую скорость setSpeed(int speed)
 */
public class Main {
    public static void main(String[] args) {
        Car auto = new Car();

        auto.turnOn();
        auto.go();
        auto.setSpeed(130);
        auto.turnOff();
    }
}

