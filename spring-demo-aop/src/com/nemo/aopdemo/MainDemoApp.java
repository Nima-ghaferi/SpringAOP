package com.nemo.aopdemo;

import com.nemo.aopdemo.dao.AccountDAO;
import com.nemo.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        Account account = new Account();
        account.setLevel("vip");
        account.setName("Nemo");
        accountDAO.addAccount(account);
        context.close();
    }
}
