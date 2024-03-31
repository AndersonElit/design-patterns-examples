package strategy.paymentmethod.strategy.impl;

import strategy.paymentmethod.strategy.Strategy;

public class Paypal implements Strategy {

    private String email;

    public Paypal(String email) {
        this.email = email;
    }

    public Paypal() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("processing paypal payment of amount: " + amount);
    }
}
