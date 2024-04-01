package template_method.credit_card.concrete;

import template_method.credit_card.template.CreditCard;

public class Gold extends CreditCard {
    @Override
    protected void calculateBalance() {
        System.out.println("calculate balance to Gold credit card......");
    }

    @Override
    protected void getTransactions() {
        System.out.println("Get transactions to Gold credit card......");
    }

    @Override
    protected String getCardType() {
        return "Gold.";
    }
}
