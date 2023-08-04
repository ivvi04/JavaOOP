package Lesson2.account.classes;

import Lesson2.account.interfaces.AccountInterface;

public class Account extends AccountAbstract {

    public Account (Double balance) {
        super(balance);
    }

    public void replenish (Double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            throw new Error("Сумма пополнения меньше или равна нулю!");
        }
    }

    public void withdraw (Double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            throw new Error("Запрашиваемая сумма больше текущего баланса!");
        }
    }
}
