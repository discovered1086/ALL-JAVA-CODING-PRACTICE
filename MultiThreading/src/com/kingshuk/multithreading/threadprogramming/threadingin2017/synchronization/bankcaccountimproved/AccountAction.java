package com.kingshuk.multithreading.threadprogramming.threadingin2017.synchronization.bankcaccountimproved;

public interface AccountAction {
    void debitAccount(BankAccount bankAccount, Double amount);

    void creditAccount(BankAccount bankAccount, Double amount);

    void checkBalance(BankAccount bankAccount);

    void updateContactInfo(AccountHolder accountHolder);
}
