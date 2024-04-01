package template_method.credit_card.concrete;

import template_method.credit_card.template.CreditCard;

public class Silver extends CreditCard {
    @Override
    protected void calculateBalance() {
        System.out.println("calculate balance to Silver credit card......");
    }

    @Override
    protected void getTransactions() {
        System.out.println("Get transactions to Silver credit card......");
    }

    @Override
    protected String getCardType() {
        return "Silver.";
    }
}
