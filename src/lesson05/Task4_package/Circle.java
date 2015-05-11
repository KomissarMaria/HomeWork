package lesson05.Task4_package;

public class Circle extends Figure {
    private int rad;

    public Circle(int rad) {
        this.rad = rad;
        this.name = "Круг";
    }

    @Override
    public double findsquare() {
        square = Math.pow(rad, 2) * Math.PI;
        return square;
    }

    @Override
    public void print() {
        for (int i = 0; i <= rad; i++) {

            System.out.println("******");
        }
        System.out.println("  ******  ");
        System.out.println(" ******** ");
        System.out.println("**********");
        System.out.println(" ******** ");
        System.out.println("  ******  ");
    }
}
