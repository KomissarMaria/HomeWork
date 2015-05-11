package lesson05.Task6_package;

//ногохвостики
public class Collembola extends Apterygota {

    public Collembola(String name) {
        this.hastails = "has legs";
        this.haslegs = "does\'n has tails";
        this.name = name;
    }

    @Override
    public String toString() {
        if (haveWings) return name + " has a wings and " + hastails + " and " + haslegs;
        else return name + " has no wings and " + hastails + " and " + haslegs;
    }

}
