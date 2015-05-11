package lesson16.Task1_package;

public class Account {
    int money, balance;

    public Account(int money, int balance) {
        this.money = money;
        this.balance = balance;
    }

    public int get() {
        return money;
    }

    public void set(int x) {
        money = x;
    }
}
