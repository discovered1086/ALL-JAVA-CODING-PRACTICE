package com.kingshuk.multithreading.threadprogramming.threadingin2017.synchronization.bankaccountexample;

/**
 * Created by kingshuk on 10/30/17.
 */
public class AccountAction {

    private String actionType;
    private Double amount;

    public AccountAction(String actionType, Double amount) {
        this.actionType = actionType;
        this.amount = amount;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
