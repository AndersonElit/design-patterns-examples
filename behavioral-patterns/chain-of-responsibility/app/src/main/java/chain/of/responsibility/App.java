/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package chain.of.responsibility;

import chain.of.responsibility.handler.impl.AccountVerifier;
import chain.of.responsibility.handler.impl.AmountVerifier;
import chain.of.responsibility.request.TransactionRequest;

import java.time.LocalDateTime;

public class App {

    public static void main(String[] args) {
        AccountVerifier accountVerifier = new AccountVerifier();
        AmountVerifier amountVerifier = new AmountVerifier();
        TransactionRequest request = new TransactionRequest("12346", "6780", 20000.0, LocalDateTime.now());
        accountVerifier.nextVerifier(amountVerifier);
        accountVerifier.verify(request);
    }
}