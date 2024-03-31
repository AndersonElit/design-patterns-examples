package strategy.paymentmethod.strategy.impl;

import strategy.paymentmethod.strategy.Strategy;

import java.time.LocalDate;

public class CreditCard implements Strategy {
    private String cardNumber;
    private LocalDate expirationDate;
    private String cvv;

    public CreditCard(String cardNumber, LocalDate expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    public CreditCard() {
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {
        System.out.println("processing credit card payment of amount: " + amount);
    }
}
