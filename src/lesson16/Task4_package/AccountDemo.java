package lesson16.Task4_package;

/**
 * Решить задачу про банк с помощью java.util.concurrent.atomic.*
 */
public class AccountDemo {
    public static void main(String[] args) throws Exception {
        Account acc = new Account(999, 100);
        for (int i = 0; i < 100; i++) {
            Action act = new Action(acc, 10);
            act.start();
        }
        Thread.sleep(50);
        System.out.println(acc.get());
    }
}
