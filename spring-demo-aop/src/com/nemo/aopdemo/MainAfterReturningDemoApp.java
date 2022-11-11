package com.nemo.aopdemo;

import com.nemo.aopdemo.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sound.midi.Soundbank;
import java.util.List;

public class MainAfterReturningDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        List<Account> accountList = accountDAO.findAccounts();
        System.out.println("\n\nmain program: MainAfterReturningDemoApp");
        System.out.println("------------------");
        System.out.println(accountList);

        context.close();
    }
}
