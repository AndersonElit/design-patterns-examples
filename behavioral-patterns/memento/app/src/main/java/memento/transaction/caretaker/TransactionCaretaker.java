package memento.transaction.caretaker;

import memento.transaction.memento.TransactionMemento;

public class TransactionCaretaker {

    private TransactionMemento memento;

    public TransactionMemento getMemento() {
        return memento;
    }

    public void setMemento(TransactionMemento memento) {
        this.memento = memento;
    }

}
