package interpreter.interpreter.impl;

import interpreter.context.Transaction;
import interpreter.interpreter.Interpreter;

public class MaxAmountInterpreter implements Interpreter {

    private final double maxAmount;

    public MaxAmountInterpreter(double maxAmount) {
        this.maxAmount = maxAmount;
    }

    @Override
    public boolean interpret(Transaction transaction) {
        return transaction.getAmount() <= this.maxAmount;
    }
}
