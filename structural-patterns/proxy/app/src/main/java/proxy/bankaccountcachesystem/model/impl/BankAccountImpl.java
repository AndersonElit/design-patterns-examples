package proxy.bankaccountcachesystem.model.impl;

import proxy.bankaccountcachesystem.model.BankAccount;

public class BankAccountImpl implements BankAccount {

    private final Integer id;
    private final String accountNumber;
    private final Double balance;
    BankAccountImpl bankAccount;

    public BankAccountImpl(Integer id, String accountNumber, Double balance) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    @Override
    public BankAccountImpl getBankAccount() {
        return this.bankAccount;
    }

}
