package prototype.transactionproccess.impl;

import prototype.transactionproccess.Transaction;

import java.time.LocalDate;

public class BankTransaction implements Transaction {

    private final String senderBank;
    private final String recipientBank;
    private final Double amount;
    private final LocalDate date;
    private String state;

    public BankTransaction(String senderBank, String recipientBank, Double amount, LocalDate date, String state) {
        this.senderBank = senderBank;
        this.recipientBank = recipientBank;
        this.amount = amount;
        this.date = date;
        this.state = state;
    }

    @Override
    public Transaction clone() {
        return new BankTransaction(senderBank, recipientBank, amount, date, state);
    }

    @Override
    public void process(String state) {
        System.out.println(state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
