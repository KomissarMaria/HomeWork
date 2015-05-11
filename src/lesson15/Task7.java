import java.util.Date;
import java.util.Scanner;

/**
 * Создать поток, который будет каждые 10 секунд выводить текущее время на экран. Сделать возможность прерывания потока с помощью команды с консоли.
 */
public class Task7 {
    public static class Time extends Thread {
        public void run() {
            while (!isInterrupted()) {
                Date now = new Date();
                try {
                    System.out.println(now);
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted!");
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        Time c = new Time();
        c.start();
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                String enter = scanner.nextLine();
                if (enter.equals("exit")) {
                    c.interrupt();
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
