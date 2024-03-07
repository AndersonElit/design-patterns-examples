package chain.of.responsibility.handler;

import chain.of.responsibility.request.TransactionRequest;

public interface TransactionHandler {
    void nextVerifier(TransactionHandler transactionHandler);
    void verify(TransactionRequest request);
}
