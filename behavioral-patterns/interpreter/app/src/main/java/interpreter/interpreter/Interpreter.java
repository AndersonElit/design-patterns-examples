package interpreter.interpreter;

import interpreter.context.Transaction;

public interface Interpreter {
    boolean interpret(Transaction transaction);
}
