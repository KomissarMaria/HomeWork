package lesson04.Task3_package;

public class MaxBox {
    private int a;
    final int MAX_VALUE = 1024;

    public void setA(int a) {
        if (a >= 0)
            this.a = (a > MAX_VALUE) ? MAX_VALUE : (a > this.a) ? a : this.a;
    }

    public int getA() {
        return a;
    }

}
