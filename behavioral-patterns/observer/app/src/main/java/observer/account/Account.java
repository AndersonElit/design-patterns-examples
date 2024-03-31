package observer.account;

import observer.observer.Observer;
import observer.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class Account implements Subject {

    private Double balance;
    private final List<Observer> observers = new ArrayList<>();

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
        notifyObs();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObs() {
        observers.forEach(Observer::update);
    }
}
