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

        try {
            account.replenish(-10.0);
        } catch (Error e) {
            System.out.println(e.getMessage());
        }

        try {
            accountCredit.withdraw(200.0);
        } catch (Error e) {
            System.out.println(e.getMessage());
        }

        try {
            accountCredit.withdraw(100.0);
            System.out.println(accountCredit.getCurrentBalance());
        } catch (Error e) {
            System.out.println(e.getMessage());
        }

        try {
            accountDeposit.withdraw(100.0);
            System.out.println(accountDeposit.getCurrentBalance());
        } catch (Error e) {
            System.out.println(e.getMessage());
        }

        try {
            accountDeposit.withdraw(100.0);
            System.out.println(accountDeposit.getCurrentBalance());
        } catch (Error e) {
            System.out.println(e.getMessage());
        }
    }
}