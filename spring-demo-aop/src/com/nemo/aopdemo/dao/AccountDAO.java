package com.nemo.aopdemo.dao;

import com.nemo.aopdemo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount(Account account) {
        System.out.println(getClass() + ": Adding account");
    }
}
