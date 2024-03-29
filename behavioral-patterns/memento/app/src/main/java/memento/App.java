/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package memento;

import memento.transaction.caretaker.TransactionCaretaker;
import memento.transaction.states.TransactionStates;
import memento.transaction.transaction.Transaction;

public class App {

    public static void main(String[] args) {
        Transaction transaction = new Transaction();
        TransactionCaretaker caretaker = new TransactionCaretaker();

        transaction.setState(TransactionStates.STARTED);
        caretaker.setMemento(transaction.save());

        transaction.setState(TransactionStates.PROCESSING);
        caretaker.setMemento(transaction.save());

        transaction.setState(TransactionStates.REJECTED);

        System.out.println("current state: " + transaction.getState());
        transaction.restore(caretaker.getMemento());

        System.out.println("previous state: " + transaction.getState());

    }
}
