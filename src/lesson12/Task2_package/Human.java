package lesson12.Task2_package;

public class Human implements Cloneable {
    private Sex sex;
    private String name;
    private int age;
    private Temperament temperament;


    public Human(Sex sex, String name, int age, Temperament temperament) {
        this.sex = sex;
        this.age = age;
        this.name = name;
        this.temperament = temperament;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;

        if (this.getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (this.name == null || human.name == null) return false;
        if ((this.name.equals(human.name)) && (this.age == human.age) && (this.sex == human.sex) && (this.temperament == human.temperament))
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        int result = sex.ordinal() * 2;
        result = 31 * result + (name != null ? name.hashCode() : 0) * 15;
        result = 31 * result * age;
        return result;
    }

    @Override
    public String toString() {
        return name + " is a " + temperament.name() + " " + sex.name() + ", " + age + " years old";

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Human o = (Human) super.clone();
        return o;
    }
}
