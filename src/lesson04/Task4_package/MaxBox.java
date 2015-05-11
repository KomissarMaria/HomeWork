package lesson04.Task4_package;

public class MaxBox {
    private int a;
    final int MAX_VALUE = 1024;

    private MaxBox() {

    }

    public void setA(int a) {
        if (a >= 0)
            this.a = (a > MAX_VALUE) ? MAX_VALUE : (a > this.a) ? a : this.a;
    }

    public int getA() {
        return a;
    }

    public static MaxBox newInstance() {
        MaxBox box = new MaxBox();

        return box;
    }

}
