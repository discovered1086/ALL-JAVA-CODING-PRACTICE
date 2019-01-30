package com.kingshuk.multithreading.threadprogramming.threadingin2017.synchronization;

/**
 * Created by kingshuk on 10/30/17.
 */
public class SynchronizationTest {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(3091156, "Savings", 89000.00);
        AccountHolder accountHolder1 = new AccountHolder("Kingshuk", account);
        AccountHolder accountHolder2 = new AccountHolder("Deeksha", account);


        AccountManager accountManager = new AccountManager();

        accountHolder1.setAccountManager(accountManager);
        accountHolder2.setAccountManager(accountManager);

        accountHolder1.setAccountAction(new AccountAction("debit",80000.00));
        accountHolder2.setAccountAction(new AccountAction("debit",40000.00));



        Thread t1=new Thread(accountHolder1, accountHolder1.getName());

        Thread t2=new Thread(accountHolder2, accountHolder2.getName());

        t1.start();

        t2.start();

    }
}
