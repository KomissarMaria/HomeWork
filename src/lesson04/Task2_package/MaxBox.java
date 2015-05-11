package lesson04.Task2_package;

public class MaxBox {
    private int a;

    public void setA(int a) {
        if (a >= 0)
            this.a = (a > this.a) ? a : this.a;
    }

    public int getA() {
        return a;
    }
}
