package state.state.impl;

import state.account.Account;
import state.state.State;

public class Active implements State {

    private final Account account;

    public Active(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println(amount + " deposited, balance: " + account.getBalance());
    }

    @Override
    public void withdraw(double amount) {
        account.setBalance(account.getBalance() - amount);
        System.out.println(amount + " withdraw, balance: " + account.getBalance());
    }

    @Override
    public void inactive() {
        System.out.println("Inactive account......");
        account.setState(new Inactive(account));
    }
}
