/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package prototype;

import prototype.transactionproccess.processor.TransactionProcessor;

public class App {

    public static void main(String[] args) {
        TransactionProcessor transactionProcessor = new TransactionProcessor("bank1", "bank2", 23.24);
        transactionProcessor.processTransaction("created");
        transactionProcessor.processTransaction("inProcess");
    }
}
