package Lesson2.account.classes;

import Lesson2.account.interfaces.AccountInterface;

public abstract class AccountAbstract implements AccountInterface {

    protected Double balance;

    public AccountAbstract(Double balance) {
        this.balance = balance;
    }

    public abstract void replenish(Double amount);

    public abstract void withdraw(Double amount);

    public Double getCurrentBalance() {
        return this.balance;
    };
}
