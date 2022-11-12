package com.nemo.aopdemo.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Component
public class TrafficFortuneService {
    public String getFortune(boolean exc) throws InterruptedException {
        try {
            if (exc)
                throw new RuntimeException("Major accident!!!");
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
            throw e;
        }

        return "Expect heavy traffic this morning";
    }
}
