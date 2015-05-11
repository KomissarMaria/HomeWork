import java.util.Random;
import java.util.Scanner;

/**
 * Модифицировать класс Counter так, чтобы он циклически выводил числа из определенного диапазона
 */
public class Task2 {
    public static class Counter extends Thread {
        private int round;

        private Counter(int round) {
            this.round = round;
        }

        public void run() {
            Random random = new Random();
            while (!isInterrupted()) {
                System.out.println(getId() + ": " + random.nextInt(round));
                try {
                    Thread.sleep(1000); // закомментировать
                } catch (InterruptedException e) {
                    System.out.println("sleep() interrupted!");
                    return;
                }
            }
            System.out.println("isInterrupted() : false");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите диапазон для выводимых чисел: ");
        Counter c = new Counter(scanner.nextInt());
        c.start();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        c.interrupt();
    }
}
