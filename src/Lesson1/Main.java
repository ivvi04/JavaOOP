package Lesson1;

import Lesson1.account.Account;
import Lesson1.account.AccountCredit;
import Lesson1.account.AccountDeposit;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(0.0);
        AccountCredit accountCredit = new AccountCredit(0.0, 1.0);
        AccountDeposit accountDeposit = new AccountDeposit(0.0);

        try {
            account.replenish(100.0);
            System.out.println("Баланс обычного счета: " + account.getCurrentBalance());
        } catch (Exception e) {
            System.out.println("Баланс обычного счета: " + e.getMessage());
        }

        try {
            accountCredit.replenish(200.0);
            System.out.println("Баланс кредитного счета: " + accountCredit.getCurrentBalance());
        } catch (Exception e) {
            System.out.println("Баланс кредитного счета: " + e.getMessage());
        }

        try {
            accountDeposit.replenish(300.0);
            System.out.println("Баланс депозитного счета: " + accountDeposit.getCurrentBalance());
        } catch (Exception e) {
            System.out.println("Баланс депозитного счета: " + e.getMessage());
        }

        try {
            System.out.println("Пополнение обычного счета на сумму -10.0");
            account.replenish(-10.0);
            System.out.println("Баланс обычного счета: " + account.getCurrentBalance());
        } catch (Exception e) {
            System.out.println("Баланс обычного счета: " + e.getMessage());
        }

        try {
            System.out.println("Снятие с кредитного счета суммы 200.0");
            accountCredit.withdraw(200.0);
            System.out.println("Баланс кредитного счета: " + accountCredit.getCurrentBalance());
        } catch (Exception e) {
            System.out.println("Баланс кредитного счета: " + e.getMessage());
        }

        try {
            System.out.println("Снятие с кредитного счета суммы 100.0");
            accountCredit.withdraw(100.0);
            System.out.println("Баланс кредитного счета: " + accountCredit.getCurrentBalance());
        } catch (Exception e) {
            System.out.println("Баланс кредитного счета: " + e.getMessage());
        }

        try {
            System.out.println("Снятие с депозитного счета суммы 100.0");
            accountDeposit.withdraw(100.0);
            System.out.println("Баланс депозитного счета: " + accountDeposit.getCurrentBalance());
        } catch (Exception e) {
            System.out.println("Баланс депозитного счета: " + e.getMessage());
        }

        try {
            System.out.println("Снятие с депозитного счета суммы 100.0");
            accountDeposit.withdraw(100.0);
            System.out.println("Баланс депозитного счета: " + accountDeposit.getCurrentBalance());
        } catch (Exception e) {
            System.out.println("Баланс депозитного счета: " + e.getMessage());
        }
    }
}