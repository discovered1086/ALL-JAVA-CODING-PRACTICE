package com.kingshuk.multithreading.threadprogramming.threadingin2017.synchronization.bankcaccountimproved;

public class AccountManager implements Runnable {

    private ActionTypes actionType;
    private Double amount;
    private AccountHolder accountHolder;
    private AccountAction action;

    public AccountManager(ActionTypes actionType, Double amount, AccountHolder accountHolder) {
        this.actionType = actionType;
        this.amount = amount;
        this.accountHolder = accountHolder;
    }

    public ActionTypes getActionType() {
        return actionType;
    }

    public void setActionType(ActionTypes actionType) {
        this.actionType = actionType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(AccountHolder accountHolder) {
        this.accountHolder = accountHolder;
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        action = new AccountActionImpl();
        switch (actionType) {
            case DEBIT:
                System.out.println(accountHolder.getName() + " is trying to debit " + this.amount);
                action.debitAccount(this.accountHolder.getBankAccount(), this.amount);
                System.out.println(accountHolder.getName() + " has successfully debited " + amount +
                        " from account " + accountHolder.getBankAccount().getAccountNo());
                break;
            case CREDIT:
                System.out.println(accountHolder.getName() + " is trying to credit " + this.amount);
                action.creditAccount(this.accountHolder.getBankAccount(), this.amount);
                System.out.println(accountHolder.getName() + " has successfully credited " + amount +
                        " from account " + accountHolder.getBankAccount().getAccountNo());
                break;
            case CHECK_BALANCE:
                action.checkBalance(this.accountHolder.getBankAccount());
                break;
            default:
                action.updateContactInfo(this.accountHolder);

        }
    }
}
