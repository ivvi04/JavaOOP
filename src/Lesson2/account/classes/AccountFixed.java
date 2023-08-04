package Lesson2.account.classes;

public class AccountFixed extends AccountAbstract {

    public AccountFixed(Double balance) {
        super(balance);
    }

    @Override
    public void replenish(Double amount) {
        throw new Error("Пополнение баланса запрещено");
    }

    @Override
    public void withdraw(Double amount) {
        throw new Error("Снятие средств запрещено");
    }

    @Override
    public Double getCurrentBalance() {
        return this.balance;
    }
}
