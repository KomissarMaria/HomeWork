package lesson12.Task2_1_package;

public class Human {
    private int age;
    private Sex sex;
    private Temperament temperament;

    public Human(int age, Sex sex, Temperament temperament) {
        this.age = age;
        this.temperament = temperament;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public Temperament getTemperament() {
        return temperament;
    }
}
