package decorator.transactionvalidator.decorator;

import decorator.transactionvalidator.Transaction;

public abstract class TransactionValidator implements Transaction {

    protected final Transaction transaction;

    public TransactionValidator(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public void proccess() {
        validate();
        transaction.proccess();
    }

    private void validate() {
        if (getAmount() >= 10000.0) {
            throw new RuntimeException("Invalid transaction");
        }
    }

    public abstract double getAmount();

}
