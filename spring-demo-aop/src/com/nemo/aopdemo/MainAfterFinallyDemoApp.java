package com.nemo.aopdemo;

import com.nemo.aopdemo.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainAfterFinallyDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        List<Account> accountList = null;

        try {
            accountList = accountDAO.findAccounts();
        } catch (Exception e) {
            System.out.println("EXCEPTION!!!!!" + e);
        }
        System.out.println("\n\nmain program: MainAfterThrowingDemoApp");
        System.out.println("------------------");
        System.out.println(accountList);

        context.close();
    }
}
