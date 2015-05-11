package lesson04.Task8_package;

/**
 * 1. Добавитьсвойство«расходтоплива»в класс Engine.
 * 2. Написать код для вывода потраченного топлива на экран
 */
public class Main {
    public static void main(String[] args) {
        try {
            final Car bmw = new Car("BMW", 8);
            final Car ferrari = new Car("Ferrari", 20000, 12);

            bmw.turnOn();
            ferrari.turnOn();

            int[] speeds = {20, 60, 100};

            for (int s : speeds)
                bmw.start(s, 0.5);

            for (int s : speeds)
                ferrari.start(s, 1);

            bmw.turnOff();
            ferrari.turnOff();

            System.out.println("Cars count: " + Car.count);
            System.out.println(bmw.getName() + ": " + bmw.getMileage() + " ml, " + bmw.getFuel() + " liters of fuel was spent");
            System.out.println(ferrari.getName() + ": " + ferrari.getMileage() + " ml, " + ferrari.getFuel() + " liters of fuel was spent");
        } catch (Exception ex) {
            System.out.println("Error!");
        }
    }
}

