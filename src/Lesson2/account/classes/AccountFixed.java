package Lesson2.account.classes;

public class AccountFixed extends AccountAbstract {

    public AccountFixed(Double balance) {
        super(balance);
    }

    @Override
    public void replenish(Double amount) throws Exception {
        throw new Exception("Пополнение баланса запрещено");
    }

    @Override
    public void withdraw(Double amount) throws Exception {
        throw new Exception("Снятие средств запрещено");
    }

}
