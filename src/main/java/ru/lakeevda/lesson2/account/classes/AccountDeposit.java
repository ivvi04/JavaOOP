package ru.lakeevda.lesson2.account.classes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AccountDeposit extends Account {

    private LocalDateTime lastWithdrawal = LocalDateTime.now().minusDays(1);

    public AccountDeposit(Double balance) {
        super(balance);
    }

    @Override
    public void withdraw(Double amount) throws Exception {
        long days = ChronoUnit.DAYS.between(this.lastWithdrawal, LocalDateTime.now());
        if (this.lastWithdrawal == null || days >= 1) {
            super.withdraw(amount);
            this.lastWithdrawal = LocalDateTime.now();
        } else {
            if(days == 0) {
                throw new Exception("Снятие средств разрешено не ранее " +
                        lastWithdrawal.plusDays(1).format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")));
            }
        }
    }
}
