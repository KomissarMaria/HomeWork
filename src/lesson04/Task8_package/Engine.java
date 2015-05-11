package lesson04.Task8_package;

public class Engine {
    // число пройденных миль
    protected double mileage = 0;
    protected boolean started;
    //расход топлива на 100 миль
    protected double fuel;
    protected double amountfuel = 0;

    public Engine(double mileage, double fuel) {
        this.mileage = mileage;
        this.fuel = fuel;
    }

    public double getMileage() {
        return mileage;
    }

    public void addMileage(double mileage) {
        if (started) {
            this.mileage += mileage;
            this.amountfuel += mileage / 100 * this.fuel;
        }
    }

    public boolean isStarted() {
        return started;
    }

    public void turnOn() {
        started = true;
    }

    public void turnOff() {
        started = false;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }

    public double getAmountfuel() {
        return amountfuel;
    }

}
