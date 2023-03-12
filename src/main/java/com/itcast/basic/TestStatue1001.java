package com.itcast.basic;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.test")
public class TestStatue1001 {

    public static void main(String[] args) {


        Thread t1 = new Thread(()->{
            System.out.println("t1...");
        },"T1");

        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());

    }

}
