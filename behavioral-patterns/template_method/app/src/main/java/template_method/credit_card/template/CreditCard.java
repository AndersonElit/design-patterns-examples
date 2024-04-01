package template_method.credit_card.template;

public abstract class CreditCard {
    public final void generateHistoricData() {
        calculateBalance();
        getTransactions();
        System.out.println(getCardType());
    }

    protected abstract void calculateBalance();

    protected abstract void getTransactions();

    protected String getCardType() {
        return "Generic";
    }

}
