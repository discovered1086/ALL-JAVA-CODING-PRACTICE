package com.kingshuk.multithreading.threadprogramming.threadingin2017.synchronization.bankcaccountimproved;

/**
 * Created by kingshuk on 10/30/17.
 */
public class BankAccount {

    private Integer accountNo;
    private String accountType;
    private Double accountBalance;

    public BankAccount(Integer accountNo, String accountType, Double accountBalance) {
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public Integer getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Integer accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
