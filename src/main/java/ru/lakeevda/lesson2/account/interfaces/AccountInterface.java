package ru.lakeevda.lesson2.account.interfaces;

public interface AccountInterface {

    // Пополнить баланс счета
    public void replenish (Double amount) throws Exception;

    // Снять средства со счета
    public void withdraw (Double amount) throws Exception;

    // Получить текущий баланс счета
    public Double getCurrentBalance ();
}
