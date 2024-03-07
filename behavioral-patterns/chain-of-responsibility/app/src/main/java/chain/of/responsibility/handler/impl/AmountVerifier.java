package chain.of.responsibility.handler.impl;

import chain.of.responsibility.handler.TransactionHandler;
import chain.of.responsibility.request.TransactionRequest;

import java.util.Objects;

public class AmountVerifier implements TransactionHandler {

    private TransactionHandler transactionHandler;

    @Override
    public void nextVerifier(TransactionHandler transactionHandler) {
        this.transactionHandler = transactionHandler;
    }

    @Override
    public void verify(TransactionRequest request) {
        if (request.amount() > 10000.0) {
            System.out.println("amount is higher than allowed.");
        }
        if (Objects.nonNull(transactionHandler)) {
            transactionHandler.verify(request);
        }
    }
}
