package com.nemo.aopdemo.dao;

import com.nemo.aopdemo.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDAO {

    public void addAccount(Account account) {
        System.out.println(getClass() + ": Adding account");
    }

    public List<Account> findAccounts() {
        List<Account> accounts = new ArrayList<>();
        Account account = new Account("nemp", "vip");
        Account account1 = new Account("madu", "plat");
        Account account2 = new Account("luka", "gold");
        accounts.add(account);
        accounts.add(account1);
        accounts.add(account2);
        return accounts;
    }
}
