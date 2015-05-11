package lesson04.Task12_package;

public class AutoparkRemoteControl {
    Car[] autopark;

    public AutoparkRemoteControl(Car[] cars) {
        if (cars == null)
            autopark = new Car[0];
        else {
            autopark = new Car[cars.length];

            for (int i = 0; i < cars.length; i++) {
                autopark[i] = cars[i];
            }
        }
    }

    void onCars() {
        for (int i = 0; i < autopark.length; i++) {
            autopark[i].turnOn();
        }

        if (autopark.length == 0) System.out.println("В автопарке нет машин!");
    }

    void offCars() {
        for (int i = 0; i < autopark.length; i++) {
            autopark[i].turnOff();
        }

        if (autopark.length == 0) System.out.println("В автопарке нет машин!");
    }

}
