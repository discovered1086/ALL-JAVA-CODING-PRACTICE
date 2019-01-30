package com.kingshuk.multithreading.threadprogramming.threadingin2017.executor;

/**
 * Created by kingshuk on 10/30/17.
 */
public class AccountHolder implements Runnable{

    private String Name;
    private BankAccount bankAccount;
    private AccountAction accountAction;
    private AccountManager accountManager;

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

    public AccountAction getAccountAction() {
        return accountAction;
    }

    public void setAccountAction(AccountAction accountAction) {
        this.accountAction = accountAction;
    }

    public AccountManager getAccountManager() {
        return accountManager;
    }

    public void setAccountManager(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    @Override
    public void run() {
        try {
            this.getAccountManager().performBankActions(this, this.accountAction);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
