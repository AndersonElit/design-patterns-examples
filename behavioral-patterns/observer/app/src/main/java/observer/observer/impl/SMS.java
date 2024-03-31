package observer.observer.impl;

import observer.account.Account;
import observer.observer.Observer;

public class SMS implements Observer {

    private final Account account;

    public SMS(Account account) {
        this.account = account;
        this.account.register(this);
    }

    @Override
    public void update() {
        System.out.println("Message sent, Current balance: " + account.getBalance());
    }
}
