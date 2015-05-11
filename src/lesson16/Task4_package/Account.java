package lesson16.Task4_package;

import java.util.concurrent.atomic.AtomicInteger;

public class Account {
    int balance;
    AtomicInteger money = new AtomicInteger();

    public Account(int money, int balance) {
        this.money.set(money);
        this.balance = balance;
    }

    public int get() {
        return money.get();
    }

    public void set(int x) {
        money.set(x);
    }
}
