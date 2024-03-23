package memento.transaction.transaction;

import memento.transaction.memento.TransactionMemento;
import memento.transaction.states.TransactionStates;

public class Transaction {
    private TransactionStates state;

    public void setState(TransactionStates state) {
        this.state = state;
    }

    public TransactionStates getState() {
        return state;
    }

    public TransactionMemento save() {
        return new TransactionMemento(state);
    }

    public void restore(TransactionMemento memento) {
        this.state = memento.getState();
    }

}
