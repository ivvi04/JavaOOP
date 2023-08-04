package Lesson2.account.classes;

public class AccountCredit extends Account {

    private final Double percent;

    public AccountCredit(Double balance, Double percent) {
        super(balance);
        this.percent = percent;
    }

    @Override
    public void withdraw(Double amount) throws Exception {
        super.withdraw(this.calcWithPercent(amount));
    }

    private Double calcWithPercent(Double amount) {
        return amount + (this.percent * 100 / amount);
    }
}
