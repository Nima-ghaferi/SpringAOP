package com.nemo.aopdemo.aspect;

import com.nemo.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.accessibility.AccessibleAction;
import java.util.Arrays;
import java.util.List;

@Aspect
@Component
@Order(2)
public class DemoLoggingAspect {

    @Pointcut("execution(* add*())")
    private void allAddMethods() {
    }

    @Pointcut("execution(* com.nemo.aopdemo.dao.*.*())")
    private void allMethodsInDAOPackage() {
    }

    //@Before("allAddMethods() && allMethodsInDAOPackage()")
    //@Before("execution(boolean add*(java.lang.String))")----match with specific arg type
    //@Before("execution(boolean add*())")-----match with no arg method
    //@Before("execution(boolean add*(*))")-----match with one arg with any type
    //@Before("execution(boolean add*(..))")-----match with any arg number with any types
    //@Before("execution(* com.nemo.aopdemo.dao.*.* (..))")//-----match with any method in a specific class
    @Before("execution(void addAccount(com.nemo.aopdemo.Account))")
    public void beforeAddAccountAdvice(JoinPoint joinPoint) {
        System.out.println("\n=========> Executing @Before advice on addAccount()");
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method: " + methodSignature);

        Object[] args = joinPoint.getArgs();
        Arrays.stream(args).forEach(arg -> {
            if (arg instanceof Account) {
                Account temp = (Account) arg;
                System.out.println("AccountName: " + temp.getName());
                System.out.println("AccountLevel: " + temp.getLevel());
            }
        });
    }


    @AfterReturning(pointcut = "execution(* com.nemo.aopdemo.dao.AccountDAO.findAccounts(..))", returning = "result")
    public void afterReturningFindAccountAdvise(JoinPoint joinPoint, List<Account> result) {
        String method = joinPoint.getSignature().toShortString();
        System.out.println("\n=========> @AfterReturning advice on " + method);
        System.out.println("\n=========> the result: " + result);

    }
}
