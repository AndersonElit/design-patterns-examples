package facade.banksystem.facade;

import facade.banksystem.Account;
import facade.banksystem.Customer;

import java.util.UUID;

public class BankFacade {
    private Customer customer;
    private Account account;

    public BankFacade() {
    }

    public void createCustomer(String name, String celphone, String email) {
        this.customer = new Customer(name, celphone, email);
        this.account = new Account(UUID.randomUUID().toString(), 0.0f);
    }

    public String getCustomerInformation() {
        return this.customer.getCustomerInformation();
    }

    public String getAccountNumber() {
        return this.account.getAccountNumber();
    }

    public void deposit(Float amount) {
        this.account.deposit(amount);
    }

    public void withdraw(Float amount) {
        this.account.withdraw(amount);
    }

    public Float getBalance() {
        return this.account.getBalance();
    }

}
