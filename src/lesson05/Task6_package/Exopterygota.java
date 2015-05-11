package lesson05.Task6_package;

////Насекомые с неполным превращением
public class Exopterygota extends Pterygota {
    private String type;

    public Exopterygota(String name) {
        this.type = "incomplete cycle of metamorphosis";
        this.name = name;
    }

    @Override
    public String toString() {
        if (haveWings) return name + " has a wings and " + type;
        else return name + " has no wings" + type;
    }

}
