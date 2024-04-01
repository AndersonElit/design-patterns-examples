package visitor.interestcalculator.calculator.impl;

import visitor.interestcalculator.calculator.InterestCalculator;
import visitor.interestcalculator.customer.Customer;

public class RegularInterestCalculator implements InterestCalculator {

    private final double INTEREST = 0.2;

    @Override
    public void calculate(Customer customer) {
        System.out.println(INTEREST);
    }
}
