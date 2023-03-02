package com.itcast.basic;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;
import lombok.extern.slf4j.Slf4j;

/**
 * Description ==> TODO
 * BelongsProject ==> juc_heima
 * BelongsPackage ==> com.itcast.basic
 * Version ==> 1.0
 * CreateTime ==> 2023-03-02 21:10:47
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Slf4j(topic = "c.ThreadAppearence")
public class ThreadAppearence {


    public static void main(String[] args) {

        new Thread(()->{
            while (true){
                log.debug("阔你吃哇!");
            }
        },"T1").start();

        new Thread(()->{
            while (true){
                log.debug("阔你吃哇!");
            }
        },"T2").start();

    }

}
