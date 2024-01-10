package example.creditcardsystem.builder;


import example.creditcardsystem.factories.creditcardtype.factory.CreditCardTypeFactory;
import example.creditcardsystem.factories.paymentnetwork.factory.PaymentNetworkTypeFactory;
import example.creditcardsystem.model.CreditCard;

public class CreditCardBuilder {

    public static CreditCard createCreditCard(String creditCardType, String paymentNetworkType) {
        CreditCardTypeFactory creditCardTypeFactory = () -> creditCardType;
        PaymentNetworkTypeFactory paymentNetworkTypeFactory = () -> paymentNetworkType;
        return new CreditCard(creditCardTypeFactory.getCreditCardType(), paymentNetworkTypeFactory.getPaymentNetworkType());
    }

}
