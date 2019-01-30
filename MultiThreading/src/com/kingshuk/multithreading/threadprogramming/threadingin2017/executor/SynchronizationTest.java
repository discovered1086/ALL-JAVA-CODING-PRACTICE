package com.kingshuk.multithreading.threadprogramming.threadingin2017.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by kingshuk on 10/30/17.
 */
public class SynchronizationTest {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(3091157, "Savings", 89000.00);
        AccountHolder accountHolder1 = new AccountHolder("Kingshuk", account);
        AccountHolder accountHolder2 = new AccountHolder("Deeksha", account);


        AccountManager accountManager = new AccountManager();

        accountHolder1.setAccountManager(accountManager);
        accountHolder2.setAccountManager(accountManager);

        accountHolder1.setAccountAction(new AccountAction("debit",80000.00));
        accountHolder2.setAccountAction(new AccountAction("debit",2000.00));



        /*Thread t1=new Thread(accountHolder1, accountHolder1.getName());

        Thread t2=new Thread(accountHolder2, accountHolder2.getName());

        t1.start();

        t2.start();*/

        /*Executor executor= Executors.newFixedThreadPool(10);

        Runnable accountHolder1Thread=accountHolder1;

        Runnable accountHolder2Thread=accountHolder2;


        executor.execute(accountHolder1Thread);

        executor.execute(accountHolder2Thread);*/

        //The above is one way to use the executors. Another is by using the executor service

        ExecutorService service=Executors.newFixedThreadPool(10);

        Runnable accountHolder1Thread=accountHolder1;

        Runnable accountHolder2Thread=accountHolder2;

        service.submit(accountHolder1Thread);

        service.submit(accountHolder2Thread);


        if(!service.isShutdown()){
            service.shutdown();
        }

    }
}
