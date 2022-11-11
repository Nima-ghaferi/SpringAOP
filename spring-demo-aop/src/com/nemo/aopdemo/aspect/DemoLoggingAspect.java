package com.nemo.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {
    @Before("execution(boolean add*())")
    //@Before("execution(boolean add*(java.lang.String))")----match with specific arg type
    //@Before("execution(boolean add*())")-----match with no arg method
    //@Before("execution(boolean add*(*))")-----match with one arg with any type
    //@Before("execution(boolean add*(..))")-----match with any arg number with any types
    //@Before("execution(* com.nemo.aopdemo.dao.*.* (..))")//-----match with any method in a specific class


    public void beforeAddAccountAdvice() {
        System.out.println("\n=========> Executing @Before advice on addAccount()");
    }
}
