package lesson05.Task6_package;

//насекомые
public class Insecta {
    protected String name;
    protected boolean haveWings;
    protected boolean metamorphose;


    @Override
    public String toString() {
        if (haveWings) return name + " has a wings";
        else return name + " has no wings";
    }
}
