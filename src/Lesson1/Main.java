package Lesson1;

import Lesson1.account.Account;
import Lesson1.account.AccountCredit;
import Lesson1.account.AccountDeposit;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(0.0);
        AccountCredit accountCredit = new AccountCredit(0.0, 1.0);
        AccountDeposit accountDeposit = new AccountDeposit(0.0);

        account.replenish(100.0);
        accountCredit.replenish(200.0);
        accountDeposit.replenish(300.0);

        System.out.println("Баланс обычного счета: " + account.getCurrentBalance());
        System.out.println("Баланс кредитного счета: " + accountCredit.getCurrentBalance());
        System.out.println("Баланс депозитного счета: " + accountDeposit.getCurrentBalance());

        System.out.println("Пополнение обычного счета на сумму -10.0");

        try {
            account.replenish(-10.0);
        } catch (Error e) {
            System.out.println("Баланс обычного счета: " + e.getMessage());
        }

        System.out.println("Снятие с кредитного счета суммы 200.0");

        try {
            accountCredit.withdraw(200.0);
        } catch (Error e) {
            System.out.println("Баланс кредитного счета: " + e.getMessage());
        }

        System.out.println("Снятие с кредитного счета суммы 100.0");

        try {
            accountCredit.withdraw(100.0);
            System.out.println("Баланс кредитного счета: " + accountCredit.getCurrentBalance());
        } catch (Error e) {
            System.out.println("Баланс кредитного счета: " + e.getMessage());
        }

        System.out.println("Снятие с депозитного счета суммы 100.0");

        try {
            accountDeposit.withdraw(100.0);
            System.out.println("Баланс депозитного счета: " + accountDeposit.getCurrentBalance());
        } catch (Error e) {
            System.out.println("Баланс депозитного счета: " + e.getMessage());
        }

        System.out.println("Снятие с депозитного счета суммы 100.0");

        try {
            accountDeposit.withdraw(100.0);
            System.out.println(accountDeposit.getCurrentBalance());
            System.out.println("Баланс депозитного счета: " + accountDeposit.getCurrentBalance());
        } catch (Error e) {
            System.out.println("Баланс депозитного счета: " + e.getMessage());
        }
    }
}