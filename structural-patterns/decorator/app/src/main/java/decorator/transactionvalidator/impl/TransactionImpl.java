package decorator.transactionvalidator.impl;

import decorator.transactionvalidator.Transaction;

public class TransactionImpl implements Transaction {

    private String sender;
    private String recipient;
    private double amount;

    public TransactionImpl(String sender, String recipient, double amount) {
        this.sender = sender;
        this.recipient = recipient;
        this.amount = amount;
    }

    @Override
    public void proccess() {
        System.out.println("Proccessing transaction.");
    }

    @Override
    public double getAmount() {
        return amount;
    }

}
