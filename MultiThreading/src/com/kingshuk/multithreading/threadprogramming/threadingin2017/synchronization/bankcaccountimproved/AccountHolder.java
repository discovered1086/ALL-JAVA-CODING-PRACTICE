package com.kingshuk.multithreading.threadprogramming.threadingin2017.synchronization.bankcaccountimproved;

/**
 * Created by kingshuk on 10/30/17.
 */
public class AccountHolder{

    private String Name;
    private BankAccount bankAccount;

    public AccountHolder(String name, BankAccount bankAccount) {
        Name = name;
        this.bankAccount = bankAccount;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

}
