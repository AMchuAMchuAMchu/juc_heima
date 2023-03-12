package com.itcast.basic;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j(topic = "c.test")
public class TestInterrupt1001 {


    public static void main(String[] args) {

        Thread t1 = new Thread(()->{

            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            log.debug("t1...");

        },"T1");

        t1.start();


        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        log.debug("main...");

        t1.interrupt();


    }

}
