package lesson04.Task5_package;

public class Car {

    boolean turn;
    int speed;

    public Car() {
        turn = false;
        speed = 0;
    }

    void turnOn() {
        turn = true;
        System.out.println("Машина завелась!");
    }

    void turnOff() {
        turn = false;
        speed = 0;
        System.out.println("Заглушили мотор");
    }

    void go() {
        if (turn) System.out.println("Машина едет!");
    }

    void setSpeed(int speed) {
        if (turn) {
            this.speed = speed;
            System.out.println("Машина едет со скоростью " + this.speed + " км/ч");
        }
    }
}

