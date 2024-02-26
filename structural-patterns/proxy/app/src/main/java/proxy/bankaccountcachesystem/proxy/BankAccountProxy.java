package proxy.bankaccountcachesystem.proxy;

import proxy.bankaccountcachesystem.dao.BankAccountDao;
import proxy.bankaccountcachesystem.model.BankAccount;
import proxy.bankaccountcachesystem.model.impl.BankAccountImpl;

import java.util.Objects;

public class BankAccountProxy implements BankAccount {
    BankAccountDao bankAccountDao;
    BankAccountImpl bankAccount;
    Integer id;

    public BankAccountProxy(Integer id) {
        this.id = id;
        this.bankAccountDao = new BankAccountDao();
    }

    @Override
    public BankAccountImpl getBankAccount() {

        if (Objects.isNull(bankAccount)) {
            this.bankAccount = bankAccountDao.findById(id);
            System.out.println("Object taken from the database.......");
        } else {
            System.out.println("Object taken from cache.......");
        }
        return bankAccount;
    }
}
