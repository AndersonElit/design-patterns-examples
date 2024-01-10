package example.creditcardsystem.model;

import example.creditcardsystem.factories.creditcardtype.CreditCardType;
import example.creditcardsystem.factories.paymentnetwork.PaymentNetworkType;

public record CreditCard(CreditCardType creditCardType, PaymentNetworkType paymentNetworkType) {
}
