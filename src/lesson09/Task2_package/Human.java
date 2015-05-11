package lesson09.Task2_package;

public class Human implements Cloneable {
    private String sex;
    private String name;
    private int age;

    public Human(String sex, String name, int age) {
        this.sex = sex;
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;

        if (this.getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (this.name == null || human.name == null) return false;
        if (this.sex == null || human.sex == null) return false;

        if ((this.name.equals(human.name)) && (this.age == human.age) && (this.sex.equals(human.sex))) return true;
        else return false;
    }

    @Override
    public int hashCode() {
        int result = sex != null ? sex.hashCode() : 15;
        result = 31 * result + (name != null ? name.hashCode() : 0) * 15;
        result = 31 * result * age;
        return result;
    }

    @Override
    public String toString() {
        String stroka = name + " is a " + sex + ", " + age + " years old";
        return stroka;

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Human o = (Human) super.clone();
        return o;
    }
}
