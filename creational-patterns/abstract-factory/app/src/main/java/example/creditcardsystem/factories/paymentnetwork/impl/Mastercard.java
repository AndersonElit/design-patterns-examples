package example.creditcardsystem.factories.paymentnetwork.impl;

import example.creditcardsystem.factories.paymentnetwork.PaymentNetworkType;

public class Mastercard implements PaymentNetworkType {
    @Override
    public String getName() {
        return "Mastercard";
    }
}
