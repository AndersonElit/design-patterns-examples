package prototype.transactionproccess.processor;

import prototype.transactionproccess.Transaction;
import prototype.transactionproccess.impl.BankTransaction;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class TransactionProcessor {

    private final Map<String, Transaction> map = new HashMap<>();

    public TransactionProcessor(String senderBank, String recipientBank, Double amount) {
        BankTransaction bankTransaction = new BankTransaction(senderBank, recipientBank, amount, LocalDate.now(), "Created.");
        map.put("created", bankTransaction);
    }

    public void processTransaction(String transactionState) {
        if (transactionState.equals("created")) {
            BankTransaction transaction = (BankTransaction) map.get(transactionState).clone();
            transaction.setState("in process.");
            transaction.process(transaction.getState());
            map.put("inProcess", transaction);
        }

        if (transactionState.equals("inProcess")) {
            BankTransaction transaction = (BankTransaction) map.get(transactionState).clone();
            transaction.setState("processed.");
            transaction.process(transaction.getState());
            map.put("processed", transaction);
        }

    }

}
