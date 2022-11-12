package com.nemo.aopdemo;

import com.nemo.aopdemo.service.TrafficFortuneService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAroundHandleExceptionDemoApp {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        TrafficFortuneService fortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);

        System.out.println("Main program Around demo app");
        System.out.println("Calling the fortune");
        String data = fortuneService.getFortune(true);

        System.out.println("fortune is:" + data);

        context.close();
        System.out.println("Done!");
    }
}
