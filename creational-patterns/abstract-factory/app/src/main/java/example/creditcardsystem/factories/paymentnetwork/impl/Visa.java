package example.creditcardsystem.factories.paymentnetwork.impl;

import example.creditcardsystem.factories.paymentnetwork.PaymentNetworkType;

public class Visa implements PaymentNetworkType {
    @Override
    public String getName() {
        return "Visa";
    }
}
