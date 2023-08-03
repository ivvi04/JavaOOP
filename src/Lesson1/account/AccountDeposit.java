package Lesson1.account;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AccountDeposit extends Account{

    private LocalDateTime lastWithdrawal = null;

    public AccountDeposit(Double balance) {
        super(balance);
    }

    @Override
    public void withdraw(Double amount) {
        if (this.lastWithdrawal == null) {
            super.withdraw(amount);
            this.lastWithdrawal = LocalDateTime.now();
        } else {
            if(ChronoUnit.DAYS.between(this.lastWithdrawal, LocalDateTime.now()) >= 1) {
                super.withdraw(amount);
            } else {
                throw new Error("Снятие средств разрешено не ранее " +
                        lastWithdrawal.plusDays(1).format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")));
            }
        }
    }
}
