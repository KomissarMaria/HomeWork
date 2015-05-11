package lesson16.Task4_package;

public class Action extends Thread {
    Account acc;
    int withdraw;

    public Action(Account acc, int withdraw) {
        this.acc = acc;
        this.withdraw = withdraw;
    }

    @Override
    public void run() {
        int old = acc.get();
        if (old - withdraw >= acc.balance) {
            if (!acc.money.compareAndSet(old, old - withdraw))
                System.out.println("Sorry do not have enough money in the account!");
        } else {
            System.out.println("Sorry do not have enough money in the account!");
        }
    }
}