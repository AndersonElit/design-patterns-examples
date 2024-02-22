package facade.banksystem;

public class Account {

    private String accountNumber;
    private Float funds;

    public Account(String accountNumber, Float funds) {
        this.accountNumber = accountNumber;
        this.funds = funds;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public Float getBalance() {
        return this.funds;
    }

    public void deposit(Float amount) {
        this.funds = funds + amount;
    }

    public void withdraw(Float amount) {
        if (amount < funds) {
            this.funds = funds - amount;
        }
    }

}
