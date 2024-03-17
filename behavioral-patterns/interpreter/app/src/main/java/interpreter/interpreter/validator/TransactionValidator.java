package interpreter.interpreter.validator;

import interpreter.context.Transaction;
import interpreter.interpreter.Interpreter;

import java.util.ArrayList;
import java.util.List;

public class TransactionValidator implements Interpreter {
    private final List<Interpreter> interpreters;

    public TransactionValidator() {
        this.interpreters = new ArrayList<>();
    }

    public void addValidation(Interpreter interpreter) {
        interpreters.add(interpreter);
    }

    @Override
    public boolean interpret(Transaction transaction) {
        for (Interpreter interpreter : interpreters) {
            if (!interpreter.interpret(transaction)) {
                return false;
            }
        }
        return true;
    }
}
