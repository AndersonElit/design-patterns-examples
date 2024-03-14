package command.service;

import command.command.Command;

public class BankService {
    public void execute(Command command) {
        command.execute();
    }
}
