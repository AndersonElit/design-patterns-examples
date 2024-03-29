/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package decorator;

import decorator.transactionvalidator.Transaction;
import decorator.transactionvalidator.decorator.concrete.ConcreteTransactionValidator;
import decorator.transactionvalidator.impl.TransactionImpl;

public class App {

    public static void main(String[] args) {
        Transaction transaction = new TransactionImpl("sender", "recipient", 20000.0);
        Transaction validateTransaction = new ConcreteTransactionValidator(transaction);
        validateTransaction.proccess();
    }
}
