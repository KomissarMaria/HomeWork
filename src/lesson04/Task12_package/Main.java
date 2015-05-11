package lesson04.Task12_package;

/**
 * Написать класс AutoparkRemoteControl который бы при создании своего экземпляра принимал и запоминал массив из N автомобилей, и содержал методы onCars() и offCars() для запуска и глушения моторов всех автомобилей. Как вы спроектируете класс учитывая, что вместо массива машин может быть передано null?
 */
public class Main {
    public static void main(String[] args) {

        Car[] cars = new Car[5];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car("Машина N" + Integer.toString(i + 1));
        }

        AutoparkRemoteControl av = new AutoparkRemoteControl(cars);
        av.onCars();
        av.offCars();

        AutoparkRemoteControl am = new AutoparkRemoteControl(null);
        am.onCars();
        am.offCars();
    }
}

