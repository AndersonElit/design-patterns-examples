package state.state.impl;

import state.account.Account;
import state.state.State;

public class Inactive implements State {

    public Inactive(Account account) {
    }

    @Override
    public void deposit(double amount) {
        System.out.println("cannot deposit, account is closed.");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("cannot withdraw, account is closed.");
    }

    @Override
    public void inactive() {
        System.out.println("account is closed.");
    }
}
