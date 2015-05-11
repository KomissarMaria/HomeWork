package lesson16.Task1_package;

/**
 * Изменить решение задачи про банк так, чтобы баланс никогда не становился меньше 100 у.е.
 */
public class AccountDemo {
    public static void main(String[] args) throws Exception {
        Account acc = new Account(999, 100);
        for (int i = 0; i < 100; i++) {
            Action act = new Action(acc, 10);
            act.start();
        }
        Thread.sleep(5000);
        System.out.println(acc.get());
    }
}
