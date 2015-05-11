package lesson16.Task2_package;

public class ArrayClass {
    public int sum = 0, len;
    public int[] array;

    public ArrayClass(int len) {
        this.len = len;
        array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
        }
    }

    public int sumofarray() {
        int summa = 0;
        for (int i = 0; i < array.length; i++) {
            summa += array[i];
        }
        return summa;
    }
}
