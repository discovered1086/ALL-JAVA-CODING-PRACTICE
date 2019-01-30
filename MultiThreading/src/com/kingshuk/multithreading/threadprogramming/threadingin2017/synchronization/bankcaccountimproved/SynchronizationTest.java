package com.kingshuk.multithreading.threadprogramming.threadingin2017.synchronization.bankcaccountimproved;

/**
 * Created by kingshuk on 10/30/17.
 */
public class SynchronizationTest {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(3091156, "Savings", 89000.00);
        AccountHolder accountHolder1 = new AccountHolder("Kingshuk", account);
        AccountHolder accountHolder2 = new AccountHolder("Deeksha", account);
        AccountHolder accountHolder3 = new AccountHolder("Amit", account);

        Thread t1=new Thread(new AccountManager(ActionTypes.DEBIT,84000.00,accountHolder1)
                            ,accountHolder1.getName());

        Thread t2=new Thread(new AccountManager(ActionTypes.CREDIT, 87000.00, accountHolder2),
                            accountHolder2.getName());

        Thread t3=new Thread(new AccountManager(ActionTypes.CHECK_BALANCE, 0.00, accountHolder3),
                accountHolder3.getName());


        t3.start();
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The final account balance is "+account.getAccountBalance());


    }
}
