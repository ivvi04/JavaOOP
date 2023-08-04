package Lesson1.account;

public class Account {

    private double balance;

    public Account (Double balance) {
        this.balance = balance;
    }

    // Пополнить баланс счета
    public void replenish (Double amount) throws Exception {
        if (amount > 0) {
            this.balance += amount;
        } else {
            throw new Exception("Сумма пополнения меньше или равна нулю!");
        }
    }

    // Снять средства со счета
    public void withdraw (Double amount) throws Exception {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            throw new Exception("Запрашиваемая сумма больше текущего баланса!");
        }
    }

    public Double getCurrentBalance () {
        return this.balance;
    }
}
