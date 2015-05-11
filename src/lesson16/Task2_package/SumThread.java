package lesson16.Task2_package;

public class SumThread extends Thread {
    private int pos, num, summa = 0;
    private ArrayClass arrayClass;

    public SumThread(int pos, int num, ArrayClass arrayClass) {
        this.pos = pos;
        this.num = num;
        this.arrayClass = arrayClass;
    }

    @Override
    public void run() {
        for (int i = pos; i < num; i++) {
            summa += arrayClass.array[i];
        }
        synchronized (arrayClass) {
            arrayClass.sum += summa;
        }
    }
}
