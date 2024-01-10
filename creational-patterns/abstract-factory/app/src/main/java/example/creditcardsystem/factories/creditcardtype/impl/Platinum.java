package example.creditcardsystem.factories.creditcardtype.impl;

import example.creditcardsystem.factories.creditcardtype.CreditCardType;

public class Platinum implements CreditCardType {

    @Override
    public String getCreditCardType() {
        return "Platinum";
    }

    @Override
    public int getCreditLimit() {
        return 10000;
    }

    @Override
    public String getAnnualFee() {
        return "25%";
    }

}
