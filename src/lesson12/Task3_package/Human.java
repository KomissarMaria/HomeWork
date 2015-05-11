package lesson12.Task3_package;

import java.io.Serializable;

public class Human implements Serializable{
    private int age;
    private Sex sex;
    private Temperament temperament;
    private static final long serialVersionUID = 1L;

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

    @Override
    public String toString() {
        return "Human is a " + temperament.name() + " " + sex.name() + ", " + age + " years old";
    }
}
