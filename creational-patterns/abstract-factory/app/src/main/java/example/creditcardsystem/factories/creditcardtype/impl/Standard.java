package example.creditcardsystem.factories.creditcardtype.impl;

import example.creditcardsystem.factories.creditcardtype.CreditCardType;

public class Standard implements CreditCardType {

    @Override
    public String getCreditCardType() {
        return "Standard";
    }

    @Override
    public int getCreditLimit() {
        return 1000;
    }

    @Override
    public String getAnnualFee() {
        return "30%";
    }

}
