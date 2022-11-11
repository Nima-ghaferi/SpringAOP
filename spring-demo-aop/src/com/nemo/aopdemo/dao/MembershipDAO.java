package com.nemo.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
    public void addAccount() {
        System.out.println(getClass() + ": Adding membership account");
    }

    public void addSilly() {
        System.out.println(getClass() + ": Adding silly account");
    }
}
