package lesson05.Task6_package;

//щитинохвостики
public class Thysanura extends Apterygota {
    public Thysanura(String name) {
        this.hastails = "does\'n has legs";
        this.haslegs = "has tails";
        this.name = name;
    }

    @Override
    public String toString() {
        if (haveWings) return name + " has a wings and " + hastails + " and " + haslegs;
        else return name + " has no wings and " + hastails + " and " + haslegs;
    }

}
