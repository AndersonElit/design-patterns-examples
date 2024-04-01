package visitor.interestcalculator.calculator.impl;

import visitor.interestcalculator.calculator.InterestCalculator;
import visitor.interestcalculator.customer.Customer;

public class PremiumInterestCalculator implements InterestCalculator {

    private final double INTEREST = 0.1;

    @Override
    public void calculate(Customer customer) {
        System.out.println(INTEREST);
    }
}
