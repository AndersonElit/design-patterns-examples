package strategy.paymentmethod.context;

import strategy.paymentmethod.strategy.Strategy;
import strategy.paymentmethod.strategy.impl.CreditCard;
import strategy.paymentmethod.strategy.impl.Paypal;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Context {

    private final Strategy strategy;
    private static final Map<String, Strategy> paymentMethods = new HashMap<>();

    static {
        paymentMethods.put("CREDIT_CARD", new CreditCard());
        paymentMethods.put("PAYPAL", new Paypal());
    }

    public Context(String method) {
        this.strategy = Optional.ofNullable(paymentMethods.get(method))
                .orElseThrow(() -> new RuntimeException("payment method not supported."));
    }

    public void proccess(double amount) {
        strategy.pay(amount);
    }

}
