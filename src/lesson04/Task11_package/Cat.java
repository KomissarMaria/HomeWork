package lesson04.Task11_package;

public class Cat {
    private String name, color, kind;
    private int age, weight;

    public Cat(String name, int age, String kind) {
        this.name = name;
        this.age = age;
        this.kind = kind;
    }

    public Cat(String name, int age, String color, String kind) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.kind = kind;
    }

    public Cat(String name, int age, String color, int weight, String kind) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.kind = kind;
    }

    public void aboutCat() {
        String weightrstr = (this.weight != 0) ? ", он/она весит " + this.weight + " кг" : "";
        String colorstr = (this.color == null) ? "" : (this.color.equals("")) ? "" : this.color;

        System.out.println(this.name + " - " + colorstr + " " + this.kind + ", ему/ей " + this.age + " лет" + weightrstr);
    }

    public void say() {
        if (this.kind.equals("собака"))
            System.out.println("Гав");
        else if (this.kind.equals("кот"))
            System.out.println("Мяу");
        else if (this.kind.equals("мышь"))
            System.out.println("Пи-пи-пи");
        else
            System.out.println("И тишина...");
    }

}
