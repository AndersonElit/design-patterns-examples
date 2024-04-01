package visitor.interestcalculator.visitable.impl;

import visitor.interestcalculator.calculator.InterestCalculator;
import visitor.interestcalculator.customer.Customer;
import visitor.interestcalculator.customer.impl.Premium;
import visitor.interestcalculator.customer.impl.Regular;
import visitor.interestcalculator.visitable.Visitable;

public class CreditCard implements Visitable {

    private final Customer customer;

    public CreditCard(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void accept(InterestCalculator interestCalculator) {
        if (customer instanceof Premium) {
            interestCalculator.calculate(customer);
        }
        if (customer instanceof Regular) {
            interestCalculator.calculate(customer);
        }
    }
}
