package com.nemo.aopdemo;

import com.nemo.aopdemo.dao.AccountDAO;
import com.nemo.aopdemo.service.TrafficFortuneService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sound.midi.Soundbank;
import java.util.List;

public class MainAroundDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        TrafficFortuneService fortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);

        System.out.println("Main program Around demo app");
        System.out.println("Calling the fortune");
        String data = fortuneService.getFortune();

        System.out.println("fortune is:" + data);

        context.close();
        System.out.println("Done!");
    }
}
