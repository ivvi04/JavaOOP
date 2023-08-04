package Lesson2.account.interfaces;

public interface AccountInterface {

    // Пополнить баланс счета
    public void replenish (Double amount);

    // Снять средства со счета
    public void withdraw (Double amount);

    // Получить текущий баланс счета
    public Double getCurrentBalance ();
}
