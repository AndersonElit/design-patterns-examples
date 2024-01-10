package example.creditcardsystem;

import example.creditcardsystem.builder.CreditCardBuilder;
import example.creditcardsystem.model.CreditCard;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = CreditCardBuilder.createCreditCard("Standard", "Visa");
        System.out.println(
                "credit card type: " + creditCard.creditCardType().getCreditCardType()
                + "\n" +
                "payment network: " + creditCard.paymentNetworkType().getName()
        );
    }
}
