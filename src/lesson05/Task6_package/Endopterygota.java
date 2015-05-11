package lesson05.Task6_package;

//Насекомые с полным превращением
public class Endopterygota extends Pterygota {
    private String type;

    public Endopterygota(String name) {
        this.type = "complete cycle of metamorphosis";
        this.name = name;
    }

    @Override
    public String toString() {
        if (haveWings) return name + " has a wings and " + type;
        else return name + " has no wings" + type;
    }
}
