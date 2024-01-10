package example.creditcardsystem.factories.creditcardtype.impl;

import example.creditcardsystem.factories.creditcardtype.CreditCardType;

public class Gold implements CreditCardType {

    @Override
    public String getCreditCardType() {
        return "Gold";
    }

    @Override
    public int getCreditLimit() {
        return 100000;
    }

    @Override
    public String getAnnualFee() {
        return "20%";
    }

}
