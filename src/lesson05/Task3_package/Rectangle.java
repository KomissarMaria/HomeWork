package lesson05.Task3_package;

public class Rectangle {
    private int height, weight;
    private final char SYM = '@';

    public Rectangle(Rectangle rec) {
        this.height = rec.height;
        this.weight = rec.weight;
    }

    public Rectangle(int high, int weight) {
        this.height = high;
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void print() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.weight; j++) {
                System.out.print(SYM);
            }
            System.out.println();
        }
    }
}
