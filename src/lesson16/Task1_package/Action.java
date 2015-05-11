package lesson16.Task1_package;

public class Action extends Thread {
    Account acc;
    int withdraw;

    public Action(Account acc, int withdraw) {
        this.acc = acc;
        this.withdraw = withdraw;
    }

    @Override
    public void run() {
        synchronized (acc) {
            int has = acc.get();
            if (has >= withdraw && (acc.get() - withdraw) >= acc.balance) {
                acc.set(acc.get() - withdraw);
            }
        }
    }
}