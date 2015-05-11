/**
 * Создать поток, который создаст 50 потоков, каждый из которых выведет на экран свой номер и дождется, пока его прервут. Прерывание дочерних потоков должно выполнятся из потока их порождающего
 */
public class Task4 {
    public static class Current extends Thread {
        public void run() {
            System.out.println(getId() + " is sterted");
            while (!isInterrupted()) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    System.out.println(getId() + " is interrupted!");
                    return;
                }
            }
        }
    }

    public static class MainCurrent extends Thread {
        public void run() {
            int n = 50;
            Current[] numbers = new Current[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = new Current();
                numbers[i].start();
            }

            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                for (int i = 0; i < n; i++) {
                    numbers[i].interrupt();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MainCurrent mainCurrent = new MainCurrent();
        mainCurrent.start();
    }
}
