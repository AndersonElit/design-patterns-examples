package command.command.impl;

import command.command.Command;
import command.model.Account;

public class DepositCommand implements Command {
    Account account;
    Double amount;

    public DepositCommand(Account account, Double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        amount = account.getAmount() + amount;
        account.setAmount(amount);
    }

    @Override
    public Double getBalance() {
        return amount;
    }
}
