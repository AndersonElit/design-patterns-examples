package visitor.interestcalculator.visitable;

import visitor.interestcalculator.calculator.InterestCalculator;

public interface Visitable {
    void accept(InterestCalculator interestCalculator);
}
