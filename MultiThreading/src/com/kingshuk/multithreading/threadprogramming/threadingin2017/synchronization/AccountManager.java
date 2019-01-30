package com.kingshuk.multithreading.threadprogramming.threadingin2017.synchronization;

/**
 * Created by kingshuk on 10/30/17.
 */
public class AccountManager {

    public synchronized void performBankActions(AccountHolder accountHolder, AccountAction accountAction) throws InterruptedException {
        BankAccount bankAccount=accountHolder.getBankAccount();
        if ("debit".equals(accountAction.getActionType())) {
            System.out.println(accountHolder.getName() + " is trying to debit " + accountAction.getAmount());
            System.out.println("The account balance before debit is " + bankAccount.getAccountBalance());
            if (bankAccount.getAccountBalance() > accountAction.getAmount()) {
                Thread.sleep(5000);
                bankAccount.setAccountBalance(bankAccount.getAccountBalance() - accountAction.getAmount());
                System.out.println(accountHolder.getName() + " has successfully debited " + accountAction.getAmount() + " from account " + accountHolder.getBankAccount().getAccountNo());
                System.out.println("The account balance after debit is " + bankAccount.getAccountBalance());
            } else {
                System.out.println("Sorry " + accountHolder.getName() + " !! There's not enough balance");
            }
        }


    }


}
