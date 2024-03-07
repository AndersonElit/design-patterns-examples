package chain.of.responsibility.handler.impl;

import chain.of.responsibility.handler.TransactionHandler;
import chain.of.responsibility.request.TransactionRequest;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AccountVerifier implements TransactionHandler {

    private TransactionHandler transactionHandler;
    private static Map<String, String> accounts = new HashMap<>();

    static {
        accounts.put("sender", "12345");
        accounts.put("recipient", "6789");
    }

    @Override
    public void nextVerifier(TransactionHandler transactionHandler) {
        this.transactionHandler = transactionHandler;
    }

    @Override
    public void verify(TransactionRequest request) {
        if (!request.senderAccount().equals(accounts.get("sender"))) {
            System.out.println("Incorrect sender account");
        }
        if (!request.recipientAccount().equals(accounts.get("recipient"))) {
            System.out.println("Incorrect recipient account");
        }
        if (Objects.nonNull(transactionHandler)) {
            transactionHandler.verify(request);
        }
    }
}
