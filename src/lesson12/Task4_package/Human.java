package lesson12.Task4_package;

import java.io.Serializable;

public class Human implements Serializable {
    private int age;
    private Sex sex;
    private String name;
    private String surname;
    private static final long serialVersionUID = 1L;

    public Human(String name, String surname, int age, Sex sex) {
        this.age = age;
        this.sex = sex;
        this.name = name;
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return surname + " " + name + " is a " + sex.name() + ", " + age + " years old";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;

        Human human = (Human) o;

        if (age != human.age) return false;
        if (name != null ? !name.equals(human.name) : human.name != null) return false;
        if (sex != human.sex) return false;
        if (surname != null ? !surname.equals(human.surname) : human.surname != null) return false;

        return true;
    }

}
