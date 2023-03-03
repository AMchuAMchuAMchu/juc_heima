package com.itcast.basic;

import java.util.concurrent.TimeUnit;

/**
 * Description ==> TODO
 * BelongsProject ==> juc_heima
 * BelongsPackage ==> com.itcast.basic
 * Version ==> 1.0
 * CreateTime ==> 2023-03-03 20:10:06
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class DeadLock {
    public static void main(String[] args) {

        Object o01 = new Object();
        Object o02 = new Object();

        new Thread(()->{
            synchronized (o01){
                System.out.println("AA...");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o02){
                    System.out.println("BB...");
                }
            }
        },"T1").start();

        new Thread(()->{
            synchronized (o02){
                System.out.println("CC...");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o01){
                    System.out.println("DD...");
                }
            }
        },"T2").start();
//
//        try {
//            TimeUnit.SECONDS.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


    }
}
