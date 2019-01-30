package com.kingshuk.multithreading.threadprogramming.threadingin2017.synchronization.bankcaccountimproved;

/**
 * Created by kingshuk on 10/30/17.
 */
public class AccountActionImpl implements AccountAction {

    @Override
    public void debitAccount(BankAccount bankAccount, Double amount) {
        synchronized (bankAccount) {
            System.out.println("The account balance before debit is " + bankAccount.getAccountBalance());
            if (bankAccount.getAccountBalance() > amount) {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bankAccount.setAccountBalance(bankAccount.getAccountBalance() - amount);
                bankAccount.notifyAll();
                System.out.println("The account balance after debit is " + bankAccount.getAccountBalance());
            } else {
                System.out.println("Sorry !! There's not enough balance");
            }
        }
    }


    @Override
    public void creditAccount(BankAccount bankAccount, Double amount) {
        synchronized (bankAccount) {
            System.out.println("The account balance before credit is " + bankAccount.getAccountBalance());
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bankAccount.setAccountBalance(bankAccount.getAccountBalance() + amount);
            bankAccount.notifyAll();
            System.out.println("The account balance after the credit is " + bankAccount.getAccountBalance());
        }
    }

    @Override
    public void checkBalance(BankAccount bankAccount) {
        synchronized (bankAccount) {
            try {
                Thread.sleep(1200);
                if (!Thread.holdsLock(bankAccount)) {
                    System.out.println("The account balance check has to wait because someone has a lock on the account");
                    bankAccount.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The account balance is " + bankAccount.getAccountBalance());
        }
    }

    @Override
    public void updateContactInfo(AccountHolder accountHolder) {
        //TODO: Update contact information of the account holder
    }


}
