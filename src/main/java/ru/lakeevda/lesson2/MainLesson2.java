package ru.lakeevda.lesson2;

import ru.lakeevda.lesson2.account.classes.Account;
import ru.lakeevda.lesson2.account.classes.AccountCredit;
import ru.lakeevda.lesson2.account.classes.AccountDeposit;
import ru.lakeevda.lesson2.account.classes.AccountFixed;

public class MainLesson2 {
    public static void main(String[] args) {
        Account account = new Account(0.0);
        AccountCredit accountCredit = new AccountCredit(0.0, 1.0);
        AccountDeposit accountDeposit = new AccountDeposit(0.0);
        AccountFixed accountFixed = new AccountFixed(400.0);

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

        System.out.println("Баланс фиксированного счета: " + accountFixed.getCurrentBalance());

        try {
            System.out.println("Пополнение обычного счета на сумму -10.0");
            account.replenish(-10.0);
            System.out.println("Баланс обычного счета: " + account.getCurrentBalance());
        } catch (Exception e) {
            System.out.println("Баланс обычного счета: " + e.getMessage());
        }

        try {
            System.out.println("Пополнение с фиксированного счета суммы 100.0");
            accountFixed.replenish(100.0);
            System.out.println(accountFixed.getCurrentBalance());
            System.out.println("Баланс фиксированного счета: " + accountFixed.getCurrentBalance());
        } catch (Exception e) {
            System.out.println("Баланс фиксированного счета: " + e.getMessage());
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

        try {

            System.out.println("Снятие с фиксированного счета суммы 100.0");
            accountFixed.withdraw(100.0);
            System.out.println("Баланс фиксированного счета: " + accountFixed.getCurrentBalance());
        } catch (Exception e) {
            System.out.println("Баланс фиксированного счета: " + e.getMessage());
        }
    }
}