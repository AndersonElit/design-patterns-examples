package state.account;

import state.state.State;
import state.state.impl.Active;

public class Account {
    private double balance;
    private State state;

    public Account() {
        this.state = new Active(this);
    }

    public void deposit(double amount) {
        state.deposit(amount);
    }

    public void withdraw(double amount) {
        state.withdraw(amount);
    }

    public void inactive() {
        state.inactive();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
