package com.nemo.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
    public void addAccount() {
        System.out.println(getClass() + ": Adding membership account");
    }

    public boolean addSilly() {
        System.out.println(getClass() + ": Adding silly account");
        return true;
    }
}
