package singleton;

import java.util.Objects;

public class BankAccount {

    private static BankAccount bankAccount;

    private Double deposit;
    private Double withdraw;

    private BankAccount() {
    }

    public static BankAccount getInstance() {
        if (Objects.isNull(bankAccount)) {
            bankAccount = new BankAccount();
        }
        return bankAccount;
    }

    public void deposit(Double amount, String accountNumber) {
        this.deposit = amount;
        System.out.println(amount + " dollars was deposited to account " + accountNumber);
    }

    public void withdraw(Double amount, String accountNumber) {
        this.withdraw = amount;
        System.out.println(amount + " dollars was withdrawn to account " + accountNumber);
    }

    public Double getDeposit() {
        return deposit;
    }

    public Double getWithdraw() {
        return withdraw;
    }

}
