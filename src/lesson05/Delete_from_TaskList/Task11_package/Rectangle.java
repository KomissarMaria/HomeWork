package lesson05.Delete_from_TaskList.Task11_package;

public class Rectangle extends Figure {
    private int high, weight;

    public Rectangle(int high, int weight) {
        this.high = high;
        this.weight = weight;
        this.name = "Прямоугольник";
    }

    @Override
    public double findsquare() {
        square = high * weight;
        return square;
    }

    @Override
    public void print() {
        for (int i = 0; i < high; i++) {
            for (int j = 0; j < weight; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    public int sumside() {
        return 2 * high + 2 * weight;
    }

}
