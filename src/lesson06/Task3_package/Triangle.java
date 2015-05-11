package lesson06.Task3_package;

public class Triangle extends Figure {
    private int high, weight;

    public Triangle(int high) {
        this.high = high;
        this.weight = 2 * high - 1;
        this.name = "Треугольник";
    }

    @Override
    public double findsquare() {
        square = weight / 4 * Math.sqrt(4 * Math.pow(high, 2) - Math.pow(weight, 2));
        return square;
    }

    @Override
    public void print() {
        for (int i = 0; i < high; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    public int sumside() {
        return 2 * high + weight;
    }

}
