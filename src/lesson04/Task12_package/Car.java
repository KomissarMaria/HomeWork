package lesson04.Task12_package;

public class Car {
    boolean turn;
    int speed;
    String name;

    public Car(String carname) {
        turn = false;
        speed = 0;
        name = carname;
    }

    void turnOn() {
        turn = true;
        System.out.println(name + " завелась!");
    }

    void turnOff() {
        turn = false;
        speed = 0;
        System.out.println("Заглушили мотор у " + name);
    }

    void go() {
        if (turn) System.out.println(name + " едет!");
    }

    void setSpeed(int speed) {
        if (turn) {
            this.speed = speed;
            System.out.println(name + " едет со скоростью " + this.speed + " км/ч");
        }
    }

}
