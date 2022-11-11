package com.nemo.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class DemoBlahBlahAspect {

    @Before("execution(boolean add*(..))")
    public void beforeLogBlahBlah() {
        System.out.println("\n=========> Executing @Before advice()");
    }
}
