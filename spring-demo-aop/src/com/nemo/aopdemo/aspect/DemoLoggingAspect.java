package com.nemo.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class DemoLoggingAspect {

    @Pointcut("execution(* add*())")
    private void allAddMethods() {}

    @Pointcut("execution(* com.nemo.aopdemo.dao.*.*())")
    private void allMethodsInDAOPackage() {}

    @Before("allAddMethods() && allMethodsInDAOPackage()")
    //@Before("execution(boolean add*(java.lang.String))")----match with specific arg type
    //@Before("execution(boolean add*())")-----match with no arg method
    //@Before("execution(boolean add*(*))")-----match with one arg with any type
    //@Before("execution(boolean add*(..))")-----match with any arg number with any types
    //@Before("execution(* com.nemo.aopdemo.dao.*.* (..))")//-----match with any method in a specific class
    public void beforeAddAccountAdvice(JoinPoint joinPoint) {
        System.out.println("\n=========> Executing @Before advice on addAccount()");
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method: " + methodSignature);
    }
}
