package interpreter.interpreter.impl;

import interpreter.context.Transaction;
import interpreter.interpreter.Interpreter;

public class MinAmountInterpreter implements Interpreter {

    private final double minAmount;

    public MinAmountInterpreter(double minAmount) {
        this.minAmount = minAmount;
    }

    @Override
    public boolean interpret(Transaction transaction) {
        return transaction.getAmount() >= this.minAmount;
    }
}
