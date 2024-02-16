package decorator.transactionvalidator.decorator.concrete;

import decorator.transactionvalidator.Transaction;
import decorator.transactionvalidator.decorator.TransactionValidator;

public class ConcreteTransactionValidator extends TransactionValidator {

    public ConcreteTransactionValidator(Transaction transaction) {
        super(transaction);
    }

    @Override
    public double getAmount() {
        return transaction.getAmount();
    }

}
