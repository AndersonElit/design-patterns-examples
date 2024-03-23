package memento.transaction.memento;

import memento.transaction.states.TransactionStates;

public class TransactionMemento {
    private final TransactionStates state;

    public TransactionMemento(TransactionStates state) {
        this.state = state;
    }

    public TransactionStates getState() {
        return state;
    }
}
