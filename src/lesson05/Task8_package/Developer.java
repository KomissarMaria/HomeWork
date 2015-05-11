package lesson05.Task8_package;

public abstract class Developer extends Person {

    public Developer(String name, double basicSalary, int experience) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.experience = experience;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public abstract double getSalary();
}
