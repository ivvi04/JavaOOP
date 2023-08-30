package ru.lakeevda.lesson2.account.classes;

public class Account extends AccountAbstract {

    public Account (Double balance) {
        super(balance);
    }

    public void replenish (Double amount) throws Exception {
        if (amount > 0) {
            this.balance += amount;
        } else {
            throw new Exception("Сумма пополнения меньше или равна нулю!");
        }
    }

    public void withdraw (Double amount) throws Exception {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            throw new Exception("Запрашиваемая сумма больше текущего баланса!");
        }
    }
}
