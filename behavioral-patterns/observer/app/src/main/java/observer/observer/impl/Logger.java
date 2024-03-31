package observer.observer.impl;

import observer.account.Account;
import observer.observer.Observer;

public class Logger implements Observer {

    private final Account account;

    public Logger(Account account) {
        this.account = account;
        this.account.register(this);
    }

    @Override
    public void update() {
        System.out.println("Current balance log: " + account.getBalance());
    }

}
