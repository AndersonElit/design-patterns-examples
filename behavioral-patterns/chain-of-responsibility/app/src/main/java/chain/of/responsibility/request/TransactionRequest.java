package chain.of.responsibility.request;

import java.time.LocalDateTime;

public record TransactionRequest(String senderAccount, String recipientAccount, Double amount,
                                 LocalDateTime transactionDate) {
}
